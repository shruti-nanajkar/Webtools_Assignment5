<%-- 
    Document   : addmoviesucess
    Created on : Mar 26, 2018, 4:36:36 PM
    Author     : nanaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#e6e6ff" align="center">
        <c:set var="contextPath" value="${pageContext.request.contextPath}" />
        <h1>Movie is added successfully!</h1>
        <p><a href="${contextPath}/welcomepage/">Click here</a> to go back to the Welcome Page!</p>
    </body>
</html>
