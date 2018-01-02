<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
      <link href="css/bootstrap.min.css" rel="stylesheet">
      <script src="dist/jquery-3.2.1.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <script type="text/javascript">
          function test() {
              var uid = document.myform.usersId.value;
              var exp1 = new RegExp(/^[a-zA-Z][a-zA-Z0-9_]{2,9}$/);
              if (!exp1.test(uid)) {
                  alert("账号格式错误");
                  document.myform.usersId.focus();
                  return false;
              }
              var uname = document.myform.uname.value;
              var exp2 = new RegExp(/^\W{2,}$/);
              if (!exp2.test(uname)) {
                  alert("名字格式错误");
                  document.myform.uname.focus();
                  return false;
              }
              var upwd = document.myform.upwd.value;
              var exp3 = new RegExp(/^\d{5,}$/);
              if (!exp3.test(upwd)) {
                  alert("密码格式错误");
                  document.myform.upwd.focus();
                  return false;
              }
              var ugender = document.myform.ugender.value;
              if (ugender.equals("") && ugender == null) {
                  alert("请选择性别")
              }
              var agree = document.myform.agree.value;
              if (agree.checked) {
                  document.myform.sub.prop("disabled", false)
              }
          }
      </script>
  </head>
  
  <body>
  <br><br><br>
    <div class="container-fluid">
	<div class="row-fluid" style="width:20%; margin:0 auto">
		<div class="span4">
			<div class="tabbable" id="tabs-494818">
				<ul class="nav nav-tabs">
					<li class="active">
						<a href="#panel-6946" data-toggle="tab">登陆</a>
					</li>
					<li>
						<a href="#panel-419379" data-toggle="tab">注册</a>
					</li>
				</ul>
				<br><br><br>
				<div class="tab-content">
					<div class="tab-pane active" id="panel-6946">
						<form name="form1" method="post" action="login">
							<fieldset>
								 <legend>欢迎登陆</legend>
								 <label>帐号：</label><input type="text" id="usersId" name="usersId"/>
								 <br><br>
								 <label>密码：</label><input type="password" id="upwd" name="upwd"/>
								 <br><br>
								 <button type="submit" class="btn">登录</button>
							</fieldset>
						</form>
					</div>
					<div class="tab-pane" id="panel-419379">
						<form name="myform" method="post" action="userExecute" onsubmit="return test()">
							<fieldset>
								 <legend>注册</legend>
								 <label>用户帐号：</label><input type="text" id="usersId" name="usersId"/>
								 <br><br>
								 <label>真实姓名：</label><input type="text" id="uname" name="uname"/>		 
								 <br><br>
								 <label>用户密码：</label><input type="password" id="upwd" name="upwd"/>
								 <br><br>
								 <label>用户性别：</label>
                                 <input type="radio" id="ugender" name="ugender" value="男" checked="checked"/>&nbsp男&nbsp&nbsp
								 <input type="radio" id="ugender" name="ugender" value="女"/>&nbsp女 <br>
								 <input type="hidden" name="ulimit" value="0"></input>   
								 <span class="help-block"><a>院校资源库使用守则.</a></span> 
								 <label class="checkbox" style="left:7%"><input type="checkbox" name="agree" id="agree" /> 勾选同意</label>
								 <button type="submit" name="sub" class="btn">提交</button>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div class="span4">
		</div>
	</div>
</div>
  </body>
</html>
