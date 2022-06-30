<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<link href="../css/regist.css" rel="stylesheet">
<%@taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core" %>


<section>
<a class="button" href=>商品情報登録</a>
<a class="button" href=>商品情報更新</a>
<a class="button" href=>商品情報削除</a>
</section>

<p>商品情報削除</p>

<form action="../jp.co.aforce.servlets/product-search" method="post">

<p>商品ID：</p>
<input type ="text" name = "product_id" required="required"  value = "${product.product_id}">
<div>
<p><input type ="submit" value ="検索"></p>
</div>
</form>

<form action="../jp.co.aforce.servlets/product-delete" method="post">
<p>商品名：<input type ="text" name = "product_name" required="required" value = "${product.product_name}"></p>
<p>商品値段：<input type ="text" name = "price" required="required" value = "${product.price}"></p>
<p>商品詳細：<textarea name = "information" cols="60" rows="6"  placeholder = "${product.information}"></textarea></p>

<div>
<p>
<input type ="button" onclick="location.href='product-regist.jsp'" value ="戻る">
<input type ="reset" value ="リセット">
<input type ="submit" value ="削除">
</p>
</div>


<p>${message}</p>

</form>
<%@include file="../footer.html" %>