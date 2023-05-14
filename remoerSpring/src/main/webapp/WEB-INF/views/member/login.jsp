<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

	<div class="container">로그인</div>

		<form action="/member/login.do" method="post">
			<label for="id">아이디</label><input name="id"><br>
			<label for="pw">비밀번호</label><input name="pw"><br>
			<button>로그인</button>
		</form>
		<a href="/member/findId.do">아이디 찾기</a><br>
		<a href="/member/findPw.do">비밀번호 찾기</a>

</body>
</html>