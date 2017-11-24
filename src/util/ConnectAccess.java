package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectAccess {
	
	public ConnectAccess() {
		
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver").newInstance();
			String url = "jdbc:Access:///../../data/record.accdb";
	        Connection conn = DriverManager.getConnection(url, "", "");
	        Statement stmt = conn.createStatement();  
	        ResultSet rs = stmt.executeQuery("select * from Table1");
	        rs.close();  
	        stmt.close();  
	        conn.close();  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("数据库连接成功！");
       
	}
}