<%-- 
    Document   : index
    Created on : 14 juil. 2012, 18:03:03
    Author     : Xzof
--%>

<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! 
// déclarations globales à la page
org.oorsprong.websamples.CountryInfoService service ;
org.oorsprong.websamples.CountryInfoServiceSoapType port ;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        // invocation du Web Service
        try {
            service = new org.oorsprong.websamples.CountryInfoService();
            port = service.getCountryInfoServiceSoap();
        %>
            <h1>Quizz des Pays</h1>
            <hr />
            <!-- Affichage du résultat s'il y en a un -->
            <%
            // récupération des variables post
            String rang = request.getParameter("txtRang") ;
            if (rang!=null) {
                int rangPays = Integer.parseInt(rang) ;
                String capitaleSaisie = request.getParameter("txtCapitale") ;
                String monnaieSaisie = request.getParameter("txtMonnaie") ;

                // récupération des bonnes réponses
                String codePays = port.listOfCountryNamesByName().getTCountryCodeAndName().get(rangPays).getSISOCode() ;
                String capitale = port.capitalCity(codePays) ;
                String monnaie = port.countryCurrency(codePays).getSName() ;

                //comparaison des réponses
                if (capitaleSaisie.equals(capitale) && monnaieSaisie.equals(monnaie)) {
                    out.println("BRAVO !!!") ;
                }else{
                    String nomPays = port.listOfCountryNamesByName().getTCountryCodeAndName().get(rangPays).getSName() ;
                    out.println("Voici les bonnes réponses pour le pays : "+nomPays+"<br />") ;
                    out.println("Capitale : "+capitale+"<br />") ;
                    out.println("Monnaie : "+monnaie+"<br />") ;
                }
            }
            %>
            <hr />
            <form action="index.jsp" method="POST">
                <table>
                    <tr>
                        <td>Pays : </td>
                        <td>
                            <%-- start web service invocation --%>
                            <%
//                            try {
                                // TODO process result here
                                org.oorsprong.websamples.ArrayOftCountryCodeAndName result = port.listOfCountryNamesByName();

                                // nombre de pays
                                int nbPays = result.getTCountryCodeAndName().size() ;
                                // génération d'un nombre aléatoire pour récupérer un pays
                                int k =(int)(Math.random()*nbPays) ;
                                // affichage du nom du pays correspondant
                                out.println(result.getTCountryCodeAndName().get(k).getSName());
                                // rang du pays en champ caché pour le récupérer
                                out.println("<input type='hidden' name='txtRang' value='"+k+"' />") ;
//                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
//                            }
                            %>
                            <%-- end web service invocation --%>                       
                        </td>
                    </tr>
                    <tr>
                        <td>Capitale : </td>
                        <td><input type="text" name="txtCapitale" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>Monnaie : </td>
                        <td><input type="text" name="txtMonnaie" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><input type="submit" value="Tester" /></td>
                    </tr>
                </table>
            </form>
        <%
        }catch(Exception ex){
            out.println("Accès au Web Service indisponible") ;
        }        
        %>
    </body>
</html>
