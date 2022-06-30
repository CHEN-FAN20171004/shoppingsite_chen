<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<section>
<a class="button" href="product-regist.jsp">商品情報登録</a>
<a class="button" href="product-update.jsp">商品情報更新</a>
<a class="button" href="product-delete.jsp">商品情報削除</a>
</section>

<style>

.button {
  display: block;
  color: black;
  font-size: 16px;
  padding: 1.5rem .5rem;
  background-color: #FEE7E7;
  text-align: center;
  text-decoration: none;
}
section {
  max-width: 200px;
  margin: 0 auto;
}

</style>

<%@include file="../footer.html" %>