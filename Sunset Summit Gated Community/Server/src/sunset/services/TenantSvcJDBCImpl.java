/*  
 *  BookSvcSerializedIOImpl.java
 *  This class creates implements the code for IBookSvc
 * 
 *  Date: August 04, 2015
 *  CS434 - Object Oriented Programming Using Java
 *  @author Jose Lara
 *  @version 1
 */
package sunset.services;
import java.sql.*;
import javax.sql.*;
import sunset.domain.*;


public class TenantSvcJDBCImpl {

    private final String connString = "jdbc:mysql://localhost/laraLibrary?user=root&password=admin";

    private Connection getConnection() throws Exception {
	return DriverManager.getConnection(connString);
    }

    public Tenant add(Tenant tenant) throws Exception {
            
        Connection conn = getConnection();
	
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO book (isbn, authors) VALUES ('"+ tenant.getName() + "','" + tenant.getTenantID() +"')";
        stmt.executeUpdate(sql);
        
        stmt.close();
        conn.close();
        
        return tenant;
    }

    public Tenant find(Tenant tenant) throws Exception {
           Connection conn = getConnection();
	
        Statement stmt = conn.createStatement();
        String sql = "SELECT FROM book (isbn, authors) VALUES ('"+ tenant.getName() + "','" + tenant.getTenantID() +"')";
        stmt.executeUpdate(sql);
        
        stmt.close();
        conn.close();
        
        return tenant;
    
    }



}

