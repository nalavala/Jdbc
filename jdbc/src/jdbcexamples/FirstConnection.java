package jdbcexamples;

import java.sql.*;
import java.util.Enumeration;

public class FirstConnection {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {

		/**
		 * Driver class loaded and static block of Driver class is executed
		 * ..which in turn calls DriverManager.registerDriver(new Driver())
		 *
		 * This step is optional because DeviceManager does auto loading of all
		 * drivers that are present by calling loadInitialDrivers
		 * 		static 
		 * 		{ 
		 *		 loadInitialDrivers();
		 *		 println("JDBC DriverManager initialized"); 
		 *		}
		 */
		
		Class.forName("com.mysql.jdbc.Driver");
		
		/**
		 *  Establishing connection by specifying URL of database
		 *  URL  of mySql is jdbc:mysql://localhost:3306/ with the name of database
		 *  username = root
		 *  password = 7396
		 */
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vendi","root","7396");
        
        DatabaseMetaData dmd = con.getMetaData();
        System.out.println(dmd.getURL());
        System.out.println(dmd.getUserName());
        
        String table[]={"TABLE"};  
        ResultSet rs=dmd.getTables(null,null,null,table); 
        
         
        
        
	}
}