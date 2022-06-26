<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.connections.DBConnection"%>
    <%@page import="java.sql.SQLException"%>
    <%@page import="java.sql.ResultSet" %>
    <%@page import="java.sql.PreparedStatement" %>
    <%@page import="java.sql.Connection" %>
  
  
  <script type="text/javascript">
    document.getElementById("demo").onclick = function () {
        location.href = "Answer.jsp";
    };
</script>

</body> 
    
<table border="border: 1px solid black" style="width:100%">
		<colgroup>
       <col span="1" style="width: 20%;">
       <col span="1" style="width: 20%;">
       <col span="1" style="width: 15%;">
    </colgroup>
    
    	
    <tr>
		<th>Question</th>
		<th>Detail Question</th>
		<th>UserName</th>
		</tr>
	
		<tbody>
		
		  
	
<%

DBConnection db=new DBConnection();

Connection conn = DBConnection.getConnection();
//String result = "Data Entered Successfully..";
String sql = "select * from question";
try {
	PreparedStatement ps = conn.prepareStatement(sql);
	ResultSet rs= ps.executeQuery();
	while(rs.next())
	{
		String q=rs.getString(1);
		String qd=rs.getString(2);
		String ud=rs.getString(3);
		//String qd=rs.getString("detailquestion");
		%>
		<tr>	
	    <td><p id="demo"><%=q%></p></td>
		<td><p id="demo"><%=qd%></p></td>
		<td><p><%=ud%></p></td></tr>
		
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
