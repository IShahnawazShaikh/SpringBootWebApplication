$( document ).ready(function() {
	//console.log("ok");
   var url=window.location;
  // SUBMIT FORM
    $("#customerForm").submit(function(event) {
    // Prevent the form from submitting via the browser.
    event.preventDefault();
    ajaxPost();
  });
    function ajaxPost(){  
      // PREPARE FORM DATA
      var formData = {
        firstname : $("#firstname").val(),
        lastname :  $("#lastname").val(),
        coursetype: $("#coursetype").val()
      }
      // DO POST
      $.ajax({
      type : "POST",
      contentType : "application/json",
      url :"confirmpage",
      data : JSON.stringify(formData),
      dataType : 'json',
      success : function(result) {
    	  console.log("success");
        if(result.status == "Done"){
        	 $("#postResultDiv").html("<p style='background-color:#000; color:white; padding:20px 20px 20px 20px'>" + 
                     "Book Contributed Successfully! <br>");
        }else{
          alert('must login or register');
        }
        console.log(result);
      },
      error : function(e) {
        alert("Error!")
        console.log("ERROR: ", e);
      }
    });
      // Reset FormData after Posting
      resetData();
 
    }
    
    function resetData(){
      $("#firstname").val("");
      $("#lastname").val("");
    }
})