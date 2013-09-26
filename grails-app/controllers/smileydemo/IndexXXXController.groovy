package smileydemo

import grails.converters.JSON
import grails.plugin.asyncmail.AsynchronousMailService
import grails.plugin.mail.MailService


class IndexXXXController {

	MailService mailService
	
    def index() { 
		
		render (view: 'indexXXX.gsp', model:[carInssuranceFilterInstance: new CarInssuranceFilter()])
	}
	
	def submitCar(String carYear, int carBrand, int carModel){
		//def aCarBrand = CarBrand.getById(carBrand)
		//def aCarModel = CarModel.getById(carModel)
		
		session["carYear"] = carYear
		session["carModelId"] = carModel
		session["carBrandId"] = carBrand
		
		def firstQuestion = Pregunta.first()
		
		render (template: "question", model:[question: firstQuestion])
	}
	
	def signIn() {
		def emailAddress = params.email
		def pwd = params.pwd
		

		mailService.sendMail  {
			to emailAddress
			subject "test smarty"
			body 'Yesss! Boludo!!!'
			beginDate new Date(System.currentTimeMillis()+60000)
			delete true
			immediate true
			priority 10	
		}
		
		render (view: 'indexXXX.gsp')
	}
	
	def procAnswer(){
		def q = params.question
		def qNumber = params.i
	}
	
	def answerAndNextQuestion(int anAnswerId, int questionNumber){
		def position = questionNumber
		def answer = anAnswerId
		
		def question = Pregunta.findByPosition(position)
		def possibleAnswer = RespuestaPosible.findById(answer)
		
		def preferences = session["preferences"]
		
		if (preferences == null){ preferences = new LinkedList<Preferencia>() }
		
		preferences.add( new Preferencia(question: question, answer: possibleAnswer) )
		session["preferences"] = preferences
		
		def nextQuestion = Pregunta.findByPosition(position+1)
		
		if (nextQuestion == null){
			// pasar a la comparativa
		}
		
		render (template: "question", model:[question: nextQuestion])
	}
	
	def ajaxSavePreferenceAndNextQuestion = {
		// poner el codigo tambien
		def position = params.position
		def answer = params.answer 
		
		def question = Pregunta.findByPosition(position)
		def possibleAnswer = RespuestaPosible.findById(answer)
		
		def preferences = session["preferences"]
		
		if (preferences == null)
			preferences = new LinkedList<Preferencia>()
		
		preferences.add( new Preferencia(question: question, answer: possibleAnswer) )
		session["preferences"] = preferences
		
		
		def nextQuestion = Pregunta.findByPosition(position+1)
		
		render nextQuestion as JSON
	}
}
