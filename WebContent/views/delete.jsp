<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<%@taglib prefix="c"  uri = "http://java.sun.com/jsp/jstl/core" %>

<link href="../css/regist.css" rel="stylesheet">

<main>

<section>
<a class="button" href="regist.jsp">ðä¼å¡æå ±ç»é²</a>
<a class="button" href="update.jsp">ðä¼å¡æå ±æ´æ°</a>
<a class="button" href="delete.jsp">ðä¼å¡æå ±åé¤</a>
</section>

<p>ä¼å¡æå ±åé¤</p>

<form action="../jp.co.aforce.servlets/search_delete" method="post">
<p>ðUSERID</p>
<input type ="text" name = "id" required="required"  value = "${member.id}">
<p>ðPASSWORD</p>
<input type ="password" name = "password" required="required"  value = "${member.password}">
<div>
<p><input type ="submit" value ="æ¤ç´¢"></p>
</div>
</form>

<form action="../jp.co.aforce.servlets/delete" method="post">

<p>ðåå</p>
<p>
å§  <input type ="text" name = "last_name" required="required"  value = "${member.last_name}" >
  å  <input type ="text" name = "first_name" required="required"  value = "${member.first_name}">
</p>

<p>ðæ§å¥</p>
<c:choose>
<c:when test="${member.sex == '1'}">
				<input type="radio" name="sex" value="1" checked>ç·
				<input type="radio" name="sex" value="2">å¥³
				</c:when>
				<c:when test="${member.sex == '2'}">
				<input type="radio" name="sex" value="1">ç·
				<input type="radio" name="sex" value="2" checked>å¥³
				</c:when>
<c:otherwise>
<input type ="radio" name = "sex" value = "1">ç·
<input type ="radio" name = "sex" value = "2">å¥³
</c:otherwise>
</c:choose>

<p>ðçå¹´ææ¥</p>
<select name="birth_year">
<c:if test="${not empty member.birth_year}">
			<option value = "${member.birth_year}"selected>${member.birth_year}</option>
		</c:if>
</select>å¹´

<select name="birth_month">
<c:if test="${not empty member.birth_month}">
		<option value = "${member.birth_month}"selected>${member.birth_month}</option>
		</c:if>
</select>æ

<select name="birth_day">
<c:if test="${not empty member.birth_day}">
		<option value = "${member.birth_day}"selected>${member.birth_day}</option>
		</c:if>
</select>æ¥

<p>ðä½æ</p>
<input type ="text" name = "address" required="required" size="80" value = "${member.address}">

<p>ðé»è©±çªå·</p>
<input type ="tel" name = "phone_number" required="required" maxlength="11" value = "${member.phone_number}">

<p>ðã¡ã¼ã«ã¢ãã¬ã¹</p>
<input type ="email" name = "mail_address" required="required" value = "${member.mail_address}">


<div>
<p>
<input type ="button" onclick="location.href='top.jsp'" value ="æ»ã">
<input type ="reset" value ="ãªã»ãã">
<input type ="submit" value ="åé¤">
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





























