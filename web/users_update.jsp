<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/1/2
  Time: 下午4:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/css/lightbox.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css">
    <link rel="stylesheet" href="assets/css/Lightbox-Gallery.css">
    <link rel="stylesheet" href="assets/css/Navigation-Menu.css">
    <link rel="stylesheet" href="assets/css/Simple-Slider.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>
<body>
<form name="myform" method="post" action="updateUsers">
    <fieldset>
        <legend>修改</legend>
        <input type="hidden" id="usersId" name="usersId" value="<s:property value="%{#session.usersId}"/>"/>
        <br><br>
        <label>真实姓名：</label><input type="text" id="uname" name="uname" value="<s:property value="%{#session.uName}"/>"/>
        <br><br>
        <label>用户密码：</label><input type="password" id="upwd" name="upwd" value="<s:property value="%{#session.uPwd}"/>"/>
        <br><br>
        <label>用户性别：</label>
        <input type="radio" id="ugender" name="ugender" value="男" checked="checked"/>&nbsp男&nbsp&nbsp
        <input type="radio" id="ugender" name="ugender" value="女"/>&nbsp女 <br>
        <select name="ulimit">
            <s:if test="#session.ulimit==1">
                <option value="0" name="ulimit">普通用户</option>
                <option value="1" name="ulimit" selected="selected">管理员</option>
            </s:if>
            <s:else>
                <option value="0" name="ulimit" selected="selected">普通用户</option>
                <option value="1" name="ulimit">管理员</option>
            </s:else>
        </select><br>
        <button type="submit" name="sub" class="btn">修改</button>
    </fieldset>
</form>
</body>
</html>
