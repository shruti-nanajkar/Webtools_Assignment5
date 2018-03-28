<%-- 
    Document   : welcomepage
    Created on : Mar 26, 2018, 11:15:05 PM
    Author     : nanaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body align="center" bgcolor="#ffe6e6">
        <c:set var="contextPath" value="${pageContext.request.contextPath}" /> 
        <h1>Welcome to our movie store</h1>
        <p>Please select one of the options below:</p>
        <table align="center">
            <tr>
                <td>To Add a new movie to the database: <a href="${contextPath}/movie/add">Click Here!</a></td>
            </tr>
            <tr>
                <td>To Browse movies: <a href="${contextPath}/movie/browse">Click Here!</a></td>
            </tr>
        </table>
    </body>

