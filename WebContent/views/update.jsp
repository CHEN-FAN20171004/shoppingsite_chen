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

<p>ä¼å¡æå ±æ´æ°</p>

<form action="../jp.co.aforce.servlets/search_update" method="post">
<p>ðUSERID</p>
<input type ="text" name = "id" required="required"  value = "${member.id}">
<p>ðPASSWORD</p>
<input type ="password" name = "password" required="required"  value = "${member.password}">
<div>
<p><input type ="submit" value ="æ¤ç´¢"></p>
</div>
</form>

<form action="../jp.co.aforce.servlets/update" method="post">

<p>ðåå</p>
<p>
å§  <input type ="text" name = "last_name" required="required" value = "${member.last_name}" >
  å  <input type ="text" name = "first_name" required="required" value = "${member.first_name}">
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
<option value="">-</option>
<option value="1920">1920</option>
<option value="1921">1921</option>
<option value="1922">1922</option>
<option value="1923">1923</option>
<option value="1924">1924</option>
<option value="1925">1925</option>
<option value="1926">1926</option>
<option value="1927">1927</option>
<option value="1928">1928</option>
<option value="1929">1929</option>
<option value="1930">1930</option>
<option value="1931">1931</option>
<option value="1932">1932</option>
<option value="1933">1933</option>
<option value="1934">1934</option>
<option value="1935">1935</option>
<option value="1936">1936</option>
<option value="1937">1937</option>
<option value="1938">1938</option>
<option value="1939">1939</option>
<option value="1940">1940</option>
<option value="1941">1941</option>
<option value="1942">1942</option>
<option value="1943">1943</option>
<option value="1944">1944</option>
<option value="1945">1945</option>
<option value="1946">1946</option>
<option value="1947">1947</option>
<option value="1948">1948</option>
<option value="1949">1949</option>
<option value="1950">1950</option>
<option value="1951">1951</option>
<option value="1952">1952</option>
<option value="1953">1953</option>
<option value="1954">1954</option>
<option value="1955">1955</option>
<option value="1956">1956</option>
<option value="1957">1957</option>
<option value="1958">1958</option>
<option value="1959">1959</option>
<option value="1960">1960</option>
<option value="1961">1961</option>
<option value="1962">1962</option>
<option value="1963">1963</option>
<option value="1964">1964</option>
<option value="1965">1965</option>
<option value="1966">1966</option>
<option value="1967">1967</option>
<option value="1968">1968</option>
<option value="1969">1969</option>
<option value="1970">1970</option>
<option value="1971">1971</option>
<option value="1972">1972</option>
<option value="1973">1973</option>
<option value="1974">1974</option>
<option value="1975">1975</option>
<option value="1976">1976</option>
<option value="1977">1977</option>
<option value="1978">1978</option>
<option value="1979">1979</option>
<option value="1980">1980</option>
<option value="1981">1981</option>
<option value="1982">1982</option>
<option value="1983">1983</option>
<option value="1984">1984</option>
<option value="1985">1985</option>
<option value="1986">1986</option>
<option value="1987">1987</option>
<option value="1988">1988</option>
<option value="1989">1989</option>
<option value="1990">1990</option>
<option value="1991">1991</option>
<option value="1992">1992</option>
<option value="1993">1993</option>
<option value="1994">1994</option>
<option value="1995">1995</option>
<option value="1996">1996</option>
<option value="1997">1997</option>
<option value="1998">1998</option>
<option value="1999">1999</option>
<option value="2000">2000</option>
<option value="2001">2001</option>
<option value="2002">2002</option>
<option value="2003">2003</option>
<option value="2004">2004</option>
<option value="2005">2005</option>
<option value="2006">2006</option>
<option value="2007">2007</option>
<option value="2008">2008</option>
<option value="2009">2009</option>
<option value="2010">2010</option>
<option value="2011">2011</option>
<option value="2012">2012</option>
<option value="2013">2013</option>
<option value="2014">2014</option>
<option value="2015">2015</option>
<option value="2016">2016</option>
<option value="2017">2017</option>
<option value="2018">2018</option>
<option value="2019">2019</option>
<option value="2020">2020</option>

<c:if test="${not empty member.birth_year}">
			<option value = "${member.birth_year}"selected>${member.birth_year}</option>
		</c:if>
</select>å¹´

<select name="birth_month">
<option value="">-</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>

<c:if test="${not empty member.birth_month}">
		<option value = "${member.birth_month}"selected>${member.birth_month}</option>
		</c:if>
</select>æ

<select name="birth_day">
<option value="">-</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>

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
<input type ="submit" value ="æ´æ°">
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





























