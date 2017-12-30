<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2017/12/30
  Time: 下午3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header"><a class="navbar-brand hidden" href="#"> </a><button class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button></div>
            <div
                class="collapse navbar-collapse" id="navcol-1">
                <ul class="nav navbar-nav main-nav">
                    <li role="presentation"><a href="#" id="home">院校资源库 </a></li>
                    <li role="presentation"><a href="#">院校信息 </a></li>
                    <li role="presentation"><a href="#">专业信息 </a></li>
                    <li role="presentation"><a href="#">院校类型信息 </a></li>
                    <li role="presentation"><a href="login.jsp">登录&nbsp;|&nbsp;注册 </a></li>
                </ul>
        </div>
        </div>
    </nav>
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