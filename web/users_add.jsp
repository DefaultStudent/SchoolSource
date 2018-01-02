<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/1/2
  Time: 下午4:38
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
    <script type="text/javascript">
        function test() {
            var uid = document.myform.usersId.value;
            var exp1 = new RegExp(/^[a-zA-Z][a-zA-Z0-9_]{2,9}$/);
            if (!exp1.test(uid)) {
                alert("账号格式错误");
                document.myform.usersId.focus();
                return false;
            }
            var uname = document.myform.uname.value;
            var exp2 = new RegExp(/^\W{2,}$/);
            if (!exp2.test(uname)) {
                alert("名字格式错误");
                document.myform.uname.focus();
                return false;
            }
            var upwd = document.myform.upwd.value;
            var exp3 = new RegExp(/^\d{5,}$/);
            if (!exp3.test(upwd)) {
                alert("密码格式错误");
                document.myform.upwd.focus();
                return false;
            }
            var ugender = document.myform.ugender.value;
            if (ugender.equals("") && ugender == null) {
                alert("请选择性别")
            }
            var agree = document.myform.agree.value;
            if (agree.checked) {
                document.myform.sub.prop("disabled", false)
            }
        }
    </script>
</head>
<body>
<form name="myform" method="post" action="userExecute1">
    <fieldset>
        <legend>注册</legend>
        <label>用户帐号：</label><input type="text" id="usersId" name="usersId"/>
        <br><br>
        <label>真实姓名：</label><input type="text" id="uname" name="uname"/>
        <br><br>
        <label>用户密码：</label><input type="password" id="upwd" name="upwd"/>
        <br><br>
        <label>用户性别：</label>
        <input type="radio" id="ugender" name="ugender" value="男" checked="checked"/>&nbsp男&nbsp&nbsp
        <input type="radio" id="ugender" name="ugender" value="女"/>&nbsp女 <br>
        <select name="ulimit">
            <option value="0" name="ulimit">普通用户</option>
            <option value="1" name="ulimit">管理员</option>
        </select><br>
        <button type="submit" name="sub" class="btn">添加</button>
    </fieldset>
</form>
</body>
</html>
