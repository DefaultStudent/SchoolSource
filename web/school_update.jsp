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
    <s:form name="fom1" method="post" action="updateSchool" enctype="multipart/form-data">
        <s:textfield type="hidden" name="schid" value="%{#session.schid}" size="20"/><br>
        <s:textfield name="schname" label="学校名称" value="%{#session.schname}" size="20"/><br>
        <s:file name="upload"/>
        <s:textfield name="pname" value="%{#session.pname}" size="20"/><br>
        <s:textfield name="tname" value="%{#session.tname}" size="20"/><br>
        <s:textfield name="schaddress" value="%{#session.schaddress}" size="20"/><br>
        <s:textfield name="teacher" value="%{#session.teacher}" size="20"/><br>
        <s:textfield name="tel" value="%{#session.tel}" size="20"/><br>
        <s:submit type="submit" value="修改" align="center"/>
    </s:form>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/js/lightbox.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/js/swiper.jquery.min.js"></script>
    <script src="assets/js/Simple-Slider.js"></script>
</body>
</html>
