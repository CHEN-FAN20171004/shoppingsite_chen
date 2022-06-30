<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<link href="../css/login.css" rel="stylesheet">

<form action="../jp.co.aforce.servlets/login" method="post">

<div class="main"></div>
    <div class="grad"></div>

<div class="login">
<p>🍓<input type="text" name="id" value="${id}" required="required" placeholder="userid">🍓</p>
<p>🍓<input type="password" name="password"required="required" placeholder="password">🍓</p>
<p>${error_msg}</p>

<p><input type ="submit" value ="Login"></p>
<p><a href="regist.jsp">🍓新規会員登録はこちらへ🍓</a></p>

</div>

</form>

<%@include file="../footer.html" %>