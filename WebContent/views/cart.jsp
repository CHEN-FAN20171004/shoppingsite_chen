<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<link href="../css/cart.css" rel="stylesheet">
<script type="text/javascript" src="../js/cart.js"></script>


<div id="wrapper">
    <a class="back_btn" href="shop.jsp">🍓買い物に戻る🍓</a>
    <div class="conteiner">
      <h1>購入確認</h1>
      <ul id="js_shopping_list" class="shopping_list">
      </ul>
      <div class="total">
          <span class="yen_symbol">¥</span>
          <span id="js_total"></span>
      </div>
      <button id="js_confirm" class="confirm_btn">購入確定</button>
    </div>
  </div>


<%@include file="../footer.html" %>