package com.rutvik.Prepared;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PreparedSatetment
 */
@WebServlet("/PreparedSatetment")
public class PreparedSatetment extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection c;
	private PreparedStatement st;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 c=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "userdb", "Rutvik@1234");
			 st = c.prepareStatement("insert into product values(?,?,?,?)");
			 
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id= Integer.parseInt(req.getParameter("id"));
		String name= req.getParameter("name");
		String desc = req.getParameter("description");
		int price = Integer.parseInt(req.getParameter("price"));
		
		try {
			st.setInt(1, id);
			st.setString(2,name);
			st.setString(3,desc);
			st.setInt(4, price);
			int re = st.executeUpdate();
			PrintWriter out = res.getWriter();
			out.print("Done "+re);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
