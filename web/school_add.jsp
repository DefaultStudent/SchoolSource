<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2017/12/30
  Time: 下午10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <div>
        <form name="fom1" method="post" action="saveSchool" enctype="multipart/form-data">
            院校编号：<input name="schid" size="20"/><br>
            院校名称：<input name="schname" size="20"/><br>
            院校照片：<input type="file" name="upload" size="20"/><br>
            代表专业名称：<input name="pname" size="20"/><br>
            院校类型：<input name="tname" size="20"/><br>
            院校地址：<input name="schaddress" size="20"/><br>
            联系教师：<input name="teacher" size="20"/><br>
            联系电话：<input name="tel" size="20"/><br>
            <input type="submit" value="添加" align="center"/>
        </form>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/js/lightbox.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/js/swiper.jquery.min.js"></script>
    <script src="assets/js/Simple-Slider.js"></script>
</body>
</html>
