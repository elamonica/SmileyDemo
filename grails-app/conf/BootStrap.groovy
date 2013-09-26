import smileydemo.CarBrand
import smileydemo.CarModel
import smileydemo.Pregunta
import smileydemo.RespuestaPosible;

class BootStrap {

    def init = { servletContext ->
		
	    def possibleAnswerAlta = new RespuestaPosible(description: "Alta")
	    possibleAnswerAlta.save(flush:true)
	    def possibleAnswerBaja = new RespuestaPosible(description: "Baja")
	    possibleAnswerBaja.save(flush:true)
	    def possibleAnswerConLimite = new RespuestaPosible(description: "Con limite")
	    possibleAnswerConLimite.save(flush:true)
	    def possibleAnswerSinLimite = new RespuestaPosible(description: "Sin limite")
	    possibleAnswerSinLimite.save(flush:true)
	    def possibleAnswerSi = new RespuestaPosible(description: "Si")
	    possibleAnswerSi.save(flush:true)
	    def possibleAnswerNo = new RespuestaPosible(description: "No")
	    possibleAnswerNo.save(flush:true)
		
		def preg1 = new Pregunta(question: "¿Cobertura contra terceros?", position: 1, possibleAnswers: [possibleAnswerAlta, possibleAnswerBaja])
		preg1.save(flush:true)
		def preg2 = new Pregunta(question: "¿Robo total?", position: 2, possibleAnswers: [possibleAnswerAlta, possibleAnswerBaja])
		preg2.save(flush:true)
		def preg3 = new Pregunta(question: "¿Incendio total?", position: 3, possibleAnswers: [possibleAnswerAlta, possibleAnswerBaja])
		preg3.save(flush:true)
		def preg4 = new Pregunta(question: "¿Destrucción total?", position: 4, possibleAnswers: [possibleAnswerAlta, possibleAnswerBaja])
		preg4.save(flush:true)
		def preg5 = new Pregunta(question: "¿Sin límites de cobertura?", position: 5, possibleAnswers: [possibleAnswerSinLimite, possibleAnswerConLimite])
		preg5.save(flush:true)
		def preg6 = new Pregunta(question: "¿Cobertura contra granizo?", position: 6, possibleAnswers: [possibleAnswerSi, possibleAnswerNo])
		preg6.save(flush:true)
		def preg7 = new Pregunta(question: "¿Es para vos importante la solvencia de la compañia?", position: 7, possibleAnswers: [possibleAnswerSi, possibleAnswerNo])
		preg7.save(flush:true)
		def preg8 = new Pregunta(question: "¿Buscás que la compañia te preste un auto hasta que el tuyo sea reparado?", position: 8, possibleAnswers: [possibleAnswerSi, possibleAnswerNo])
		preg8.save(flush:true)
		def preg9 = new Pregunta(question: "¿Buscás que el seguro tenga cobertura en países limítrofes?", position: 9, possibleAnswers: [possibleAnswerSi, possibleAnswerNo])
		preg9.save(flush:true)
		def preg10 = new Pregunta(question: "¿Buscás que cubra urgencias mecánicas y el servicio de grúa?", position: 10, possibleAnswers: [possibleAnswerSi, possibleAnswerNo])
		preg10.save(flush:true)
		def preg11 = new Pregunta(question: "¿Querés evitar tener que presentar presupuestos y aportar fotos del sinietro?", position: 11, possibleAnswers: [possibleAnswerSi, possibleAnswerNo])
		preg11.save(flush:true)
		def preg12 = new Pregunta(question: "¿Qué prioridad tiene el tiempo de pago de los siniestros?", position: 12, possibleAnswers: [possibleAnswerAlta, possibleAnswerBaja])
		preg12.save(flush:true)
		def preg13 = new Pregunta(question: "¿Buscás que tu seguro incluya cobertura adicional en gastos médicos por accidentes?", position: 13, possibleAnswers: [possibleAnswerSi, possibleAnswerNo])
		preg13.save(flush:true)
		
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
		
		// crear polizas. Unas 10 aprox
		
		// crear funcion que busque entre las polizas
		
		// crear funcion que compare las polizas
		
		// hacer diseno de pag de polizas
		
		// pedir mail antes de mandar el resultado de la consulta?
		
			// mandar el mail con link al resultado de la busqueda
		
		// simular webservices?
		
		// contratar server y probar deploy 
		
		// mejor ui
    }
    def destroy = {
    }
}
