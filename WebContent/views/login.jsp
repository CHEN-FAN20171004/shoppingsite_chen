<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<link href="../css/login.css" rel="stylesheet">

<form action="../jp.co.aforce.servlets/login" method="post">

<div class="main"></div>
    <div class="grad"></div>

<div class="login">
<p>π<input type="text" name="id" value="${id}" required="required" placeholder="userid">π</p>
<p>π<input type="password" name="password"required="required" placeholder="password">π</p>
<p>${error_msg}</p>

<p><input type ="submit" value ="Login"></p>
<p><a href="regist.jsp">πζ°θ¦δΌε‘η»ι²γ―γγ‘γγΈπ</a></p>

</div>

</form>

<%@include file="../footer.html" %>