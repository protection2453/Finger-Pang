<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="/static/css/joinStep1.css">
<!DOCTYPE html>
    <head>
        <script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.9.0/jquery.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
            $("#join_chkAll").click(function() {
                if ($("#join_chkAll").is(':checked')){
                    $("input[type=checkbox]").prop("checked", true);
                }else{
                    $("input[type=checkbox]").prop("checked", false);
                }
            });
        });
        </script>
    </head>
<body>
    <form:form id="auth-form" role="form" action="/join/step2" method="post">
        <div id="join-form" class="joinstep1-form">
            <input type="checkbox" id="join_chkAll"><label for="join_chkAll">핑거팡의 서비스 이용 약관, 개인정보 수집 및 이용동의에 모두 동의합니다.</label></input>
            </br></br></br>
            <input type="checkbox" name="join_chk1"><label for="join_chk1">핑거팡 서비스 이용약관</label></input></br></br>
            <textarea id="join_text1" rows="10" cols="100"> 이하 핑거팡 서비스 이용약관 내용</textarea>
        </br></br></br>
            <input type="checkbox" name="join_chk2"><label for="join_chk2">개인정보 수집 및 이용 동의</label></br></br></input>
            <textarea id="join_text2" rows="10" cols="100"> 이하 개인정보 수집 및 이용 동의에 관한 내용</textarea>
    </br></br></br>
            
            <button type="submit" class="btn_join_next1" id="next-button">다음 (1/2)</button>
        </div>
        
    </form:form>
</body>
</html>

