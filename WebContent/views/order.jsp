<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<p>${cart.size()}種類の商品があります。</p>
<hr>
<table style="border-collapse:separate;border: -spacing:10px;">

<tr>
<td>商品</td>
<td><img src="../img/cake1.jpg" width="50%"></td>
<td>いちごケーキ</td>
<td>500円</td>
<td>個</td>
</tr>
</table>

<hr>

<form action="../jp.co.aforce.servlets/" method="post">

<p>🍓お届け先を選択してください。</p>
<input type ="radio" name = "address" value = "現住所">現住所
<p><input type ="radio" name = "address" value = "新しい住所">新しい住所</p>
<p>
郵便番号：<input type ="text" name = "new-address" size="10">
住所：<input type ="text" name = "new-address" size="70">
</p>

<p>🍓お支払い方法を選択してください。</p>
<input type ="radio" name = "payment" value = "代引き">代引き
<input type ="radio" name = "payment" value = "クレジットカード">クレジットカード
<input type ="radio" name = "payment" value = "銀行振込">銀行振込
<input type ="radio" name = "payment" value = "コンビニ払い">コンビニ払い
<input type ="radio" name = "payment" value = "PayPay">PayPay

<p>🍓配送方法を選択してください。</p>
<input type ="radio" name = "delivery" value = "宅配便">宅配便
<input type ="radio" name = "delivery" value = "クール便">クール便

<p><input type ="submit" value ="注文送信" ></p>

</form>

<%@include file="../footer.html" %>