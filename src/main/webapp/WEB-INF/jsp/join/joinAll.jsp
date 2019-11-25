<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!--
<link rel="stylesheet" type="text/css" href="/static/css/skel.css" />
<link rel="stylesheet" type="text/css" href="/static/css/style.css" />
<link rel="stylesheet" type="text/css" href="/static/css/style-xlarge.css" />
-->
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>join</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="js/html5shiv.js"></script><![endif]
		<script src="/static/js/jquery.min.js"></script>
		<script src="/static/js/skel.min.js"></script>
		<script src="/static/js/skel-layers.min.js"></script>
        <script src="/static/js/init.js"></script>
        -->
	</head>
	<body>

		<!-- Header -->
			<header id="header">
				<h1><a href="index.html">Transit</a></h1>
				<nav id="nav">
					<ul>
						<li><a href="index.html">Home</a></li>
						<li><a href="generic.html">Generic</a></li>
						<li><a href="elements.html">Elements</a></li>
						<li><a href="#" class="button special">Sign Up</a></li>
					</ul>
				</nav>
			</header>

        <!-- Main -->
        <form:form role="form" modelAttribute="joinDTO" action="join/joinfin" method="post">
			<section id="main" class="wrapper">
				<div class="container">
                <header class="major">
                    <h2>회원가입</h2>
                    <p>모두 작성해주시면 50크레딧을 드립니다!</p>
                </header>
                <!-- Form -->
                <section>
                    <h3>회원가입 항목</h3>
                    <form>
                        <div class="row uniform 50%">
                            <div class="6u 12u$(4)">
                                <input type="text" name="nickname" id="name" value="" placeholder="닉네임" path="nickname"/>
                            </div>
                            <div class="6u$ 12u$(4)">
                                <input type="text" name="id" id="id" value="" placeholder="아이디" autocomplete="username" path="id"/>
                            </div>
                            <div class="6u 12u$(4)">
                                <input type="password" name="password" id="password" autocomplete="current-password" path="password"/>
                            </div>
                            <div class="6u$ 12u$(4)">
                                <input type="password" name="password_confirm" autocomplete="new-password" id="password_confirm" />
                            </div>
                            <div class="6u$ 12u$(4)">
                                <input type="text" name="phone" id="phone" value="" placeholder="연락처(-를 빼고 적어주세요.)" path="phone"/>
                            </div>
                            <div class="4u 12u$(3)">
                                    <input type="radio" id="man" name="man" path="gender" value="1" >
                                    <label for="man">남성</label>
                                </div>
                                <div class="4u 12u$(3)">
                                    <input type="radio" id="woman" name="woman" path="gender" value="2">
                                    <label for="woman">여성</label>
                                </div>
                        </div>
        </form>
                </select>
                    <br>
                    <h3>수집 항목</h3>
                            <div class="12u$">
                                <div class="select-wrapper" >
                                    <p><b>1. 당신의 현재 직종은?</b></p>
                                    <select name="category" id="category1" path="job">
                                        <option value="">- 선택 -</option>
                                        <option value="1">경영·사무</option>
                                        <option value="2">영업·고객상담</option>
                                        <option value="3">IT·인터넷</option>
                                        <option value="4">디자인</option>
                                        <option value="5">서비스</option>
                                        <option value="6">전문직</option>
                                        <option value="7">의료</option>
                                        <option value="8">생산·제조</option>
                                        <option value="9">건설</option>
                                        <option value="10">유통·무역</option>
                                        <option value="11">미디어</option>
                                        <option value="12">교육</option>
                                        <option value="13">특수계층·공공</option>
                                        <option value="14">학생</option>
                                        <option value="15">군인</option>
                                        <option value="16">무직</option>
                                    </select>
                                    <br><p><b>2. 당신이 사는 지역은?</b></p>
                                    <select name="category" id="category2" path="area">
                                        <option value="">- 선택 -</option>
                                        <option value="1">서울</option>
                                        <option value="2">경기</option>
                                        <option value="3">인천</option>
                                        <option value="4">부산</option>
                                        <option value="5">대구</option>
                                        <option value="6">광주</option>
                                        <option value="7">대전</option>
                                        <option value="8">울산</option>
                                        <option value="9">세종</option>
                                        <option value="10">강원</option>
                                        <option value="11">경남</option>
                                        <option value="12">경북</option>
                                        <option value="13">전남</option>
                                        <option value="14">전북</option>
                                        <option value="15">충남</option>
                                        <option value="16">충북</option>
                                        <option value="17">제주</option>
                                        <option value="18">해외</option>
                                    </select>
                                    
                                    <br><p><b>3. 당신의 연령대는?</b></p>
                                    <select name="category" id="category3" path="age">
                                        <option value="">- 선택 -</option>
                                        <option value="1">10대</option>
                                        <option value="2">20대</option>
                                        <option value="3">30대</option>
                                        <option value="4">40대</option>
                                        <option value="5">50대</option>
                                        <option value="6">60대</option>
                                        <option value="7">65세 이상</option>
                                    </select>
                                    <br><p><b>4. 당신의 종교는?</b></p>
                                    <select name="category" id="category4" path="religion">
                                        <option value="">- 선택 -</option>
                                        <option value="1">무교</option>
                                        <option value="2">기독교</option>
                                        <option value="3">천주교</option>
                                        <option value="4">불교</option>
                                        <option value="5">이슬람</option>
                                        <option value="6">힌두교</option>
                                        <option value="7">기타</option>
                                    </select>
                                    <br><p><b>5. 취미가 어떻게 되시나요?</b></p>
                                    <select name="category" id="category5" path="hobby">
                                        <option value="">- 선택 -</option>
                                        <option value="1">운동</option>
                                        <option value="2">보드게임</option>
                                        <option value="3">웹서핑</option>
                                        <option value="4">쇼핑</option>
                                        <option value="5">애니메이션 및 만화</option>
                                        <option value="6">드라마 및 영화</option>
                                        <option value="7">스포츠 시청 및 관람</option>
                                        <option value="8">독서</option>
                                        <option value="9">공연관람</option>
                                        <option value="10">음악감상</option>
                                        <option value="11">악기·음악</option>
                                        <option value="12">애완동물</option>
                                        <option value="13">수다</option>
                                        <option value="14">DIY</option>
                                        <option value="15">요리</option>
                                        <option value="16">여행</option>
                                        <option value="17">명상</option>
                                        <option value="18">기타</option>
                                    </select>
                                    <br><p><b>6. 당신이 키우는 반려동물은?</b></p>
                                    <select name="category" id="category6" path="pet">
                                        <option value="">- 선택 -</option>
                                        <option value="1">없음</option>
                                        <option value="2">개</option>
                                        <option value="3">고양이</option>
                                        <option value="4">새</option>
                                        <option value="5">관상어</option>
                                        <option value="6">고슴도치</option>
                                        <option value="7">설치류</option>
                                        <option value="8">족제비</option>
                                        <option value="9">라쿤</option>
                                        <option value="10">파충류</option>
                                        <option value="11">기니피그</option>
                                        <option value="12">페럿</option>
                                        <option value="13">토끼</option>
                                        <option value="14">기타</option>
                                    </select>
                                    <br><p><b>7. 기혼 여부를 선택해주세요.</b></p>
                                    <div class="4u 12u$(3)">
                                            <input type="radio" id="marry" name="marry" path="marry" value="2" >
                                            <label for="marry">기혼</label>
                                    </div>
                                    <div class="4u 12u$(3)">
                                        <input type="radio" id="no-marry" name="no-marry" path="marry" value="1">
                                        <label for="no-marry">미혼</label>
                                    </div>
                                </div>
                            </div>    
                        </div>                                    
                </section>        
            <!-- Buttons -->
                <section>
                    <ul class="actions">
                        <li><button type="submit" class="button">완료</a></li>
                        <li><a href="#" class="button alt">취소</a></li>
                    </ul>
                </section>
            </form:form>
		<!-- Footer -->
			<footer id="footer">
				<div class="container">
					<section class="links">
						<div class="row">
							<section class="3u 6u(medium) 12u$(small)">
								<h3>Lorem ipsum dolor</h3>
								<ul class="unstyled">
									<li><a href="#">Lorem ipsum dolor sit</a></li>
									<li><a href="#">Nesciunt itaque, alias possimus</a></li>
									<li><a href="#">Optio rerum beatae autem</a></li>
									<li><a href="#">Nostrum nemo dolorum facilis</a></li>
									<li><a href="#">Quo fugit dolor totam</a></li>
								</ul>
							</section>
							<section class="3u 6u$(medium) 12u$(small)">
								<h3>Culpa quia, nesciunt</h3>
								<ul class="unstyled">
									<li><a href="#">Lorem ipsum dolor sit</a></li>
									<li><a href="#">Reiciendis dicta laboriosam enim</a></li>
									<li><a href="#">Corporis, non aut rerum</a></li>
									<li><a href="#">Laboriosam nulla voluptas, harum</a></li>
									<li><a href="#">Facere eligendi, inventore dolor</a></li>
								</ul>
							</section>
							<section class="3u 6u(medium) 12u$(small)">
								<h3>Neque, dolore, facere</h3>
								<ul class="unstyled">
									<li><a href="#">Lorem ipsum dolor sit</a></li>
									<li><a href="#">Distinctio, inventore quidem nesciunt</a></li>
									<li><a href="#">Explicabo inventore itaque autem</a></li>
									<li><a href="#">Aperiam harum, sint quibusdam</a></li>
									<li><a href="#">Labore excepturi assumenda</a></li>
								</ul>
							</section>
							<section class="3u$ 6u$(medium) 12u$(small)">
								<h3>Illum, tempori, saepe</h3>
								<ul class="unstyled">
									<li><a href="#">Lorem ipsum dolor sit</a></li>
									<li><a href="#">Recusandae, culpa necessita nam</a></li>
									<li><a href="#">Cupiditate, debitis adipisci blandi</a></li>
									<li><a href="#">Tempore nam, enim quia</a></li>
									<li><a href="#">Explicabo molestiae dolor labore</a></li>
								</ul>
							</section>
						</div>
					</section>
					<div class="row">
						<div class="8u 12u$(medium)">
							<ul class="copyright">
								<li>&copy; Untitled. All rights reserved.</li>
								<li>Design: <a href="http://templated.co">TEMPLATED</a></li>
								<li>Images: <a href="http://unsplash.com">Unsplash</a></li>
							</ul>
						</div>
						<div class="4u$ 12u$(medium)">
							<ul class="icons">
								<li>
									<a class="icon rounded fa-facebook"><span class="label">Facebook</span></a>
								</li>
								<li>
									<a class="icon rounded fa-twitter"><span class="label">Twitter</span></a>
								</li>
								<li>
									<a class="icon rounded fa-google-plus"><span class="label">Google+</span></a>
								</li>
								<li>
									<a class="icon rounded fa-linkedin"><span class="label">LinkedIn</span></a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</footer>
	</body>
</html>