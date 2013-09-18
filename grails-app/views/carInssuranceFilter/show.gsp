
<%@ page import="smileydemo.CarInssuranceFilter" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'carInssuranceFilter.label', default: 'CarInssuranceFilter')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-carInssuranceFilter" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-carInssuranceFilter" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list carInssuranceFilter">
			
				<g:if test="${carInssuranceFilterInstance?.carYear}">
				<li class="fieldcontain">
					<span id="carYear-label" class="property-label"><g:message code="carInssuranceFilter.carYear.label" default="Car Year" /></span>
					
						<span class="property-value" aria-labelledby="carYear-label"><g:fieldValue bean="${carInssuranceFilterInstance}" field="carYear"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${carInssuranceFilterInstance?.carBrand}">
				<li class="fieldcontain">
					<span id="carBrand-label" class="property-label"><g:message code="carInssuranceFilter.carBrand.label" default="Car Brand" /></span>
					
						<span class="property-value" aria-labelledby="carBrand-label"><g:link controller="carBrand" action="show" id="${carInssuranceFilterInstance?.carBrand?.id}">${carInssuranceFilterInstance?.carBrand?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${carInssuranceFilterInstance?.carModel}">
				<li class="fieldcontain">
					<span id="carModel-label" class="property-label"><g:message code="carInssuranceFilter.carModel.label" default="Car Model" /></span>
					
						<span class="property-value" aria-labelledby="carModel-label"><g:link controller="carModel" action="show" id="${carInssuranceFilterInstance?.carModel?.id}">${carInssuranceFilterInstance?.carModel?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${carInssuranceFilterInstance?.id}" />
					<g:link class="edit" action="edit" id="${carInssuranceFilterInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
