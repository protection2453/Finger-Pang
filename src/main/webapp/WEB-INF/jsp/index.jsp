<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
</head>
<body>
<li>
    <a href="/login">로그인</a>
</li>
<li>
    <a href="/join/step1">회원가입(1/2)</a>
</li>
<li>
    <a href="/join/step2">회원가입(2/2)</a>
</li>
</body>

<!-- DB연동후 적용*********

<c:catch>
    <c:choose>
        <c:when test="${empty authInfo }">
            <li>
                <a href="/login"><i class="fa fa-sign-in"></i> 로그인</a>
            </li>
            <li>
                <a href="/join/step1"><i class="fa fa-user"></i> 회원가입</i></a>
            </li>
        </c:when>
        <c:otherwise>
            <c:choose>
               <li>
                   <p>${authInfo.nickname }님, 반갑습니다!</p>
               </li>
               <li>
                   <a href="/logout"><i class="fa fa-sign-out"></i> 로그아웃</a>
               </li> 
            </c:choose>
        </c:otherwise>
    </c:choose>
</c:catch>

-->