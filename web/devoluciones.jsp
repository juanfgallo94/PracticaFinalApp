<%-- 
    Document   : devoluciones
    Created on : Nov 28, 2017, 1:14:50 PM
    Author     : dalejandro.higuita
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Devoluciones</title>
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
        <h1> Devoluciones</h1>
        <form action="./DevolucionesServlet" method="POST">
            <table class="table table-striped">
            <tr>
                <th> Identificacion</th>
                <th><input type="text" name="id" value="${devolucion.id}"/> </th>
            </tr>
            <tr>
                <th> Placa</th>
                 <th> <input type="text" name="placa" value="${devolucion.placa}"/></th>
            </tr>
             <tr>
                <th> Fecha</th>
                 <th><input type="text" name="fecha" value="${devolucion.fecha}"/> </th>
            </tr>
             <tr>
                <th> Motivo</th>
                 <th> <input  type="text" name="motivo" value="${devolucion.motivo}"/></th>
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
                <th>Placa</th>
                <th>Fecha</th>
                <th>Motivo</th>
    
                
                <c:forEach items="${allDevoluciones}" var="q">
                    <tr>
                        <td>${q.id}</td>
                        <td>${q.placa}</td>
                        <td>${q.fecha}</td>
                        <td>${q.motivo}</td>
                    </tr>
                </c:forEach>
           </table>
            <form action="index.jsp">
             <input type="submit" value="Atras"/>
            </form>
    </body>
</html>
