<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<div class="container">
	<h1>아이디 찾기</h1><br>
	<form action="/member/findId.do" method="post">
		<label for="name">이름</label>
		<input name="name"><br>
		<label for="tel">전화번호('-' 포함)</label>
		<input name="tel">
		<button>아이디 찾기</button>
	</form>
	</div>
</body>
</html>