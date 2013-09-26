package smileydemo;

class Pregunta {
	
	String question
	
	int position 
	
	static hasMany = [possibleAnswers: RespuestaPosible]
	
	public String toString() { return question }
} 
