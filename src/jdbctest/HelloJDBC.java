package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HelloJDBC {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "apple1220";

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);  //建立輸入的欄位，配合動態SQL指令，新增欄位
		System.out.println("要新增的編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的名稱");
		String dname = sc.next();
		System.out.println("要新增的所在地");
		String loc = sc.next();
		
		sc.close();

		try {
			// step 1:載入驅動
			Class.forName(DRIVER);
			System.out.println("載入成功");

			// step 2:建立連線
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功");
			System.out.println("===============");
			// step 3:送出SQL指令
			pstmt = con.prepareStatement("insert into department values(?,?,?)");
			
			pstmt.setInt(1,deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			pstmt.executeUpdate();
			
//			stmt = con.createStatement();
			// 建立資料
//			int count = stmt.executeUpdate("insert into department values(50 ,'人事部','南京復興')");
//			System.out.println(count + "row(s) updated.");
			// 查詢資料
//			rs = stmt.executeQuery("select * from department order by deptno desc");
//			while (rs.next()) {
//				int deptno = rs.getInt("deptno");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//
//				System.out.println("DEPTNO =" + deptno);
//				System.out.println("DNAME =" + dname);
//				System.out.println("LOC =" + loc);
//				System.out.println("==================");
//			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		} finally {
			

//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException se) {
//					se.printStackTrace();
//				}
//			}
//			if (stmt != null) {             
//				try {
//					stmt.close();
//				} catch (SQLException se) {
//					se.printStackTrace();
//				}
//			}
			
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
}
