<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="Shift-JIS">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>武将検索結果</title>
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
	<br>
	<br>
	<table class="table">
		<thead style = "color : #fff; font-size: 36px;">
			<tr>
				<th>武将名</th>
				<th>主家</th>
				<th>兵科</th>
				<th>タイプ</th>
			</tr>
		</thead>
		<tbody style = "color : #fff; font-size: 36px;">
			<c:forEach var="select" items="${selectList}">
				<tr>
					<td>${fn:escapeXml(select.name)}</td>
					<td>${fn:escapeXml(select.owner)}</td>
					<td>${fn:escapeXml(select.warrior)}</td>
					<td>${fn:escapeXml(select.type)}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="returnMenu">
		<a href="menu.jsp">メニューに戻る</a>
	</div>
	<footer class="footer fixed-bottom">
		<div class="container">
			<p class="text-muted">2015 DeNA Co., Ltd</p>
		</div>
	</footer>
</body>
</html>