define(["jquery"], function($) {
	var refreshCaptcha = $(".refresh"),
		code; //在全局 定义验证码
		
	refreshCaptcha.click(createCode);
	
	function createCode(){ 
		console.log("create code");
		code = new Array();
		var codeLength = 4;//验证码的长度
		var checkCode = $("#checkCode");
		checkCode.value = "";
		
		var selectChar = new Array(1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','J','K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z');
		
		for(var i=0;i<codeLength;i++) {
		   var charIndex = Math.floor(Math.random()*32);
		   code +=selectChar[charIndex];
		}
		if(code.length != codeLength){
		   createCode();
		}
		checkCode.value = code;
	}
	
	function validate () {
	var inputCode = $("#input1").value.toUpperCase();
	
	if(inputCode.length <=0) {
	   alert("请输入验证码！");
	   return false;
	}
	else if(inputCode != code ){
	   alert("验证码输入错误,请重新注册！");
	   createCode();
	   $("#input1").value="";
	   return false;
	}
	else {
	   alert("成功！");
	   $("#input1").value="";
	   window.history.back(-1);
	    window.location.href="login.jsp?backurl=index.jsp"+window.location.href; 
	   return true;
	}
	
	}// JavaScript Document
});