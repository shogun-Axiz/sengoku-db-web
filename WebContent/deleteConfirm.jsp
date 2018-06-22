<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="ja">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>武将更新内容入力</title>
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
	<div class="logout"
		style="color: white; font-size: 36px; text-align: center;">
		これでよろしいですか？</div>

	<form action="./deleteConfirm" method="post">
		<fieldset>
			<c:forEach var="select" items="${select}">
				<div class="nameRow">
					<div class="col-xs-3">
						<label>武将名</label><input type="text" name="name"
							value="${select.name }" readonly>
					</div>
				</div>
				<div class="inputRow">
					<div class="col-xs-3">
						<label>主家</label><input type="text" name="owner"
							value="${select.owner }" readonly>
					</div>
				</div>
				<div class="inputRow">
					<div class="col-xs-3">
						<label>兵科</label><input type="text" name="warrior"
							value="${select.warrior }" readonly>
					</div>
				</div>
				<div class="nameRow">
					<div class="col-xs-3">
						<label>タイプ</label><input type="text" name="type"
							value="${select.type }" readonly>
					</div>
				</div>
			</c:forEach>
		</fieldset>
		<div class="registrationButton">
			<input type="submit" name="button" value="削除"> <input
				type="submit" name="button" value="戻る"
				onclick="location.href='delete.jsp'; return false;">
		</div>
	</form>
	<footer class="footer fixed-bottom">
		<div class="container">
			<p class="text-muted">2015 DeNA Co., Ltd</p>
		</div>
	</footer>
</body>
</html>