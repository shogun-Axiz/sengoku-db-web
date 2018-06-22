<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="Shift-JIS">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>新規登録</title>
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
		<a class="navbar-brand" href="index.jsp" style="font-size: 36px;">戦国武将図鑑</a>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="index.jsp">トップに戻る<span class="sr-only">(current)</span></a>
				</li>
			</ul>
		</div>
	</nav>
	<br>
	<div class="cfmmsg"
		style="font-size: 24px; text-align: center; color: #fff;">
		<p>これでよろしいですか？</p>
	</div>
	<br>
	<form action="./registrationConfirm" method="post">
		<fieldset>
			<div class="nameRow">
				<div class="col-xs-3">
					<label>城主名</label><input type="text" name="username" value="${newUserName}" readonly>
				</div>
			</div>
			<br>
			<div class="passRow">
				<div class="col-xs-3">
					<label>PASS</label><input type="password" name="password"
						value="${newUserPassword}" readonly>
				</div>
			</div>
		</fieldset>
		<br>
		<div class="registrationButton">
			<input type="submit" value="送信">
		</div>
	</form>
	<br>
	<div class="registationCorrection">
		<input type="submit" value="修正"
			onClick="location.href='registration.jsp'">
	</div>
	<footer class="footer fixed-bottom">
		<div class="container">
			<p class="text-muted">2015 DeNA Co., Ltd</p>
		</div>
	</footer>
</body>
</html>