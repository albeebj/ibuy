<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="WEB-INF/pages/common/header.jsp"%>
<%
if(session.getAttribute("user") == null ){
	response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
	String newLocn = "/ibuy/login";
	response.setHeader("Location",newLocn);
}
%>
<!--标签 Start-->
<div class="container">
  <ul class="nav nav-pills">
	<li></li>
    <li class="span4"><a href="#"> logo </a></li>
    <li class="active span2"><a href="#firstindex" data-toggle="tab">首页</a></li>
    <!--<li class="span2"><a href="#all-goods" data-toggle="tab">所有商品</a></li>-->
    <li class="dropdown span2"> <a class="dropdown-toggle" data-toggle="dropdown" href="#"> 商品 <span class="caret"></span> </a>
      <ul class="dropdown-menu">
        <li><a href="#">全部商品</a></li>
        <li><a href="#">服饰</a></li>
        <li><a href="#">鞋子</a></li>
        <li><a href="#">美包</a></li>
      </ul>
    </li>
    <li class="span2"><a href="#everydayspecial" data-toggle="tab">每日特价</a></li>
    <li class="span2"><a href="#aboutus" data-toggle="tab">关于我们</a></li>
  </ul>
  <div class="tab-content">
    <!--首页 Start-->
    <div class="tab-pane active" id="firstindex">
      <!--旋转木马-->
      <div id ="carousell" class="carousel slide">
        <div class="carousel-inner">
          <div class="item active"> <img src="http://placehold.it/960x380" alt="" />
            <div class="carousel-caption">
              <h4>标题1</h4>
              <p>xxxxxxxxxxxx</p>
            </div>
          </div>
          <div class="item"> <img src="http://placehold.it/960x380" alt="" />
            <div class="carousel-caption">
              <h4>标题2</h4>
              <p>xxxxxxxxxxxx</p>
            </div>
          </div>
          <div class="item"> <img src="http://placehold.it/960x380" alt="" />
            <div class="carousel-caption">
              <h4>标题3</h4>
              <p>xxxxxxxxxxxx</p>
            </div>
          </div>
        </div>
        <a href = "#carousell" data-slide="prev" class="left carousel-control"><</a> <a href = "#carousell" data-slide="next" class="right carousel-control">></a> </div>
      <!--旋转木马stop-->
      <!--展示几类商品-->
      <div class="container">
        <ul class="thumbnails">
          <li class="span6"><a class="thumbnail" href="#"><img src="http://placehold.it/520x370" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
        </ul>
      </div>
      <div class="container">
        <ul class="thumbnails">
          <li class="span6"><a class="thumbnail" href="#"><img src="http://placehold.it/520x370" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
        </ul>
      </div>
      <div class="container">
        <ul class="thumbnails">
          <li class="span6"><a class="thumbnail" href="#"><img src="http://placehold.it/520x370" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
          <li class="span3"><a class="thumbnail" href="#"><img src="http://placehold.it/260x180" alt="" /></a></li>
        </ul>
      </div>
      <!--展示几类商品stop-->
    </div>
    <!--首页 Stop-->
    <!--all商品 Start-->
    
    <!--all商品 Stop-->
    <!--每日特价 Start-->
    <div class="tab-pane" id="everydayspecial">cccc </div>
    <!--每日特价 Stop-->
    <!--关于我们 Start-->
    <div class="tab-pane" id="aboutus">dddd </div>
    <!--关于我们 Stop-->
    <!--四个标签结束-->
  </div>
</div>
<!--标签 Stop-->
<%@ include file="WEB-INF/pages/common/footer.jsp"%>