$( document ).ready(function() {
	console.log("ok");
    $(".GetBook").click(function(event) {
    // Prevent the form from submitting via the browser.
    event.preventDefault();
    ajaxGet();
  });
    function ajaxGet(){

          $.ajax({
          type : "GET",
          contentType : "application/json",
          url :"checkout",
          success : function(result) {
            if(result.status == "Done"){
            	 alert('Must Login First');
            }else{
            	alert('Successfully Bid for this book');
            }
            
          },
          error : function(e) {
            alert("Error!")
            console.log("ERROR: ", e);
          }
        });
      }
 
    
})