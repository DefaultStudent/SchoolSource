<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2017/12/30
  Time: 下午6:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:if test="ulimit==1">
    <%@include file="head_admin.jsp"%>
</s:if>
<s:else>
    <%@include file="head_users.jsp"%>
</s:else>
<div class="simple-slider">
    <div class="swiper-container">
        <div class="swiper-wrapper">
            <div class="swiper-slide" style="background-image:url(https://placeholdit.imgix.net/~text?txtsize=68&amp;txt=Slideshow+Image&amp;w=1920&amp;h=500);"></div>
            <div class="swiper-slide" style="background-image:url(https://placeholdit.imgix.net/~text?txtsize=68&amp;txt=Slideshow+Image&amp;w=1920&amp;h=500);"></div>
            <div class="swiper-slide" style="background-image:url(https://placeholdit.imgix.net/~text?txtsize=68&amp;txt=Slideshow+Image&amp;w=1920&amp;h=500);"></div>
        </div>
        <div class="swiper-pagination"></div>
        <div class="swiper-button-prev"></div>
        <div class="swiper-button-next"></div>
    </div>
</div>
<div class="photo-gallery">
    <div class="container">
        <div class="intro">
            <h2 class="text-center">Lightbox Gallery</h2>
            <p class="text-center">Nunc luctus in metus eget fringilla. Aliquam sed justo ligula. Vestibulum nibh erat, pellentesque ut laoreet vitae. </p>
        </div>
        <div class="row photos">
            <div class="col-lg-3 col-md-4 col-sm-6 item"><a href="assets/img/desk.jpg" data-lightbox="photos"><img class="img-responsive" src="assets/img/desk.jpg"></a></div>
            <div class="col-lg-3 col-md-4 col-sm-6 item"><a href="assets/img/building.jpg" data-lightbox="photos"><img class="img-responsive" src="assets/img/building.jpg"></a></div>
            <div class="col-lg-3 col-md-4 col-sm-6 item"><a href="assets/img/loft.jpg" data-lightbox="photos"><img class="img-responsive" src="assets/img/loft.jpg"></a></div>
            <div class="col-lg-3 col-md-4 col-sm-6 item"><a href="assets/img/building.jpg" data-lightbox="photos"><img class="img-responsive" src="assets/img/building.jpg"></a></div>
            <div class="col-lg-3 col-md-4 col-sm-6 item"><a href="assets/img/loft.jpg" data-lightbox="photos"><img class="img-responsive" src="assets/img/loft.jpg"></a></div>
            <div class="col-lg-3 col-md-4 col-sm-6 item"><a href="assets/img/desk.jpg" data-lightbox="photos"><img class="img-responsive" src="assets/img/desk.jpg"></a></div>
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
