import smileydemo.CarBrand
import smileydemo.CarModel

class BootStrap {

    def init = { servletContext ->
		def porshe = new CarBrand()
		porshe.name = "Porshe"
		porshe.models = new HashSet()
		porshe.save(flush:true)
		def bmw = new CarBrand()
		bmw.name = "BMW"
		bmw.models = new HashSet()
		bmw.save(flush:true)
		def ferrari = new CarBrand()
		ferrari.name = "Ferrari"
		ferrari.models = new HashSet()
		ferrari.save(flush:true)
		
		def carrera = new CarModel()
		carrera.name = "Carrera"
		carrera.carBrand = porshe
		carrera.save(flush: true)
		
		def testaRossa = new CarModel()
		testaRossa.name = "Testa Rossa"
		testaRossa.carBrand = ferrari
		testaRossa.save(flush: true)
		
		
		
    }
    def destroy = {
    }
}
