<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<style>
.footer {
	padding: 30px 0px;
	color: #737a87;
	background-color: #4c5463;
	text-align: center;
	line-height: 20px;
	font-size: 14px;
}
div {
	display: block;
}
.code {
	background-image:url(111.jpg);
	font-family:Arial, 宋体;
	font-style:italic;
	color:green;
	border:0;
	padding:2px 3px;
	letter-spacing:3px;
	font-weight:bolder;
}
.unchanged {
	border:0;
}
</style>
  </head>
  
  <body>
    <body onLoad="createCode();">
<!--header Start-->
<div class="container-fliud">
  <div class="navbar">
    <div class="navbar-inner navbar-fix-top">
      <div class="container">
        <ul class="nav">
          <li>
          	<%
          		String username = session.getAttribute("user").toString();
				if(username != null ){
					out.print("<a href='login'><i class='icon-user'></i> " + username + ",欢迎您</a>");
				}
				else{
					out.print("<a href='login'><i class='icon-user'></i> 请登录/注册</a>");
				}
			%>
          	
          </li>
        </ul>
        <% if(username != null){
        	out.print("<ul class='nav'><li><a href='logout'> 退出</a></li></ul>");
        } %>
        
        <ul class="nav">
          <li><a href="index.jsp"><i class="icon-home"></i> 首页</a></li>
        </ul>
        <ul class="nav pull-right">
          <li class="dropdown"> <a class="dropdown-toggle" data-toggle="dropdown" href="#">我的账户<span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="#">个人信息</a></li>
              <li><a href="#">我的订单</a></li>
              <li><a href="#">我的评论</a></li>
            </ul>
          </li>
          <li><a href="#"><i class="icon-shopping-cart"></i> 购物车</a></li>
        </ul>
      </div>
    </div>
  </div>
</div>
<!--header Stop-->