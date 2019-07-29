<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<form:form id="offerFormID" commandName="offerForm" action="${request.contextPath}/offers/register"
	method="post">

	<formElement:formInputBox idKey="offerform.email"
		labelKey="offerform.email" path="email" inputCSS="form-control"
		mandatory="true" />
	<formElement:formInputBox idKey="offerform.Name"
		labelKey="offerform.Name" path="name" inputCSS="form-control"
		mandatory="false" />
	<formElement:formCheckbox idKey="offerform.subscribe"
		labelKey="offerform.subscribe" path="subscribe" />

	<button id="buttonId" type="submit">
		<spring:theme code="submit.button" />
	</button>

</form:form>
