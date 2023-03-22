
import java.sql.*;
import java.io.*;
import java.util.*;

public class DB_MAN {
    String strDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";		// MS-SQL JDBC Driver
    String strURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Member";	// MS-SQL JDBC URL
    // String strURL = "jdbc:sqlserver://10.40.41.55:1433;DatabaseName=Member";	// MS-SQL JDBC URL
    
    String strUser = "sa"; // User ID
    String strPWD = "inha1958"; // Password
    
    Connection DB_con;	    // DB 접속
    Statement DB_stmt;	    // DB 접근을 위한 Statement 저장
    ResultSet DB_rs;	    // SQl 실행 결과 저장
    
    public void dbOpen() throws IOException {
	try {
	    Class.forName(strDriver); // JDBC Driver Load
	    
	    DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
	    DB_stmt = DB_con.createStatement(); // DB 접근을 위한 Statement 생성
	} catch(Exception e){
	    System.out.println(e.getMessage());
	}
    }
    
    public void dbClose() throws IOException {
	try {
	    DB_stmt.close();	// Exit Statement Connection
	    DB_con.close();	// Exit DB Connection
	} catch(Exception e){
	    System.out.println(e.getMessage());
	}
    }
}