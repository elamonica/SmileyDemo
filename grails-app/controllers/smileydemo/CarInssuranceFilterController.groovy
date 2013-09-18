package smileydemo

import org.springframework.dao.DataIntegrityViolationException

class CarInssuranceFilterController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [carInssuranceFilterInstanceList: CarInssuranceFilter.list(params), carInssuranceFilterInstanceTotal: CarInssuranceFilter.count()]
    }

    def create() {
        [carInssuranceFilterInstance: new CarInssuranceFilter(params)]
    }

    def save() {
        def carInssuranceFilterInstance = new CarInssuranceFilter(params)
        if (!carInssuranceFilterInstance.save(flush: true)) {
            render(view: "create", model: [carInssuranceFilterInstance: carInssuranceFilterInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'carInssuranceFilter.label', default: 'CarInssuranceFilter'), carInssuranceFilterInstance.id])
        redirect(action: "show", id: carInssuranceFilterInstance.id)
    }

    def show(Long id) {
        def carInssuranceFilterInstance = CarInssuranceFilter.get(id)
        if (!carInssuranceFilterInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'carInssuranceFilter.label', default: 'CarInssuranceFilter'), id])
            redirect(action: "list")
            return
        }

        [carInssuranceFilterInstance: carInssuranceFilterInstance]
    }

    def edit(Long id) {
        def carInssuranceFilterInstance = CarInssuranceFilter.get(id)
        if (!carInssuranceFilterInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'carInssuranceFilter.label', default: 'CarInssuranceFilter'), id])
            redirect(action: "list")
            return
        }

        [carInssuranceFilterInstance: carInssuranceFilterInstance]
    }

    def update(Long id, Long version) {
        def carInssuranceFilterInstance = CarInssuranceFilter.get(id)
        if (!carInssuranceFilterInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'carInssuranceFilter.label', default: 'CarInssuranceFilter'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (carInssuranceFilterInstance.version > version) {
                carInssuranceFilterInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'carInssuranceFilter.label', default: 'CarInssuranceFilter')] as Object[],
                          "Another user has updated this CarInssuranceFilter while you were editing")
                render(view: "edit", model: [carInssuranceFilterInstance: carInssuranceFilterInstance])
                return
            }
        }

        carInssuranceFilterInstance.properties = params

        if (!carInssuranceFilterInstance.save(flush: true)) {
            render(view: "edit", model: [carInssuranceFilterInstance: carInssuranceFilterInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'carInssuranceFilter.label', default: 'CarInssuranceFilter'), carInssuranceFilterInstance.id])
        redirect(action: "show", id: carInssuranceFilterInstance.id)
    }

    def delete(Long id) {
        def carInssuranceFilterInstance = CarInssuranceFilter.get(id)
        if (!carInssuranceFilterInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'carInssuranceFilter.label', default: 'CarInssuranceFilter'), id])
            redirect(action: "list")
            return
        }

        try {
            carInssuranceFilterInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'carInssuranceFilter.label', default: 'CarInssuranceFilter'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'carInssuranceFilter.label', default: 'CarInssuranceFilter'), id])
            redirect(action: "show", id: id)
        }
    }
}
