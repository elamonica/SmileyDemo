package smileydemo



import org.junit.*
import grails.test.mixin.*

@TestFor(CarInssuranceFilterController)
@Mock(CarInssuranceFilter)
class CarInssuranceFilterControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/carInssuranceFilter/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.carInssuranceFilterInstanceList.size() == 0
        assert model.carInssuranceFilterInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.carInssuranceFilterInstance != null
    }

    void testSave() {
        controller.save()

        assert model.carInssuranceFilterInstance != null
        assert view == '/carInssuranceFilter/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/carInssuranceFilter/show/1'
        assert controller.flash.message != null
        assert CarInssuranceFilter.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/carInssuranceFilter/list'

        populateValidParams(params)
        def carInssuranceFilter = new CarInssuranceFilter(params)

        assert carInssuranceFilter.save() != null

        params.id = carInssuranceFilter.id

        def model = controller.show()

        assert model.carInssuranceFilterInstance == carInssuranceFilter
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/carInssuranceFilter/list'

        populateValidParams(params)
        def carInssuranceFilter = new CarInssuranceFilter(params)

        assert carInssuranceFilter.save() != null

        params.id = carInssuranceFilter.id

        def model = controller.edit()

        assert model.carInssuranceFilterInstance == carInssuranceFilter
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/carInssuranceFilter/list'

        response.reset()

        populateValidParams(params)
        def carInssuranceFilter = new CarInssuranceFilter(params)

        assert carInssuranceFilter.save() != null

        // test invalid parameters in update
        params.id = carInssuranceFilter.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/carInssuranceFilter/edit"
        assert model.carInssuranceFilterInstance != null

        carInssuranceFilter.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/carInssuranceFilter/show/$carInssuranceFilter.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        carInssuranceFilter.clearErrors()

        populateValidParams(params)
        params.id = carInssuranceFilter.id
        params.version = -1
        controller.update()

        assert view == "/carInssuranceFilter/edit"
        assert model.carInssuranceFilterInstance != null
        assert model.carInssuranceFilterInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/carInssuranceFilter/list'

        response.reset()

        populateValidParams(params)
        def carInssuranceFilter = new CarInssuranceFilter(params)

        assert carInssuranceFilter.save() != null
        assert CarInssuranceFilter.count() == 1

        params.id = carInssuranceFilter.id

        controller.delete()

        assert CarInssuranceFilter.count() == 0
        assert CarInssuranceFilter.get(carInssuranceFilter.id) == null
        assert response.redirectedUrl == '/carInssuranceFilter/list'
    }
}
