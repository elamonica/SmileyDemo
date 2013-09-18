package smileydemo

class CarInssuranceFilter {

	String carYear
	
	CarBrand carBrand
	
	CarModel carModel
	
    static constraints = {
		carYear inList: ['1990','1991','1992','1993','1994','1995','1996','1997','1998','1999','2000']
    }
}
