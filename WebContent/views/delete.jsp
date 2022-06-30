<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<%@taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core" %>

<link href="../css/regist.css" rel="stylesheet">

<main>

<section>
<a class="button" href="regist.jsp">🍓会員情報登録</a>
<a class="button" href="update.jsp">🍓会員情報更新</a>
<a class="button" href="delete.jsp">🍓会員情報削除</a>
</section>

<p>会員情報削除</p>

<form action="../jp.co.aforce.servlets/search_delete" method="post">
<p>🍓USERID</p>
<input type ="text" name = "id" required="required"  value = "${member.id}">
<p>🍓PASSWORD</p>
<input type ="password" name = "password" required="required"  value = "${member.password}">
<div>
<p><input type ="submit" value ="検索"></p>
</div>
</form>

<form action="../jp.co.aforce.servlets/delete" method="post">

<p>🍓名前</p>
<p>
姓  <input type ="text" name = "last_name" required="required"  value = "${member.last_name}" >
  名  <input type ="text" name = "first_name" required="required"  value = "${member.first_name}">
</p>

<p>🍓性別</p>
<c:choose>
<c:when test="${member.sex == '1'}">
				<input type="radio" name="sex" value="1" checked>男
				<input type="radio" name="sex" value="2">女
				</c:when>
				<c:when test="${member.sex == '2'}">
				<input type="radio" name="sex" value="1">男
				<input type="radio" name="sex" value="2" checked>女
				</c:when>
<c:otherwise>
<input type ="radio" name = "sex" value = "1">男
<input type ="radio" name = "sex" value = "2">女
</c:otherwise>
</c:choose>

<p>🍓生年月日</p>
<select name="birth_year">
<c:if test="${not empty member.birth_year}">
			<option value = "${member.birth_year}"selected>${member.birth_year}</option>
		</c:if>
</select>年

<select name="birth_month">
<c:if test="${not empty member.birth_month}">
		<option value = "${member.birth_month}"selected>${member.birth_month}</option>
		</c:if>
</select>月

<select name="birth_day">
<c:if test="${not empty member.birth_day}">
		<option value = "${member.birth_day}"selected>${member.birth_day}</option>
		</c:if>
</select>日

<p>🍓住所</p>
<input type ="text" name = "address" required="required" size="80" value = "${member.address}">

<p>🍓電話番号</p>
<input type ="tel" name = "phone_number" required="required" maxlength="11" value = "${member.phone_number}">

<p>🍓メールアドレス</p>
<input type ="email" name = "mail_address" required="required" value = "${member.mail_address}">


<div>
<p>
<input type ="button" onclick="location.href='top.jsp'" value ="戻る">
<input type ="reset" value ="リセット">
<input type ="submit" value ="削除">
</p>
</div>

<p>${message}</p>

</form>

</main>
<div class="wrapper">

    <p><img class="apng-image" src="http://coco-factory.jp/ugokuweb/wp-content/themes/ugokuweb/data/move02/9-1/img/ezgif.com-gif-maker.gif" alt=""></p>

  </div>
<div class="wrapper2">

    <p><img class="apng-image" src="http://coco-factory.jp/ugokuweb/wp-content/themes/ugokuweb/data/move02/9-1/img/ezgif.com-gif-maker.gif" alt=""></p>

  </div>


<%@include file="../footer.html" %>





























