<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.connections.DBConnection"%>
    <%@page import="java.sql.SQLException"%>
    <%@page import="java.sql.ResultSet" %>
    <%@page import="java.sql.PreparedStatement" %>
    <%@page import="java.sql.Connection" %>
   
<style>

  body,html
{
 color:white;
 background-color:#0F2C67;
 background-size: 1100px;
  height: 600px;
  width: 100%;
  margin:0;
  display: inline-block;
}
</style>
    
    	
	
<table border="border: 1px solid black;border-collapse:collapse "style="width:100% ;text-align:center;font-size:25px">
	

		
<%

DBConnection db=new DBConnection();

Connection conn = DBConnection.getConnection();
//String result = "Data Entered Successfully..";
String sql = "select question,detailedquestion from rutvikdb.question";

try {
	PreparedStatement ps = conn.prepareStatement(sql);

	ResultSet rs= ps.executeQuery();

	while(rs.next())
	{
		String q=rs.getString(1);
		String qd=rs.getString(2);
		//String ud=rs.getString(3);
		//String qd=rs.getString("detailquestion");
		%>
		
		
		<tr>
		<td><p>Question :: <%=q%></p>
		<p>Detail Question :: <%=qd%>

<form action="AnswerServlet" method="post">		
		<textarea cols="80%" name="answer" rows="5" placeholder="Answer." style="margin-top:2% ;width:80%"></textarea><br>
		
		
		<button type="submit" style="margin-top:2%">Answer</button>
		
		</form>		
		</td>
		</tr>

		<%
	//	return true;
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
//	return false;
}

%>


</table>

		
