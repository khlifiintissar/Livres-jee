<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Gestion des Livre</h1>

<p><a href="preAdd?direction=form">Ajouter un Livre</a></p>

<table border="1">
<c:forEach items="${liste }" var="li"> 
	<tr>
		<td>${li.id}</td>
		<td>${li.title}</td>
		<td><a href="author?author=${li.author}"> ${li.author}</a></td>
		<td>${li.quantity}</td>
		<td>${li.price } dt</td>
		<td>${li.cat.name}</td> 
		<td><a href="delete?id=${li.id}">delete</a></td>
		
	</tr>
</c:forEach>
</table>

</body>
</html>