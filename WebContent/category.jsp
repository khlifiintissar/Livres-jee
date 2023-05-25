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
  <table border="1">
<c:forEach items="${lis}" var="li"> 
	<tr>
		<td>${li.id}</td>
		<td>${li.name}</td>
		<td><a href="deleteCat?id=${li.id}">Delete</a></td>
		
	</tr>
</c:forEach>

</table>
<Form method="GET" action="postAddCat">
   <p>Name : <input type="text" name="name"> </p>
   
   <p><input type="submit"></p>
  
</Form>
<a href="Principale">Acceuil</a>

</body>
</html>