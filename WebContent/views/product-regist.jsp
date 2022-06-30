<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<link href="../css/regist.css" rel="stylesheet">
<form action="../jp.co.aforce.servlets/product-regist" method="post">

<section>
<a class="button" href=>商品情報登録</a>
<a class="button" href=>商品情報更新</a>
<a class="button" href=>商品情報削除</a>
</section>

<p>商品情報登録</p>

<p>商品ID：<input type ="text" name = "product_id" required="required"></p>
<p>商品名：<input type ="text" name = "product_name" required="required"></p>
<p>商品値段：<input type ="text" name = "price" required="required"></p>
<p>商品詳細：<textarea name = "information" cols="30" rows="5" required="required"></textarea></p>

<div>
<p>
<input type ="button" onclick="location.href='top.jsp'" value ="戻る">
<input type ="reset" value ="リセット">
<input type ="submit" value ="登録">
</p>
</div>


<p>${message}</p>

</form>

<%@include file="../footer.html" %>