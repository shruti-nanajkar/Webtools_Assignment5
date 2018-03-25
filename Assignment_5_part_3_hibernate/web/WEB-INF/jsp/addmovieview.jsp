<%-- 
    Document   : addmovieview
    Created on : Mar 24, 2018, 5:40:55 PM
    Author     : nanaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
        <title>Add movie to Database</title>
    </head>
    <body align="center" bgcolor="#ffe6ff">
        <h2>Please enter the details of the movie below: </h2>
        <form:form commandName="movie">
            <table align="center">
                <tr>
                    <td>Title: <form:input path="movieTitle"/></td>
                </tr>
                <tr>
                    <td>Actor: <form:input path="leadActor"/></td>
                </tr>
                <tr>
                    <td>Actress: <form:input path="leadActress"/></td>
                </tr>
                <tr>
                    <td>Genre: <form:input path="genre"/></td>
                </tr>
                <tr>
                    <td>Year: <form:input path="year"/></td>
                </tr>
            </table>
                <br>
            <input type ="submit" value="Add Movie">
        </form:form>
            
    </body>
</html>
