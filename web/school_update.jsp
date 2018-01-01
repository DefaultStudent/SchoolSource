<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2017/12/31
  Time: 下午4:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/css/lightbox.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css">
    <link rel="stylesheet" href="assets/css/Lightbox-Gallery.css">
    <link rel="stylesheet" href="assets/css/Navigation-Menu.css">
    <link rel="stylesheet" href="assets/css/Simple-Slider.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>
<body>
    <%@ include file="head_admin.jsp"%>
    <div style="width: 50%;margin: 0 auto">
        <form name="fom1" method="post" action="updateSchool" enctype="multipart/form-data">
            <input type="hidden" name="schid" value="<s:property value="%{#session.schid}"/>" size="20"/>
            <br><br><br>
            院校名称：<input name="schname" value="<s:property value="%{#session.schname}"/>" size="20"/>
            <br><br><br>
            <img name="schpic" src="upload<s:property value="%{#session.schpic}"/>" style="width: 100px;height: 100px;">
            <br><br><br>
            请上传新的学校图片：<input type="file" name="upload" value="<s:property value="%{#session.schpic}"/>"/>
            <br><br><br>
            代表专业：<input name="pname" value="<s:property value="%{#session.pname}"/>" size="20"/>
            <br><br><br>
            院校类型：<input name="tname" value="<s:property value="%{#session.tname}"/>" size="20"/>
            <br><br><br>
            院校地址：<input name="schaddress" value="<s:property value="%{#session.schaddress}"/>" size="20"/>
            <br><br><br>
            联系教师：<input name="teacher" value="<s:property value="%{#session.teacher}"/>" size="20"/>
            <br><br><br>
            联系电话：<input name="tel" value="<s:property value="%{#session.tel}"/>" size="20"/>
            <br><br><br>
            <input typeof="submit" type="submit" value="修改" align="center"/>
        </form>
    </div>
</body>
</html>
