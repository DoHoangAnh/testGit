<%-- 
    Document   : ShowAll
    Created on : Aug 28, 2015, 8:34:11 PM
    Author     : anhdh_a05370
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Demo Show All</h1>
        <jsp:useBean id="mrBean" class="app.MyClass" scope="session"/>
        <c:forEach var="p" items="${mrBean.all}">
            <table border="2" bordercolor="#0033FF">
                <tr>
                    <td>Name</td>
                    <td>${p.name}</td>
                </tr> 
            </table> 
        </c:forEach>
    </body>
</html>
