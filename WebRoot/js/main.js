(function() { 
	require.config({
		baseUrl : "js",
	    paths: {
	        jquery: 'jquery-1.11.2.min',
	        bootstrap : 'bootstrap.min'
	    },
	    shim : {  
		    bootstrap : {  
		         deps : [ 'jquery' ],  
		         exports : 'bootstrap'  
		    }  
	    }  
	});
	var loadModule = [
	                  'login', 
	                  'bootstrap',
	                  'albee',
	                 ];
	require(loadModule, function (){
		console.log("all loaded.");
	});
})(this);