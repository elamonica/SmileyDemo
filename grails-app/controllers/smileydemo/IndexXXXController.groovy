package smileydemo

import grails.plugin.asyncmail.AsynchronousMailService
import grails.plugin.mail.MailService


class IndexXXXController {

	MailService mailService
	
    def index() { 
		render (view: 'indexXXX.gsp', model:[carInssuranceFilterInstance: new CarInssuranceFilter()])
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
}
