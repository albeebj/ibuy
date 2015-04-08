<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="header.jsp"%>
<div class="alert alert-info alert-dismissable">
   <button type="button" class="close" data-dismiss="alert" 
      aria-hidden="true">
      &times;
   </button>
   只有登录用户可以购物哦~快来注册和登录吧~O(∩_∩)O~！
</div>
<div class="modal" id="login" style="margin: 100px -280px;">
  <div class="modal-header">
    <h4>用户登录</h4>
  </div>
  <div class="modal-body">
    <form class="form-horizontal">
      <div class="control-group">
        <label class="control-label">用户名</label>
        <div class="controls">
          <input type="text" id="username" placeholder="请输入您注册的邮箱"/>
        </div>
      </div>
      <div class="control-group">
        <label class="control-label">密码</label>
        <div class="controls">
          <input type="password" id="password" placeholder="请输入您的密码" />
        </div>
      </div>
    </form>
  </div>
  <div class="modal-footer">
    <button type="button" id="login-btn" class="btn btn-primary">登录</button>
    <button class="btn btn-primary btn-lg" data-toggle="modal" 
   data-target="#myModal">注册 </button>
  </div>
</div>
<!--注册的对话框-->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true"> &times; </button>
        <h4 class="modal-title" id="myModalLabel"> 注册 </h4>
      </div>
      <form class="form-horizontal">
        <div class="control-group">
          <label class="control-label">用户名</label>
          <div class="controls">
            <input type="text" placeholder="请输入有效邮箱" />
          </div>
        </div>
        <div class="control-group">
          <label class="control-label">设置密码</label>
          <div class="controls">
            <input type="text" placeholder="请输入6-13位密码"/>
          </div>
        </div>
        <div class="control-group">
          <label class="control-label">重复密码</label>
          <div class="controls">
            <input type="text" placeholder="请再次输入密码" />
          </div>
        </div>
        <div class="control-group">
          <label class="control-label">手机号</label>
          <div class="controls">
            <input type="text" />
          </div>
        </div>
        <div class="control-group">
          <label class="control-label">验证码</label>
          <div class="controls">
            <input type="text" id="input1" />
            <a href="javascript:void(0)" class="code refresh" style="width:60px"></a>
            <a href="javascript:void(0)" class="refresh">看不清,换一张</a> </div>
        </div>
      </form>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" 
               data-dismiss="modal">关闭 </button>
        <button type="button" onClick="validate();" class="btn btn-primary"> 提交注册 </button>
      </div>
    </div>
  </div>
</div>
<%@ include file="footer.jsp"%>
