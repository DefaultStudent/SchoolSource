<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/1/1
  Time: 上午10:43
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
    <br><br><br>
    <table style="border-collapse: collapse;width: 30%;margin: 0 auto;">
        <tr>
            <td>
                <img src="upload<s:property value="%{#session.schpic}"/>" alt="" style="width: 100px;height: 100px;">
            </td>
            <td>
                <s:property value="%{#session.schname}"/>
            </td>
        </tr>
        <tr>
            <td>特色专业：<s:property value="%{#session.pname}"/>
        </tr>
        <tr>
            <td>院校类型：<s:property value="%{#session.tname}"/></td>
        </tr>
    </table>
</div>
</body>
</html>
