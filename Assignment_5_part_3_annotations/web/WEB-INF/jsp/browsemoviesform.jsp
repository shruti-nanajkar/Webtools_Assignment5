<%-- 
    Document   : browsemoviesform
    Created on : Mar 26, 2018, 4:37:04 PM
    Author     : nanaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body align="center" bgcolor="#fff5e6">
        <c:set var="contextPath" value="${pageContext.request.contextPath}" />
        <h1>Browse Movies</h1>
        
        <form:form action="${contextPath}/movie/browse" method="post" commandName="movie">
        Enter a keyword: <input type="text" name="txtInput" placeholder="keyword">
        <br>
        <table align="center">
            <tr>
                <td><input type="radio" name="radioButton" value="movieTitle"></td>
                <td>Browse by Movie Title</td>
            </tr>
            <tr>
                <td><input type="radio" name="radioButton" value="leadActor"></td>
                <td>Browse by Lead Actor</td>
            </tr>
            <tr>
                <td><input type="radio" name="radioButton" value="leadActress"></td>
                <td>Browse by Lead Actress</td>
            </tr>
        </table>
            <input type="submit" value="Browse">
      </form:form>
    </body>
</html>

