<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/1/3
  Time: 下午9:17
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
            <form class="form-search" method="post" name="myform" action="getProfessionalByNameU" onsubmit="test()">
                <input class="input-medium search-query" type="text" name="pname" /><button class="btn" type="submit">查找</button>
            </form>
            <a href="pro_add.jsp">专业信息添加</a>
            <table class="table table-condensed">
                <thead>
                <tr>
                    <th>
                        专业编号
                    </th>
                    <th>
                        专业名称
                    </th>
                    <th>
                        详情
                    </th>
                </tr>
                </thead>
                <tbody>
                <s:iterator value="PageBean.list">
                    <tr class="success">
                        <td>
                            <s:property value="pid"/>
                        </td>
                        <td>
                            <s:property value="pname"/>
                        </td>
                        <td>
                            <s:a href="getProfessionalByName?pname=%{pname}">查看</s:a>
                        </td>
                    </tr>
                </s:iterator>
                <tr align="center">
                    <td colspan="4">
                        第<s:property value="PageBean.page"/>/<s:property value="PageBean.totalPage"/>页
                        <s:if test="PageBean.page!=1">
                            <a href="${pageContext.request.contextPath }/getAllProfessional?page=1">首页</a>|
                            <a href="${pageContext.request.contextPath }/getAllProfessional?page=<s:property value="PageBean.page-1"/>">上一页</a>|
                        </s:if>
                        <s:if test="PageBean.page!=PageBean.totalPage">
                            <a href="${pageContext.request.contextPath }/getAllProfessional?page=<s:property value="PageBean.page+1"/>">下一页</a>|
                            <a href="${pageContext.request.contextPath }/getAllProfessional?page=<s:property value="PageBean.totalPage"/>">尾页</a>
                        </s:if>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
