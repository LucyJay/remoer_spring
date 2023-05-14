<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<div class="container">
		<h1>비밀번호 찾기 결과</h1>
		<c:if test="${newPw ne null }">
		회원님의 비밀번호가  ${newPw }로 변경되었습니다.<br>
		로그인 후 원하는 비밀번호로 변경하시기 바랍니다.
	</c:if>
	<c:if test="${newPw eq null }">
		일치하는 정보가 없습니다. 회원가입을 먼저 해 주세요.
	</c:if>
		<a href="/"><button>메인으로 이동</button></a>
		
	</div>
</body>
</html>