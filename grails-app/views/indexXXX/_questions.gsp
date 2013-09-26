<%@ page import="smileydemo.Pregunta" %>
<div>
	<div>
		${q.question}
	</div>
	<div>
		<g:select name="possibleAnswers" from="${q.possibleAnswers}" optionKey="id" size="2" />
	</div>
</div>