define(["jquery"], function($) {
	var username  = $("#username"),
		password  = $("#password"),
		submitBtn = $("#login-btn");
	
	submitBtn.click(function() {
		$.ajax({          
		    type:'post',
		    dataType:"json",
		    url:'verify_login',
		    data:'username=' + username.val() + "&password=" + password.val(), 
		    error:function(){     
		    	console.log('error');     
		    },     
		    success:function(data){
		    	console.log(data);
		    	if(data == "success"){
		    		location.href = "index.jsp";
		    	}
		    	else if(data == "failer"){
		    		alert("wrong!");
		    	}else {
		    		alert("unvarified!");
		    	}
		    }  
		});  
	});
		
});