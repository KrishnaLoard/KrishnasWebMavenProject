package com.krishnas.modelClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DriverManagersSQL {

	public static Connection getDriverMangerInstance() {
		// TODO Auto-generated method stub
		try {
			Class.forName(DatabaseUtilities.JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DatabaseUtilities.DB_URL, DatabaseUtilities.DB_Username,
					DatabaseUtilities.DB_Password);
			//PreparedStatement statement = connection.createStatement();

			return connection;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;

	}

}
