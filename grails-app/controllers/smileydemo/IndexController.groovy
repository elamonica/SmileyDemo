package smileydemo

class IndexController {

    def index() { }
	
	def signIn() {
		def emailAddress = params.email
		def pwd = params.pwd
		
		render (view:'indexXXX.gsp', model:[email: 'OK!'])
	}
}
