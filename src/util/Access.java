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
		sql = "insert into info(ID,pname,ptel,height,weight)" + " values (\"" + ID+"\",\"" +pname+"\",\"" +ptel+"\",\""+height+"\",\""+weight+"\")";  
		System.out.println(sql);
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		close();
	}
	
	public static void update() {
		
	}
	
	public static void delete() {
		
	}
	
	public static void query() {
		connection();
		
		try {
			rs = stmt.executeQuery("select * from hyzk");
			while(rs.next()){
                // 通过字段检索
                
                String btqk = rs.getString("btqk");
                String bz = rs.getString("bz");
    
                // 输出数据
             
                System.out.print("btqk: " + btqk);
                System.out.print("\nbz: " + bz);
                System.out.print("\n");
            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		close();
	}
	
	public static void connection() {
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver");
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