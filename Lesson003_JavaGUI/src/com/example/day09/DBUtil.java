package com.example.day09;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static final String JDBCDRV = "com.mysql.cj.jdbc.Driver";  
	static final String URL = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static final String DBUSER = "java";
	static final String DBPASSWD = "1234";
	
	
	static Connection dbconn = null;
	
	public static void DBConnect() {
		try {
			Class.forName(JDBCDRV);
			System.out.println("드라이버를 정상적으로 로드했습니다.");
			dbconn = DriverManager.getConnection(URL, DBUSER, DBPASSWD);
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버를 로드하지 못했습니다.");
			e.printStackTrace();
			
		}catch(SQLException e) {
			System.out.println("데이터베이스 연결에 실패하였습니다.");
			e.printStackTrace();
		}
	}
	
	public static void DBClose() {
		try {
			dbconn.close();
			dbconn = null;
			System.out.println("데이터베이스 연결을 정상적으로 종료하였습니다.");
		}catch(SQLException e) {
			System.out.println("데이터베이스 연결을 종료하지 못했습니다.");
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
