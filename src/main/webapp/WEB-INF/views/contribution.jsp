<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contribution Form</title>
 <link href="css/style.css"
        rel="stylesheet">
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
          <script src="/js/postrequest.js"></script>
</head>
<body>
   <div class="main">
    <%@include file="header.jsp" %>
  <div class="content">
  
    <div class="loginPage">
    <p>Book Contribution Form</p>
       <form style="margin:20px 20px 20px 20px" id="customerForm">
     
        <label for="firstname" style="margin-right:5px">Book Name:</label>
        <input type="text" id="firstname" required="required"/>
        <label for="lastname" style="margin-left:20px; margin-right:5px">Author Name:</label>
        <input type="text" id="lastname" required="required"/>
      <label for="coursetype" style="margin-right:5px; margin-top:20px">Select Book Type:</label>
      <select id="coursetype" name="coursetype">
        <option value="C">C Programming</option>
        <option value="Cpp">C++ Programming</option>
        <option value="Java">Java Programming</option>
        <option value="Python">Python Programming</option>
        <option value="Javascript">Javascript</option>
        <option value="React">React Frameworks</option>
        <option value="DS">Data Structure</option>
     </select>
      <input type="submit"></input>
    </form>
    </div>
    <div id="postResultDiv">
    
    </div>
    
 </div>
 </div>
</body>
</html>








