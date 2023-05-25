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
<h2>Ajouter un livre</h2>
<% String author = request.getParameter("author");
 %>
<Form method="GET" action="postAdd">
   <p>Titre : <input type="text" name="title"> </p>
   <p>Auteur : <input type="text" name="author" value="<%= author %>"> </p>
   <p>Prix :<input type="text" name="price"> </p>
   <p>Quantité :<input type="text" name="quantity"></p>
   <p>Categorie :
   <select name="category">
   <c:forEach  items="${lis}" var="li">
    <option value="${li.id}">${li.name}</option>
    </c:forEach>
   </select>
   </p>
   <a href="preAdd?direction=cate">ajouter categorie</a>
   <p><input type="submit"></p>
  
</Form>



</body>
</html>