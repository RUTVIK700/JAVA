<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="mydb.DBConnection"%>
    <%@page import="java.sql.SQLException"%>
    <%@page import="java.sql.ResultSet" %>
    <%@page import="java.sql.PreparedStatement" %>
    <%@page import="java.sql.Connection" %>
  
  

</body> 
    
<table border="border: 1px solid black" style="width:100%">
		<colgroup>
       <col span="1" style="width: 20%;">
       <col span="1" style="width: 20%;">
       <col span="1" style="width: 15%;">
    </colgroup>
    
    	
    <tr>
		<th>Answer</th>
		</tr>
	
		<tbody>
		
		  
	
<%

DBConnection db=new DBConnection();

Connection conn = DBConnection.getConnection();
//String result = "Data Entered Successfully..";
String sql = "select * from rutvikdb.answer";
try {
	PreparedStatement ps = conn.prepareStatement(sql);
	ResultSet rs= ps.executeQuery();
	while(rs.next())
	{
		String ans=rs.getString(1);
		//String qd=rs.getString(2);
		//String ans=rs.getString(3);
		//String qd=rs.getString("detailquestion");
		%>
		<tr>	
	    <td><p><%=ans%></p></td></tr>
		
		<%
	//	return true;
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
//	return false;
}

%>
</tbody>
		</table>
