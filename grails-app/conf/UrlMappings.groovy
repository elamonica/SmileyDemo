import org.springframework.stereotype.Controller;

class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}


		"/"(view:"indexXXX")
		"500"(view:'/error')
		"400"(view:'/404.html')
	}
}
