package smileydemo;

class RespuestaPosible {
	String description
	
	static hasMany = [questions: Pregunta]
	static belongsTo = Pregunta
	
	public String toString() { return description }
}
