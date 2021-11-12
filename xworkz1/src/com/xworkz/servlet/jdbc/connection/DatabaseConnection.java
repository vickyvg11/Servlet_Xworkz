package com.xworkz.servlet.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
		// Initialize all the information regarding
		// Database Connections
		String dbDriver = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/";
		// Database name to access
		String dbName = "xworkz_servlet";
		String dbUsername = "root";
		String dbPassword = "vicky123";

		Class.forName(dbDriver);
		Connection connection = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
		return connection;

	}
}
