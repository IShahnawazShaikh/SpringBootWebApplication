<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Spring Shop</title>
 <link href="css/style.css"
        rel="stylesheet">
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
          <script src="/js/getrequest.js"></script>
</head>
<body>

  <div class="main">
    <%@include file="header.jsp" %>
  <div class="content">
   <div class="bookBoxMain">
       
  <c:forEach items="${list}" var="temp">
    <div class="bookBox">
       
         <p>Book Name: ${temp.getFirstname()}</p>
         <p>Author: ${temp.getLastname()}</p>
           <p>${temp.getCoursetype()}</p>
         <button class="GetBook" type="button">GET BOOK</button>
      </div>
    
 </c:forEach>
    </div>
      
 </div>
 </div>
</body>
</html>