<%@ page import="smileydemo.Pregunta" %>

	<g:formRemote name="questionForm" url="[controller:'indexXXX', action:'answerAndNextQuestion']" update="preferences" >
       <div id="questionName" >
		<h3> ${question.question} </h3>
	   </div>
	   <g:hiddenField name="questionNumber" value="${question.position}" />
	   <div>
	   <select name="anAnswerId" size="2" id="anAnswerId" style="height: 53px; width:100%; border-radius: 8px; background-color: transparent; border-color: transparent;">
		<g:each in="${question.possibleAnswers }" var="answer">
			<option value="${answer.id }" style="background-color: whitesmoke; color:black;" selected="selected" >${answer}</option>
		</g:each>
	   </select>
	   </div>
       <div>
       		<g:submitButton name="Next" class="btn btn-primary btn-lg" />
	   </div>
	</g:formRemote>