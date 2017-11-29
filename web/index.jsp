<%-- 
    Document   : index
    Created on : 25/11/2017, 05:58:24 PM
    Author     : Juan Gallo
--%>
<<<<<<< Updated upstream

<%@page contentType="text/html" pageEncoding="UTF-8"%>
=======
<<<<<<< HEAD
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
=======

<%@page contentType="text/html" pageEncoding="UTF-8"%>
>>>>>>> final
>>>>>>> Stashed changes
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<<<<<<< Updated upstream
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
=======
<<<<<<< HEAD
        <title>Autos Informacion</title>
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
        <h1>Autos Informacion</h1>
        <form action="./AutoServlet" method="POST">
            <table class="table table-striped">
            <tr>
                <th> Placa</th>
                <th><input type="text" name="placa" value="${auto.placa}"/> </th>
            </tr>
            <tr>
                <th> Marca</th>
                 <th> <input type="text" name="marca" value="${auto.marca}"/></th>
            </tr>
             <tr>
                <th> Color</th>
                 <th><input type="text" name="color" value="${auto.color}"/> </th>
            </tr>
             <tr>
                <th> Modelo</th>
                 <th> <input type="text" name="modelo" value="${auto.modelo}"/></th>
            </tr>
             <tr>
                <th> Tipo</th>
                 <th> <input type="text" name="tipo" value="${auto.tipo}"/></th>
            </tr>
             <tr>
                <th> Disponibilidad</th>
                 <th> <input type="text" name="disponibilidad" value="${auto.disponibilidad}"/></th>
            </tr>
             <tr>
                <th> Propietario</th>
                 <th> <input type="text" name="propietario" value="${auto.propietario}"/></th>
            </tr>
            <tr>
                <th> Fecha</th>
                 <th> <input type="text" name="fechaRegistro" value="${auto.fechaRegistro}"/></th>
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
                <th>Placa</th>
                <th>Marca</th>
                <th>Color</th>
                <th>Modelo</th>
                <th>Tipo</th>
                <th>Disponibilidad</th>
                <th>Propietario</th>
                <th>Fecha</th>
                
                <c:forEach items="${allAuto}" var="aut">
                    <tr>
                        <td>${aut.placa}</td>
                        <td>${aut.marca}</td>
                        <td>${aut.color}</td>
                        <td>${aut.modelo}</td>
                        <td>${aut.tipo}</td>
                        <td>${aut.disponibilidad}</td>
                        <td>${aut.propietario}</td>
                        <td>${aut.fechaRegistro}</td>
                    </tr>
                </c:forEach>
           </table>
            <form action="quejas.jsp">
             <input type="submit" value="Quejarse"/>
            </form>
            <form action="devoluciones.jsp">
             <input type="submit" value="Devolver Vehiculo"/>
            </form>
=======
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
>>>>>>> final
>>>>>>> Stashed changes
    </body>
</html>
