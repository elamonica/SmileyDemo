<%@ page import="smileydemo.CarInssuranceFilter" %>



<div class="fieldcontain ${hasErrors(bean: carInssuranceFilterInstance, field: 'carYear', 'error')} ">
	<label for="carYear">
		<g:message code="carInssuranceFilter.carYear.label" default="Car Year" />
		
	</label>
	<g:select class="dropdown" name="carYear" from="${carInssuranceFilterInstance.constraints.carYear.inList}" value="${carInssuranceFilterInstance?.carYear}" valueMessagePrefix="carInssuranceFilter.carYear" noSelection="['': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: carInssuranceFilterInstance, field: 'carBrand', 'error')} required">
	<label for="carBrand">
		<g:message code="carInssuranceFilter.carBrand.label" default="Brand" />
		<span class="required-indicator">*</span>
	</label>
	<g:select class="dropdown" id="carBrand" name="carBrand.id" from="${smileydemo.CarBrand.list()}" optionKey="id" required="" value="${carInssuranceFilterInstance?.carBrand?.id}" class="many-to-one"
		onchange="${remoteFunction(
			controller: 'carBrand',
			action: 'ajaxGetModels',
			params: '\'id=\' + escape(this.value)',
			onSuccess: 'updateModels(data)')}"
	/>
</div>


<div class="fieldcontain ${hasErrors(bean: carInssuranceFilterInstance, field: 'carModel', 'error')} required">
	<label for="carModel">
		<g:message code="carInssuranceFilter.carModel.label" default="Model" />
		<span class="required-indicator">*</span>
	</label>
	<g:select class="dropdown" id="carModel" name="carModel" from="[]" optionKey="id" required="" value="${carInssuranceFilterInstance?.carModel?.id}" />
</div>

