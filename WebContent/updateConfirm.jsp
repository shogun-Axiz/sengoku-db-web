<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="Shift-JIS">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>武将更新内容入力</title>
		<!-- BootstrapのCSS読み込み -->
		<link href="css/bootstrap.css" rel="stylesheet">
		<link href="css/style.css" rel="stylesheet">
		<!-- jQuery読み込み -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<!-- BootstrapのJS読み込み -->
		<script src="js/bootstrap.min.js"></script>
		<style>
		.col {
			text-align : center;;
			color : #fff;
		}

		.col-clear {
			clear: both;
			text-align : center;
			font-size : 36px;
		}

		#arrow {
			margin-top: 60px;
		}
		</style>
	</head>
	<body>
		<nav class="navbar navbar-fixed-top navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="menu.jsp" style="font-size: 36px;">戦国武将図鑑</a>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active">
						<a class="nav-link" href="menu.jsp">メニューに戻る<span class="sr-only">(current)</span></a>
					</li>
				</ul>
			</div>
		</nav>
		<div class="logout"  style=" color: white; font-size:  36px; text-align:  center;">
		  これでよろしいですか？
		</div>

		<form action="./updateConfirm" method="post">
			<fieldset class="col">
				<legend>変更前</legend>
				<c:forEach var="select" items="${select}">
					<div>
						<label>武将名</label><input type="text" value="${select.name}"
							disabled>
					</div>
					<div>
						<label>主家</label><input type="text" value="${select.owner }"
							disabled>
					</div>
					<div>
						<label>兵科</label><input type="text" value="${select.warrior }"
							 disabled>
					</div>
					<div>
						<label>タイプ</label><input type="text" value="${select.type }"
							 disabled>
					</div>
				</c:forEach>
			</fieldset>

			<fieldset class="col label-110">
				<legend>変更後</legend>
				<div>
					<label>武将名</label><input type="text" name="newCharactorName" value="${newName }"
						 readonly>
				</div>
				<div>
					<label>主家</label><input type="text" name="newOwner" value="${newOwner }"
						readonly>
				</div>

				<div>
					<label>兵科</label><input type="text" name="newWarrior" value="${newWarrior }" readonly>
				</div>
				<div>
					<label>タイプ</label><input type="text" name="newType" value="${newType }" readonly>
				</div>
			</fieldset>

			<div class="col-clear">
				<input type="submit" name="button" value="更新"> <input
					type="submit" name="button" value="戻る"
					onclick="location.href='updateInput.jsp'; return false;">
			</div>
		</form>
		<footer class="footer fixed-bottom">
			<div class="container">
				<p class="text-muted">2015 DeNA Co., Ltd</p>
			</div>
		</footer>
	</body>
</html>