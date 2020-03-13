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
      <div class="profile">
         <div class="info">
     
         
            <button><a href="editProfile">Edit Profile</a> </button>
            <button><a href="">Book Contributed</a> </button>
            <button><a href="">Book Recieved</a> </button>
            <button><a href="logout">Logout</a> </button>
         </div>
        
         <div class="displayDetail">
            
            <div class="update">
            
           <form action="update" method="post" >
            
             <p> Name</p> 
            <input type="name" name="name" value="${userDetail.getName()}">
             <p> Email</p> 
            <input type="email" name="email" value="${userDetail.getEmail()}">
            <p>Phone</p> 
            <input type="number" name="number" value="${userDetail.getPhone()}">
        	<br>
        	<p>New Password</p>
        	 <input type="password" name="password" value="${userDetail.getPassword()}">
            <br>
        	<input type="submit" name="" value="Update Detail">
        	</form>
		
	</div>
           
         </div> 
 </div>
 </div>
</body>
</html>