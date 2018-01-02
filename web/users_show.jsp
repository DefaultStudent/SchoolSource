<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/1/2
  Time: 下午8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <table>
        <tr>
            <td>
                用户账号：
            </td>
            <td>
                <s:property value="%{#session.usersId}"/>
            </td>
        </tr>
        <tr>
            <td>
                用户姓名：
            </td>
            <td>
                <s:property value="%{#session.uName}"/>
            </td>
        </tr>
        <tr>
            <td>
                用户性别：
            </td>
            <td>
                <s:property value="%{#session.uGender}"/>
            </td>
        </tr>
        <tr>
            <td>
                用户权限：
            </td>
            <td>
                <s:if test="#session.ulimit==1">
                    管理员
                </s:if>
                <s:else>
                    普通用户
                </s:else>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
