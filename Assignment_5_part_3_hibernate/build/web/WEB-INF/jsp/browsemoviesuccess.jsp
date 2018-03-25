<%-- 
    Document   : browsemoviesuccess
    Created on : Mar 24, 2018, 5:43:07 PM
    Author     : nanaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Browse Success View</title>
    </head>
    <body align="center" bgcolor="#ffe6ff">
        <h3>You searched for: ${requestScope.searchValue}</h3>
        <table border="1" align="center">
                <tr>
                    <th>Movie Title</th>
                    <th>Lead Actor</th>
                    <th>Lead Actress</th>
                    <th>Genre</th>
                    <th>Year</th>
                </tr>
                <c:forEach items="${requestScope.movieList}" var="movie">
                    <tr>
                        <td>${movie.movieTitle}</td>
                        <td>${movie.leadActor}</td>
                        <td>${movie.leadActress}</td>
                        <td>${movie.genre}</td>
                        <td>${movie.year}</td>
                    </tr>
                </c:forEach>
        </table>
        <p><a href="welcomepage.htm">Click here</a> to go back to Welcome Page!</p>
    </body>
</html>
