<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/1/3
  Time: 下午9:25
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
    <script type="text/javascript">
        function test() {
            var pname = document.myform.pname.value;
            if (pname.equals("") && pname == null) {
                alert("请填写信息")
            }

            var pdes = document.myform.pdes.value;
            if (pdes.equals("") && pdes == null) {
                alert("请填写信息")
            }
        }
    </script>
</head>
<body>
<%@ include file="head_admin.jsp"%>
<div>
    <form name="myform" method="post" action="updateProfessional">
        <input type="hidden" name="pid" value="<s:property value="%{#session.pid}"/>"/><br><br>
        专业名称：<input name="pname" value="<s:property value="%{#session.pname}"/>"><br><br>
        专业描述：<textarea name="pdes"/>
        <s:property value="%{#session.pdes}"/>
        </textarea><br><br>
        <input type="submit" value="修改">
    </form>
</div>
</body>
</html>
