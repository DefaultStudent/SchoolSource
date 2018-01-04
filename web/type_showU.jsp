<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/1/2
  Time: 上午9:33
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
<%@ include file="head_users.jsp"%>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <form class="form-search" method="post" action="getAllType">
                <input class="input-medium search-query" type="text" /><button class="btn" type="submit">查找</button>
            </form>
            <a href="type_add.jsp">院校类型添加</a>
            <table class="table table-condensed">
                <thead>
                <tr>
                    <th>
                        院校类型编号
                    </th>
                    <th>
                        院校类型名称
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                    <tr class="success">
                        <td>
                            <s:property value="%{#session.tid}"/>
                        </td>
                        <td>
                            <s:property value="%{#session.tname}"/>
                        </td>
                        <td>
                            <s:a href="getTypeById?tid=%{tid}">修改</s:a>&nbsp;|&nbsp;<s:a href="removeType?tid=%{tid}">删除</s:a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
