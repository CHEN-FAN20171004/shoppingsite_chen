<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css">
<link href="../css/login-in.css" rel="stylesheet">


<div class="box">
	<span class="box-title">WELCOME</span>
	<p>
		ようこそ🍓いちご🍓の世界へ、${userBean.last_name}さん！
	</p>
</div>


<ul class="slider">
  <li><img src="../img/1.jpg" alt=""></li>
  <li><img src="../img/2.jpg" alt=""></li>
  <li><img src="../img/milk1.jpg" alt=""></li>
  <li><img src="../img/sweets2.jpg" alt=""></li>
  <li><img src="../img/sweets3.jpg" alt=""></li>
  <li><img src="../img/sweets5.jpg" alt=""></li>
<!--/slider--></ul>
<a href="https://kenwheeler.github.io/slick/" target="_blank"></a>

<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
<script src="../js/login-in.js"></script>


<%@include file="../footer.html" %>