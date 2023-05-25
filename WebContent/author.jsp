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
<p>Les livres de ${author}</p>
  <table border="1">
  <c:forEach items="${liste }" var="li"> 
  
	<tr>
		<td>${li.id}</td>
		<td>${li.title}</td>
		<td>${li.quantity}</td>
		<td>${li.price } dt</td>
		<td><a href="delete?id=${li.id}">delete</a></td>
		
	</tr>
	
</c:forEach>
</table>
<p> <a href="formAdd.jsp?author=${author}">Ajouter un oeuvre de ${author}</a></p>
<a href="Principale">return</a>

</body>
</html>