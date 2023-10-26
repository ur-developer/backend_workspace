<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<% 
	Context ctx = new InitialContext();
	DataSource dataFactory = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");
	Connection con = dataFactory.getConnection();

	// 페이지1 목록 얻기 
	String sql = "SELECT * FROM TRAVEL LIMIT ?, ?";
	
	PreparedStatement stmt = con.prepareStatement(sql);
	stmt.setInt(1, 0);
	stmt.setInt(2, 10);
	
	// SELECT QUREY 실행 excuteQuery()
	// INSERT, UPDATE, DELETE --> excuteUpdate()
	ResultSet rs = stmt.executeQuery();
%>


  <body>
    <div class="container">
    <h1>
   	  100대 관광지 목록 보기	
    </h1>
    
    <table class="table table-hover">
       <thead>
          <tr>
              <th>No</th>
              <th>권역</th>
              <th>타이틀</th>
		 </tr>
	   </thead>
	   <tbody>
<%
	while(rs.next()) {
		int no = rs.getInt("no");
		String region = rs.getString("region");
		String title = rs.getString("title");
%>	   
     	 <%
			if(no%2 == 0) { // 짝수이면
	     %>
	        <tr style="background:blue">
	     <%
			} else {
	     %>
	        <tr style="background:yellow">
	     <% } %>
	     <tr>
	         <td><%=no%></td>
	         <td><%=region%></td>
	         <td><%=title%></td>
		</tr>	 
<%
	}
%>		
      </tbody>
	 </table>
<%
	rs.close();
	stmt.close();
	con.close();
%>
	

    </div>
  </body>
<%@ include file="footer.jsp" %>