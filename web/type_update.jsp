<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/1/1
  Time: 下午8:09
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
<%@ include file="head_admin.jsp"%>
<div>
    <form method="post" action="updateType" name="form1">
        <input name="tid" type="hidden" value="<s:property value="%{#session.tid}"/>"/><br>
        院校类型名称：<input name="tname" value="<s:property value="%{#session.tname}"/>"><br>
        <input type="submit" value="修改">
    </form>
</div>
</body>
</html>