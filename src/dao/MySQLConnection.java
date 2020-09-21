package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    private static Connection conn;

    public static Connection getConnection()
    {
        String URL = "jdbc:mysql://localhost:3306/phone_market?autoReconnect=true&useSSL=false";
		String USER = "root";
        String PWD = "";
        
        try {
			Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PWD);
            System.out.println("Connection success");
		} catch (Exception ex) {
			ex.printStackTrace();
        }
        
		return conn;
    }
}
