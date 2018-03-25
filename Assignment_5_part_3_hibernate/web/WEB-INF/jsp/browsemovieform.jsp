<%-- 
    Document   : browsemovieform
    Created on : Mar 24, 2018, 5:42:14 PM
    Author     : nanaj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body align="center" bgcolor="#fff5e6">
        <h1>Browse Movies</h1>
        
        <form method="post" action="browse.htm">
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
        </form>
    </body>
</html>
