<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="s" uri="/struts-tags" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Protein</h1>
<s:form>
	<s:textfield name="enteredProtein"/>
	<s:submit value="Enter"/>
</s:form>	
<div>Last Amount entered:<s:property value="enteredProtein" /></div>	  
<div>Total for the day Goal:  100 grams</div>  
<div>Goal:  200 grams</div>
<div><s:property value="goalText"/></div>
</body>  
</html>