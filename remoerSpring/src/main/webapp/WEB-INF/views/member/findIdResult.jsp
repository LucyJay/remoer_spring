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
	<h1>아이디 찾기 결과</h1>
	<c:if test="${findId ne null }">
		회원님의 아이디는 ${findId }입니다.
	</c:if>
	<c:if test="${findId eq null }">
		일치하는 정보가 없습니다. 회원가입을 먼저 해 주세요.
	</c:if>
	<a href="/"><button>메인으로 이동</button></a>
	</div>
</body>
</html>