package com.rutvik.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDao {

	public static void main(String[] args) {
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb","userdb","Rutvik@1234");
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select * from account");) {
			 //type DriverManger press ctrl+space and hit get connection
			// after that press ctrl+1 on Driver Manger and hit on surround by throw and exception
			//after above step press ctrl+1 on driver manger and hit add local variable
			System.out.println(connection);
			//int result = statement.executeUpdate("insert into account values (1,'Bhalekar','Sharmila',100000)");
			//System.out.println("THIS much is inserted "+ result);
			//statement.executeUpdate("update account set bal=200000 where accno=1");
			//statement.executeUpdate("delete from account where accno=1");
			while(rs.next()) {
				System.out.println(rs.getString(2)); // In getString ot grtInt method pass the column number you want .
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
