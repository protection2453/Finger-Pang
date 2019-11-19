<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="/css/joinStep2.css">
<!DOCTYPE html>
    <head>
    </head>
<body>
    <form:form id="auth-form" role="form" modelAttribute="joinStep1Command" action="/join/step1" method="post">
        <div id="join-form" class="joinstep2-form">
            <div>
            <span>회원 정보 입력</span></br></br>
            </div>
            <a href="/join/step3" class="btn_join_next2" id="next-button2">다음 (1/2)</a>
        </div>
        
    </form:form>
</body>
</html>

