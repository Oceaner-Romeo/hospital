package util;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Access {
	
	static String url = "jdbc:Access:///data/record.mdb";
	static Connection conn;
	static Statement stmt;  
	static ResultSet rs;
	static String sql;
	
	public Access() {	
       
	}
	
	public static void insert(String ID, String pname, String ptel, String height, String weight) {
		connection();
		System.out.println("ID:"+ID+"\npname:"+pname+"\nptel:"+ptel+"\nheight:"+height+"\nweight:"+weight);
		sql = "INSERT INTO info(\"" + ID+"\",\"" +pname+"\",\"" +ptel+"\",\""+height+"\",\""+weight+"\")" + " VALUES (ID, pname, ptel, height,weight)";  
		System.out.println(sql);
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		close();
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	
	public void query() {
		
	}
	
	public static void connection() {
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver").newInstance();
	        conn = DriverManager.getConnection(url, "", "");
	        stmt = conn.createStatement();  
	         
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("数据库连接成功！");
	}
	
	public static void close() {
		try {
				if(rs!=null) {
					rs.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(conn!=null) {
					conn.close();
				}	         
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}          
	}
}