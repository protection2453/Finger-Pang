<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="/css/joinStep2.css">
<!DOCTYPE html>
    <head>
    </head>
<body>
    <form:form id="auth-form" role="form" modelAttribute="joinStep2Command" action="/join/step2" method="post">
        <div id="join-form" class="joinstep2-form">
            <div>
            <p>회원 정보 입력</p>
            </div>
            <table width="500" style="padding:5px 0 5px 0; ">
                <tr height="2" backgroundcolor="gray"><td colspan="2"></td></tr>
                <tr> 
                    <th> 아이디</th>
                    <td><input type="text" name="user_id"></td>
                </tr>
                <tr>
                    <th> 비밀번호</th>
                    <td><input type="password" name="user_pw"></td>
                </tr>
                <tr>
                    <th> 비밀번호 확인</th>
                    <td><input type="password" name="user_pw_re"></td>
                </tr>
                <tr>
                    <th> 닉네임</th>
                    <td><input type="text" name="nickname"></td>
                </tr>
                <tr>
                    <th> 나이</th>
                    <td><select name="age">
                        <option >선택하세요</option>
                        <option value="20">20</option>
                        <option value="21">21</option>
                        <option value="22">22</option>
                    </td>
                </tr>
                <tr>
                    <th> 성별</th>
                    <td>
                        <input type="checkbox" class="man"><label for="man">남</label>
                        <input type="checkbox" class="woman"><label for="woman">여</label>
                    </td>
                </tr>
                <tr>
                    <th> 직업</th>
                    <td><select name="job">
                        <option>선택하세요</option>
                        <option value="it">IT/기술직</option>
                        <option value="samu">사무직</option>
                        <option value="constructor">건설직</option>
                    </td>
                </tr>
                <tr>
                    <th> 거주지역</th>
                    <td><select name="area">
                        <option>선택하세요</option>
                        <option value="Seoul">서울</option>
                        <option value="Busan">부산</option>
                        <option value="Daegu">대구</option>
                    </td>
                </tr>
                <tr>
                    <th> 종교</th>
                    <td><select name="religion">
                        <option>선택하세요</option>
                        <option value="religion1">천주교</option>
                        <option value="religion2">기독교</option>
                        <option value="religion3">불교</option>
                    </td>
                </tr>
            </table></br></br>
            <a href="/join/step3" class="btn_join_next2" id="next-button2">다음 (1/2)</a>
        </div>
        
    </form:form>
</body>
</html>

