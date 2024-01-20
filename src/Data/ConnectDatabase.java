 
package Data;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectDatabase {
            private static String url="jdbc:sqlserver://LAPTOP-HIVGVIVV\\SQLEXPRESS:1433;databaseName=master";
            private static String userName="sa";
            private static String password="123456789";
	public static void main(String[] args) {
		try {
			Connection conn = getConnection(url,userName,password);
			Statement stmt =conn.createStatement();
			ResultSet rs = stmt.executeQuery("select*from STUDENT");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDate(5)+" "+rs.getFloat(6)+" "+rs.getFloat(7)+" "+rs.getFloat(8)+" "+rs.getFloat(9));
			}
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static Connection getConnection(String url, String userName, String password) {
		Connection conn =null;
		try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url,userName,password);
            System.out.println("connect successfully");
		}catch (Exception e) {
			System.out.println("connect failure");
			e.printStackTrace();
		}
		return conn;
	 }
}