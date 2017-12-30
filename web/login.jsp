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
								 <button type="submit" class="btn">提交</button>
							</fieldset>
						</form>
					</div>
					<div class="tab-pane" id="panel-419379">
						<form name="form2" method="post" action="UsersAddServlet">
							<fieldset>
								 <legend>注册</legend>
								 <label>用户帐号：</label><input type="text" id="usersid" name="usersid"/>
								 <br><br>
								 <label>真实姓名：</label><input type="text" id="uname" name="uname"/>		 
								 <br><br>
								 <label>用户密码：</label><input type="password" id="upwd" name="upwd"/>
								 <br><br>
								 <label>用户性别：</label><input type="radio" id="ugender" name="ugender" value="男"/>&nbsp男&nbsp&nbsp
								 <input type="radio" id="ugender" name="ugender" value="女"/>&nbsp女 <br>
								 <input type="hidden" name="ulimit" value="0"></input>   
								 <span class="help-block"><a>院校资源库使用守则.</a></span> 
								 <label class="checkbox" style="left:7%"><input type="checkbox" /> 勾选同意</label>
								 <button type="submit" class="btn">提交</button>
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
