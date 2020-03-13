<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="css/style.css"
        rel="stylesheet">
      
</head>
<body>
  <div class="main">
    <%@include file="header.jsp" %>
  <div class="content">
  <div class="loginPage">
       <form:form method="post" action="confirmPage2" modelAttribute="user">
	  
	    <p>Name</p> <form:input path="Name"/>
		<br>
		<p>Email</p> <form:input path="Email"/>
		<br>
		<p>Phone</p> <form:input path="Phone"/>
		<br>
		<p>Password</p>  <form:input path="Password" />
		<br>
		
		<input type="submit"/>
		</form:form>
		<p>Already have Account <a href="account">click</a></p>
	</div>
	<div id="postResultDiv">
    
    </div>
 </div>
 </div>
</body>
</html>