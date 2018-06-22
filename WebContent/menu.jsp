<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>メニュー</title>
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
	<c:if test="${empty name}">
		<c:redirect url="./index.jsp" />
	</c:if>
	<nav
		class="navbar navbar-fixed-top navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="menu.jsp" style="font-size: 36px;">戦国武将図鑑</a>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item">
					<form action="logout" method="post">
						<input type="submit" value="ログアウト">
					</form>
				</li>
			</ul>
		</div>
	</nav>
	<br>
	<br>
	<c:choose>
		<c:when test="${name == '江戸'}">
			<div class="menuButton">
				<button type="button" class="btn btn-default btn-lg btn-block"
					onClick="location.href='select.jsp'">武将検索</button>

				<button type="button" class="btn btn-default btn-lg btn-block"
					onClick="location.href='insert.jsp'">武将追加</button>

				<button type="button" class="btn btn-default btn-lg btn-block"
					onClick="location.href='update.jsp'">武将更新</button>

				<button type="button" class="btn btn-default btn-lg btn-block"
					onClick="location.href='delete.jsp'">武将削除</button>
			</div>
		</c:when>
		<c:otherwise>
			<div class="menuButton">
				<button type="button" class="btn btn-default btn-lg btn-block"
					onClick="location.href='select.jsp'">武将検索</button>
			</div>
		</c:otherwise>
	</c:choose>
	<footer class="footer fixed-bottom">
		<div class="container">
			<p class="text-muted">2015 DeNA Co., Ltd</p>
		</div>
	</footer>
</body>
</html>