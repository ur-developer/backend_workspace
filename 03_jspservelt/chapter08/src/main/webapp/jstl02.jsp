<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>    
    
<%@ include file="header.jsp" %>
  <body>
    <div class="container">
    <h1>
		c:if 태그
    </h1>
    <hr>
    <c:set var="myColor" value="파랑" />
    <c:if test="${myColor == '빨강'}">  <!-- == 내용검사  -->
    색상은 빨강색이다.
	</c:if>
	<c:if test="${myColor != '빨강'}">  <!-- == 내용검사  -->
    색상은 빨강색이 아닙니다.
      </c:if>
    
    
    </div>
  </body>
<%@ include file="footer.jsp" %>