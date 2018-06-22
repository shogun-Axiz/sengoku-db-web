<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="Shift-JIS">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>武将更新</title>
<!-- BootstrapのCSS読み込み -->
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<!-- jQuery読み込み -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- BootstrapのJS読み込み -->
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<nav
		class="navbar navbar-fixed-top navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="menu.jsp" style="font-size: 36px;">戦国武将図鑑</a>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="menu.jsp">メニューに戻る<span
						class="sr-only">(current)</span></a></li>
			</ul>
		</div>
	</nav>
	<div class="errmsg"
		style="font-size: 24px; text-align: center; color: #fff;">
		<c:if test="${not empty msg}">
			<p>${msg}</p>
		</c:if>
	</div>
	<br>
	<div class="logout"
		style="color: white; font-size: 36px; text-align: center;">
		更新を行うデータの武将名を入力してください</div>
	<br>
	<br>
	<form action="./update" method="post">
		<fieldset>
			<div class="inputRow">
				<label class="required">武将名</label><input type="text" name="name">
			</div>
		</fieldset>
		<br> <br>
		<div class="registrationButton">
			<input type="submit" value="確認">
		</div>
	</form>
	<footer class="footer fixed-bottom">
		<div class="container">
			<p class="text-muted">2015 DeNA Co., Ltd</p>
		</div>
	</footer>
</body>
</html>