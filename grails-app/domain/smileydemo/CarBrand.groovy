package smileydemo

class CarBrand {

	String name
	
	static hasMany= [models: CarModel]
	
    static constraints = {
    }
	
	public String toString(){
		return name
	}
}
