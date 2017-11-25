<%-- 
    Document   : quejas
    Created on : Nov 28, 2017, 11:52:40 AM
    Author     : dalejandro.higuita
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quejas</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
 <script
			  src="https://code.jquery.com/jquery-3.2.1.min.js"
			  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
			  crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>        
    </head>
    <body>
        <h1> Quejas</h1>
        <form action="./QuejaxServlet" method="POST">
            <table class="table table-striped">
            <tr>
                <th> Identificacion</th>
                <th><input type="text" name="id" value="${queja.id}"/> </th>
            </tr>
            <tr>
                <th> Fecha</th>
                 <th> <input type="text" name="fechaQueja" value="${queja.fechaQueja}"/></th>
            </tr>
             <tr>
                <th> Queja</th>
                 <th><input type="text" name="textoQueja" value="${queja.textoQueja}"/> </th>
            </tr>
             <tr>
                <th> Nombre</th>
                 <th> <input  type="text" name="responsable" value="${queja.responsable}"/></th>
            </tr>
             <tr>
                 <td colspan="2">
                 <input type="submit" name="action" value="Add"/>
                 <input type="submit" name="action" value="Edit"/>
                 <input type="submit" name="action" value="Delete"/>
                 <input type="submit" name="action" value="Search"/>
                 
                 </td>
             </tr>
            
        </table>
            </form>
            <br>
            
            <table border="1" class="table table-striped">
                <th>Identificacion</th>
                <th>Fecha</th>
                <th>Queja</th>
                <th>Responsable</th>
    
                
                <c:forEach items="${allQueja}" var="q">
                    <tr>
                        <td>${q.id}</td>
                        <td>${q.fechaQueja}</td>
                        <td>${q.textoQueja}</td>
                        <td>${q.responsable}</td>
                    </tr>
                </c:forEach>
           </table>
            <form action="index.jsp">
             <input type="submit" value="Atras"/>
            </form>
    </body>
</html>
