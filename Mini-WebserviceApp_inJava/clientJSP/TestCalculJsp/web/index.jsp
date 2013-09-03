<%-- 
    Document   : index
    Created on : 16 juil. 2012, 15:57:59
    Author     : Emds
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Petit calcul :</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	webservice.CalculWS_Service service = new webservice.CalculWS_Service();
	webservice.CalculWS port = service.getCalculWSPort();
	 // TODO initialize WS operation arguments here
        if (request.getParameter("txtVal1") != null) {
            int val1 = Integer.parseInt(request.getParameter("txtVal1")) ;
            int val2 = Integer.parseInt(request.getParameter("txtVal2")) ;
            // TODO process result here
            int result = port.somme(val1, val2);
            out.println(val1+" + "+val2+" = "+result);
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        <form action="index.jsp" method="POST">
            <input type="text" name="txtVal1" value="" />+
            <input type="text" name="txtVal2" value="" />=
            <input type="submit" value="somme" />
        </form>
    </body>
</html>
