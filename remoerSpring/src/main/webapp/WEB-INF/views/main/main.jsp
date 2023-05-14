<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<body>
<h1>Main</h1>
	<c:if test="${login eq null }">
		<a href="/member/login.do">로그인</a><br>
		<a href="/member/join.do">회원가입</a>
	</c:if>
	<c:if test="${login ne null }" >
		<a href="/member/logout.do">로그아웃</a>
	</c:if>
</body>
</html>