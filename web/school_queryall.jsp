<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2017/12/30
  Time: 下午7:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Untitled</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/css/lightbox.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/css/swiper.min.css">
    <link rel="stylesheet" href="assets/css/Lightbox-Gallery.css">
    <link rel="stylesheet" href="assets/css/Navigation-Menu.css">
    <link rel="stylesheet" href="assets/css/Simple-Slider.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>
<body>
<div class="container-fluid">
    <s:if test="ulimit==1">
        <%@include file="head_admin.jsp"%>
    </s:if>
    <s:else>
        <%@include file="head_users.jsp"%>
    </s:else>
    <div class="row-fluid">
        <div class="span12">
            <form class="form-search">
                <input class="input-medium search-query" type="text" /> <button type="submit" class="btn">查找</button>
            </form>
            <a href="school_add.jsp">院校信息添加</a>
            <table class="table">
                <thead>
                <tr>
                    <th>
                        院校编号
                    </th>
                    <th>
                        院校图片
                    </th>
                    <th>
                        院校名称
                    </th>
                    <th>
                        联系教师
                    </th>
                    <th>
                        院校地址
                    </th>
                    <th>
                        详情
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <s:iterator value="PageBean.list">
                <tr>
                    <td>
                        <s:property value="schid"/>
                    </td>
                    <td>
                        <img src="upload<s:property value="schpic"/>" style="width: 100px; height: 100px">
                    </td>
                    <td>
                        <s:property value="schname"/>
                    </td>
                    <td>
                        <s:property value="teacher"/>
                    </td>
                    <td>
                        <s:property value="schaddress"/>
                    </td>
                    <td>
                        <a>查看</a>
                    </td>
                    <td>
                        <s:a href="getSchoolById?schid=%{schid}">修改</s:a>&nbsp;|&nbsp;<s:a href="removeSchool?schid=%{schid}">删除</s:a>
                    </td>
                </tr>
                </s:iterator>
                <tr align="center">
                    <td colspan="4">
                        第<s:property value="PageBean.page"/>/<s:property value="PageBean.totalPage"/>页
                        <s:if test="PageBean.page!=1">
                            <a href="${pageContext.request.contextPath }/findAllSchool?page=1">首页</a>|
                            <a href="${pageContext.request.contextPath }/findAllSchool?page=<s:property value="PageBean.page-1"/>">上一页</a>|
                        </s:if>
                        <s:if test="PageBean.page!=PageBean.totalPage">
                            <a href="${pageContext.request.contextPath }/findAllSchool?page=<s:property value="PageBean.page+1"/>">下一页</a>|
                            <a href="${pageContext.request.contextPath }/findAllSchool?page=<s:property value="PageBean.totalPage"/>">尾页</a>
                        </s:if>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/bootstrap/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/js/lightbox.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/js/swiper.jquery.min.js"></script>
<script src="assets/js/Simple-Slider.js"></script>
</body>
</html>
