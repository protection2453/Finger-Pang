<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="/css/text.css">
<!DOCTYPE html>
<head>
<div class="title">핑거팡</div>
</head>
<body>
<form:form id="auth-form" role="form" modelAttribute="loginCommand" action="/login" method="post">
    <div id="login-form" class="login-form">
            <div class="inp_text">
                <form:input id="loginId" type="text" class="form-control" placeholder=" ID" path="id"/>
            </div>
            <div class="inp_text">
                <form:password id="loginPw" placeholder=" Password" path="pw"/>
            </div>
    <button type="submit" class="btn_login">로그인</button>
    <div class="login_append">
        <input type="checkbox" id="chk_id" path="rememberId"><label for="chk_id">아이디 기억</label></input>
        <a href="/member/find/loginId" class="link_findId">아이디</a>
        <span id="line">/</span>
        <a href="/member/find/loginPw" class="link_findPw">비밀번호 찾기</a>
    </br>
</br>
</br>
        <a href="/join/step1" class="link_join">아직 핑거팡회원이 아니신가요?</a>
    </div>
    </div>
</form:form>
</body>
</html>