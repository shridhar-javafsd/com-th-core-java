package com.th.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC - Java Database Connectivity 

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("Start");

		String className = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql:localhost:3306/thdb";
		String sql = "";
		String user = "root";
		String password = "root";

		Class.forName(className);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		System.out.println("End");

	}

}
