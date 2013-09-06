<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<style>
	.error {
		color: #ff000;
	}
	.errrorblock {
	color: #000;
	background-color: #ffEEEE;
	border:3px solid #ff0000;
	padding: 8px;
	margin:16px;
	}
</style>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
<title>Add Goal</title>
</head>
<body>
	<form:form commandName="goal">
		<form:errors path="*" cssclcass="errorblock" element="div"></form:errors>
	<table>
		<tr>
			<td> Enter Minutes</td>
			<td><form :input path="minutes" cssErrorClass="error"></form></td>
			<td><form :errors path="minutes" cssClass="error"></form></td> 
		</tr>
		<tr>
			<td colspan=2>
			<input type="submit" value="Enter Goal Minutes" />
		</tr>
	</table>
	</form:form>
</body>
</html>