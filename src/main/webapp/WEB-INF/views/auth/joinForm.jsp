<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>블로그</title>
</head>
<body>
<h1>회원가입 페이지 입니다.</h1>
<hr/>
<!-- 시큐리티는 x-www-form-url-encoded 타입만 인식 -->
<form action="/join" method="post">
	<input type="text" name="username" placeholder="Username"/><br/>
	<input type="password" name="password" placeholder="Password"/><br/>
	<input type="email" name="email" placeholder="Email"/><br/>
	<button>회원가입</button>
</form>
이미 회원이신가요?<a href="/loginForm">로그인</a>

</body>
</html>