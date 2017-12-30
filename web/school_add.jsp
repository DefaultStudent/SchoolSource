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
    <div>
        <s:form name="fom1" method="post" action="saveSchool" enctype="multipart/form-data">
            <s:textfield name="schId" label="院校编号" size="20"/>
            <s:textfield name="schName" label="院校名称" size="20"/>
            <s:file name="upload" label="院校照片" size="20"/>
            <s:textfield name="pid" label="专业编号" size="20"/>
            <s:textfield name="tid" label="类型编号" size="20"/>
            <s:textfield name="schAddress" label="院校地址" size="20"/>
            <s:textfield name="teacher" label="联系教师" size="20"/>
            <s:textfield name="tel" label="联系电话" size="20"/>
            <s:submit value="添加" align="center"/>
        </s:form>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/lightbox2/2.8.2/js/lightbox.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/3.3.1/js/swiper.jquery.min.js"></script>
    <script src="assets/js/Simple-Slider.js"></script>
</body>
</html>
