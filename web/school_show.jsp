<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/1/1
  Time: 上午10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>appliance</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/css/lightbox.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css">
    <link rel="stylesheet" href="assets/css/Lightbox-Gallery.css">
    <link rel="stylesheet" href="assets/css/Navigation-Menu.css">
    <link rel="stylesheet" href="assets/css/Simple-Slider.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>
<style type="text/css">
    #table{
        margin: 0px auto;
        width: 700px;
        border: 1px black solid;
        text-align: center;
    }
    #up{;
        border:1px black solid;
        width: 700px;
        height: 240px;
    }
    #down{
        margin-top: 0px;
        border:1px black solid;
        width: 700px;
        height: 20px;
    }
    #down1{
        width: 700px;
        border:1px black solid;
        height: 20px;
        margin-top: 0px;
    }

</style>
<body>
<%@ include file="head_admin.jsp"%>
<div id="table">
    <div id="up">
        <table>
            <tr>
                <td id="1"><img src="upload<s:property value="%{#session.schpic}"/>" alt="" style="width: 300px;height: 200px; align:center"> </td>
                <td id="2"><s:property value="%{#session.schname}"/></td>
            </tr>
        </table>
    </div>
    <div id="down">
        特色专业：<s:property value="%{#session.pname}"/>
    </div>
    <div id="down1">
        院校类型：<s:property value="%{#session.tname}"/>
    </div>
</div>
</body>
</html>