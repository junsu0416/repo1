﻿<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="kor">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mandoo</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/생산현황.css">
</head>

<body>

    <!-- 메인 -->
    <div class="category">

        <!-- 메뉴 아이콘 -->
        <div class="menu-icon">
            <img class="menu-icon" src="${pageContext.request.contextPath}/image/menu.png">
        </div>

        <!-- 로고 아이콘 -->
        <div class="category-item">
            <a href="indexemp.jsp" class="category-link"><img class="logo-icon" src="${pageContext.request.contextPath}/image/logo.png"></a>
        </div>

        <!-- 카테고리 -->
        <div class="category-item">
            <a href="BOMemp.jsp" class="category-link">BOM</a>
        </div>

        <div class="category-item">
            <a href="작업지시서(작업자용)emp.jsp" class="category-link">생산계획</a>
        </div>

        <div class="category-item">
            <a href="재고현황emp.jsp" class="category-link">재고관리</a>
        </div>

        <div class="category-item">
            <a href="생산현황emp.jsp" class="category-link title">공정관리</a>
        </div>

        <div class="category-item">
            <a href="불량률파악보고서emp.jsp" class="category-link">불량률파악보고서</a>
        </div>
        <div class="category-item">
            <a href="마이페이지emp.jsp"><img class="mypage-icon" src="${pageContext.request.contextPath}/image/mypage.png"></a>
        </div>

    </div>
    <!-- 사이드바 -->
    <div class="sidebar">
        <ul id="sidebar-content">
            <li><a href="생산현황emp.jsp" class="category-link title">생산현황</a></li>
        </ul>
    </div>

    <!-- 내용페이지 -->
    <div class="progress-content">
        <div class="progress-home">
            <div class="progress-mandoo">
                <select class="progress-pick" id="progress-select">
                    <option value="all">전체</option>
                    <option value="b1"><a href="작업지시서.jsp">2024-050</a></option>
                    <option value="b2"><a href="작업지시서.jsp">2024-051</a></option>
                    <option value="b3"><a href="작업지시서.jsp">2024-052</a></option>
                </select>
            </div>
            <!-- 첫 번째 진행 바 -->
            <div class="probar" id="b1">
                <div class="progress-explain">
                    <span>1차 생산</span>
                    <span>1차 검수</span>
                    <span>2차 생산</span>
                    <span>2차 검수</span>
                    <span>포장</span>
                    <span>3차 검수</span>
                    <span>출하</span>
                </div>
                <div class="progress-container">
                    <div class="progress-line-container">
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                    </div>
                    <div class="progress-bar"></div>
                </div>
                <div class="procount">
                    <img src="${pageContext.request.contextPath}/image/갱신.png" class="pro-restart">
                    <br>
                    <span>생산 수량 | 20 BOX</span><br>
                    <span>불량 수량 | 1 BOX</span>
                </div>
                <div class="quality-explain">
                    <span>1차 검수</span>
                    <span>2차 검수</span>
                    <span>3차 검수</span>
                    <span>검수 완료</span>
                </div>
                <div class="quality-container">
                    <div class="quality-line-container">
                        <div class="quality-line"></div>
                        <div class="quality-line"></div>
                        <div class="quality-line"></div>
                        <div class="quality-line"></div>
                    </div>
                    <div class="quality-bar"></div>
                </div>
                <div class="qualcount">
                    <img src="${pageContext.request.contextPath}/image/갱신.png" class="pro-restart">
                    <br>
                    <span>1차 검수 | 적격</span><br>
                    <span>2차 검수 | 적격</span><br>
                    <span>3차 검수 | 부적격</span>
                </div>
            </div>
            <!-- 두 번째 진행 바 -->
            <div class="probar" id="b2" style="display: none;">
                <div class="progress-explain">
                    <span>1차 생산</span>
                    <span>1차 검수</span>
                    <span>2차 생산</span>
                    <span>2차 검수</span>
                    <span>포장</span>
                    <span>3차 검수</span>
                    <span>출하</span>
                </div>
                <div class="progress-container">
                    <div class="progress-line-container">
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                    </div>
                    <div class="progress-bar"></div>
                </div>
                <div class="procount">
                    <img src="${pageContext.request.contextPath}/image/갱신.png" class="pro-restart">
                    <br>
                    <span>생산 수량 | 30 BOX</span><br>
                    <span>불량 수량 | 3 BOX</span>
                </div>
                <div class="quality-explain">
                    <span>1차 검수</span>
                    <span>2차 검수</span>
                    <span>3차 검수</span>
                    <span>검수 완료</span>
                </div>
                <div class="quality-container">
                    <div class="quality-line-container">
                        <div class="quality-line"></div>
                        <div class="quality-line"></div>
                        <div class="quality-line"></div>
                        <div class="quality-line"></div>
                    </div>
                    <div class="quality-bar"></div>
                </div>
                <div class="qualcount">
                    <img src="${pageContext.request.contextPath}/image/갱신.png" class="pro-restart">
                    <br>
                    <span>1차 검수 | 적격</span><br>
                    <span>2차 검수 | 적격</span><br>
                    <span>3차 검수 | 부적격</span>
                </div>
            </div>
            <!-- 세 번째 진행 바 -->
            <div class="probar" id="b3" style="display: none;">
                <div class="progress-explain">
                    <span>1차 생산</span>
                    <span>1차 검수</span>
                    <span>2차 생산</span>
                    <span>2차 검수</span>
                    <span>포장</span>
                    <span>3차 검수</span>
                    <span>출하</span>
                </div>
                <div class="progress-container">
                    <div class="progress-line-container">
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                        <div class="progress-line"></div>
                    </div>
                    <div class="progress-bar"></div>
                </div>
                <div class="procount">
                    <img src="${pageContext.request.contextPath}/image/갱신.png" class="pro-restart">
                    <br>
                    <span>생산 수량 | 5 BOX</span><br>
                    <span>불량 수량 | 0 BOX</span>
                </div>
                <div class="quality-explain">
                    <span>1차 검수</span>
                    <span>2차 검수</span>
                    <span>3차 검수</span>
                    <span>검수 완료</span>
                </div>
                <div class="quality-container">
                    <div class="quality-line-container">
                        <div class="quality-line"></div>
                        <div class="quality-line"></div>
                        <div class="quality-line"></div>
                        <div class="quality-line"></div>
                    </div>
                    <div class="quality-bar"></div>
                </div>
                <div class="qualcount">
                    <img src="${pageContext.request.contextPath}/image/갱신.png" class="pro-restart">
                    <br>
                    <span>1차 검수 | 적격</span><br>
                    <span>2차 검수 | 적격</span><br>
                    <span>3차 검수 | 부적격</span>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/JS/생산현황.js"></script>
    </div>
</body>

</html>
