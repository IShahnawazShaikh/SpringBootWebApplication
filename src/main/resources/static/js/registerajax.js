$( document ).ready(function() {
	console.log("register");
  // SUBMIT FORM
    $("#registerForm").submit(function(event) {
    // Prevent the form from submitting via the browser.
    event.preventDefault();
    ajaxPost();
  });
    
    
    function ajaxPost(){
    	console.log('ajaxpost')
    	  var formData = {
    		        Name : $("#Name").val(),
    		        Email :  $("#Email").val(),
    		        Phone: $("#Phone").val(),
    		        Password: $("#Password").val()
    		      }
    		      
      // DO POST
    	console.log('ajaxpost2')	
    	
      $.ajax({
      type : "POST",
      contentType : "application/json",
      url :"confirmPage2",
      data : JSON.stringify(formData),
      dataType : 'json',
      success : function(result) {
    	  console.log("success");
        if(result.status == "Done"){
        	console.log('if')
        	
        	 $("#postResultDiv").html("<p style='background-color:#000; color:white; padding:20px 20px 20px 20px'>" + 
                     "Registered Successfully! <br>");
        }else{
          $("#postResultDiv").html("<strong>Error</strong>");
      	console.log('else')
        }
        console.log(result);
      },
      error : function(e) {
        alert("Error!")
        console.log("ERROR: ", e);
      }
    });
     
      // Reset FormData after Posting
      //resetData();
 
    }
    
//    function resetData(){
//      $("#firstname").val("");
//      $("#lastname").val("");
//    }
})