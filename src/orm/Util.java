package orm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Util {     //工具類別:通常放一些static方法和常數
	//這裡就來放一些載入驅動的常數
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "apple1220";

	
	//關閉資源的方法，直接在這裡設定，簡化程式碼內容
	public static void closeResources(Connection con , PreparedStatement pstmt , ResultSet rs) {
		if (rs != null) {
		try {
			rs.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	
	if (pstmt != null) {
		try {
			pstmt.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	if (con != null) {
		try {
			con.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	}
}
