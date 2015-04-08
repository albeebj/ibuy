define(["jquery"], function($) {
	var username  = $("#username"),
		password  = $("#password"),
		submitBtn = $("#login-btn");
	
	submitBtn.click(function() {
		$.ajax({          
		    type:'post',
		    dataType:"json",
		    url:'login',
		    data:'username=' + username.val() + "&password=" + password.val(), 
		    error:function(){     
		    	console.log('error');     
		    },     
		    success:function(data){
		    	console.log(data);
		    	if(data == true){
		    		location.href = "index.jsp";
		    	}
		    	else{
		    		alert("wrong!");
		    	}
		    }  
		});  
	});
		
});