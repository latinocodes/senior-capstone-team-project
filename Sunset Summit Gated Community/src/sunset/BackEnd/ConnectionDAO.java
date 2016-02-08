/*  
 *  FILENAME: ConnectionDB.java
 *  DESCRIPTION: This class creates implements the code for connection to the database and execute SQL statements
 * 
 *  Date: Jan 27, 2016 - 
 *  Updated on Feb 6, 2016
 *  CS434 - Object Oriented Programming Using Java
 *  @author Jose Lara
 *  @version 2
 */
package sunset.BackEnd;

import java.sql.*;
import java.util.List.*;
import java.util.*;
import javax.sql.*;
import javax.swing.JOptionPane;
import sunset.domain.*;


public class ConnectionDB {

  private final String usr = "root";
  private final String password = "Lara0216";
  private final String url = "jdbc:mysql://localhost:3306/Tenant";

    /*Defines the Class.forName and connection address as well as makes
    * the connection */
    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	return DriverManager.getConnection(url,usr, password);
    }

    /**
     * calls for the opening of the connection and pulls the data from the 
    *  domain layer while utilizing SQL commands for storing in the database
     * @param tenant
     * @return
     * @throws Exception 
     */
    public boolean addTenant(Tenant tenant) throws Exception {
        
        boolean flag = false;
       
        String query = "insert into Tenant (TenantID, FName, LName, Street, apt, City, State, Zip, Phone, Email, SpecialNeeds, DateOfBirth) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        Connection connection = null;
	Statement stmt = null;
		
        try{
            System.out.println("Connecting to the MySQL database...");
            connection = getConnection();
            System.out.println("MySQL Database Connected!");
                        
            PreparedStatement preparedStatement = connection.prepareStatement(query);
                        
            preparedStatement.setInt(1, tenant.getTenantID());
            preparedStatement.setString(2, tenant.getFirstName());
            preparedStatement.setString(3, tenant.getLastName());
            preparedStatement.setString(4, tenant.getStreet());
            preparedStatement.setInt(5, Integer.parseInt(tenant.getApt()));
            preparedStatement.setString(6, tenant.getCity());
            preparedStatement.setString(7, tenant.getState());
            preparedStatement.setInt(8, Integer.parseInt(tenant.getZip()));
            preparedStatement.setString(9, tenant.getPhoneNum());
            preparedStatement.setString(10, tenant.getEmail());
            preparedStatement.setString(11, tenant.getSpecNeeds());
            preparedStatement.setString(12, tenant.getBirthDate());
                       
            preparedStatement.executeUpdate();
	
            preparedStatement.close();
            
        }catch(SQLException e){
            System.out.println(e.toString());
		
        }finally{
            System.out.println("Closing the connection");
            if(connection != null){
                try{
                    connection.close();
                    flag = true;
				
                    }catch (SQLException ignore){}
                     
                }
            }
                
        return flag;
        
    } // end of addTenant
    
    /**
     * Calls getConnection to open the connection to the database in order to
     * delete a tenant profile
     * @param tenant
     * @return
     * @throws Exception 
     */
    public Boolean deleteTenant(Tenant tenant) throws Exception {
        
        boolean flag = false;
        
     try{
        Connection conn = getConnection();
	
        Statement stmt = conn.createStatement();
        
        
        String sql = "DELETE FROM Tenant WHERE TenantID='"+tenant.getTenantID()+"'"; 
        
        stmt.executeUpdate(sql);
        
        stmt.close();
        conn.close();
        
        flag = true;
    
     }catch(SQLException e){
        //return flag;
         JOptionPane.showMessageDialog(null, "Tenant was not deleted!");
    }
     
     return flag;   
}

    /**
     * calls getConnection to access the database for altering a profile
     * @param tenant
     * @return
     * @throws Exception 
     */
    public Boolean updateTenant(Tenant tenant) throws Exception {
        
        boolean flag = false;
        
       // PreparedStatement stmt = null;
        Connection conn = null;

       /* String sql = "UPDATE Tenant "
            + "WHERE TenantID="+"'"+ tenant.getTenantID()+ "'"
            + "SET LName =" + "'" + tenant.getLastName() + "',"
            + "FName=" + "'"+ tenant.getFirstName()+"',"
            + "DateOfBirth='" + tenant.getBirthDate() + "'," 
            + "Street='" + tenant.getStreet() + "'," + "City='" 
            +tenant.getCity() + "'," + "Zip='" +tenant.getZip()+ "'," 
            + "Phone='" + tenant.getPhoneNum() +"'," + "Email='" 
            + tenant.getEmail()
            + "'," + "SpecialNeeds='" + tenant.getSpecNeeds();*/
        
      String query = "update Tenant where TenantID='"+tenant.getTenantID()+"' SET (TenantID, FName, LName, Street, apt, City, State, Zip, Phone, Email, SpecialNeeds, DateOfBirth) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        
      Connection connection = null;
      PreparedStatement stmt = null;
		
        try{
            System.out.println("Connecting to the MySQL database...");
            connection = getConnection();
            System.out.println("MySQL Database Connected!");
                        
            PreparedStatement preparedStatement = connection.prepareStatement(query);
                        
            preparedStatement.setInt(1, tenant.getTenantID());
            preparedStatement.setString(2, tenant.getFirstName());
            preparedStatement.setString(3, tenant.getLastName());
            preparedStatement.setString(4, tenant.getStreet());
            preparedStatement.setInt(5, Integer.parseInt(tenant.getApt()));
            preparedStatement.setString(6, tenant.getCity());
            preparedStatement.setString(7, tenant.getState());
            preparedStatement.setInt(8, Integer.parseInt(tenant.getZip()));
            preparedStatement.setString(9, tenant.getPhoneNum());
            preparedStatement.setString(10, tenant.getEmail());
            preparedStatement.setString(11, tenant.getSpecNeeds());
            preparedStatement.setString(12, tenant.getBirthDate());
                       
            preparedStatement.executeUpdate();
	
            preparedStatement.close();
            
        }catch(SQLException e){
            System.out.println(e.toString());
		
        }finally{
            System.out.println("Closing the connection");
            if(connection != null){
                try{
                    connection.close();
                    flag = true;
				
                    }catch (SQLException ignore){}
                     
                }
            }
                
        return flag;
        
    }
    
    //*****************************************************
    //  Getting a particular Tenant from the database
    //  calls convertToTenant() to stores data to Tenant object
    //  Storing Tenants in list of Tenant and returns the list with associated name/lastNames
    // 
    //*****************************************************

    public List<Tenant> findTenant(Tenant tenant) throws Exception {
       
       // list to store tenants into 
       List<Tenant> tenantList = new ArrayList<>();
        
      try (Connection conn = getConnection()) {
          Statement stmt;
          ResultSet resultSet;
          
          String sql =  "select * from Tenant where FName='"+tenant.getFirstName()+"'AND LName='"+tenant.getLastName()+"'";
          String sql1 = "select * from Tenant where LName='" +tenant.getLastName()+"'";
          String sql2 = "select * from Tenant where FName='"+tenant.getFirstName()+"'";
          String sql3 = "select * from Tenant where apt='"+tenant.getApt()+"'";
          String sql4 = "select * from Tenant where TenantID='"+tenant.getTenantID()+"'";
          
          stmt = conn.createStatement();
          // search for first
          if(!(tenant.getFirstName().equals(null) || tenant.getFirstName().equals("")) && !(tenant.getLastName().equals("") || tenant.getLastName().equals(null))){
              
              stmt = conn.createStatement();
              resultSet = stmt.executeQuery(sql);
           
          }
          //search for last name
          else if((tenant.getFirstName().equals(null) || tenant.getFirstName().equals("")) && !(tenant.getLastName().equals("") || tenant.getLastName().equals(null))){

              stmt = conn.createStatement();
              resultSet = stmt.executeQuery(sql1);
          }
           else if(!((tenant.getFirstName().equals(null)) || tenant.getFirstName().equals(""))){
              stmt = conn.createStatement();
              resultSet = stmt.executeQuery(sql2);
          
          }
          else if(!(tenant.getApt().equals(null) || tenant.getApt().equals(""))){
              stmt = conn.createStatement();
              resultSet = stmt.executeQuery(sql3);
          
          }
        
          //search for first name and last name
          else{
              
              stmt = conn.createStatement();
              resultSet = stmt.executeQuery(sql4);
          }


          while(resultSet.next()){
              Tenant temp = convertToTenant(resultSet);
              tenantList.add(temp);
          }
              
          
          resultSet.close();
          stmt.close();
          
         
      }catch(SQLException e){
          
      }
        
        return tenantList;
        
    } // end of findTenant method
    
    //*****************************************************
    //  Getting all the Tenant from the database
    //  Storing in list of Tenant
    //*****************************************************
    
    public List<Tenant> getAllTenant() throws Exception {
        
        // create list of tenants
	List<Tenant> list = new ArrayList<>();
		
	Statement myStmt = null;
	ResultSet resultSet = null;
        Connection conn = getConnection();
        String sql = "select * from Tenant";
        
		
	try {
            myStmt = conn.createStatement();
            resultSet = myStmt.executeQuery(sql);
			
            while (resultSet.next()) {
                
                // convert the result from the database to tenant object
                Tenant tempTenant = convertToTenant(resultSet);
                         
                // adding Tenant to list
		list.add(tempTenant);
            }
        
	} catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Problem getting data from database. Call administrator!");
        }
        
	finally {
            myStmt.close();
            resultSet.close();
            
            // return entire list
            return list;
        }
        
    } // end of getAllTenant Method
    
    //*****************************************************
    //  Method to covert the data from databse to Tenant object
    //  returns a Tenant Object
    //*****************************************************
    private Tenant convertToTenant(ResultSet resultSet) throws SQLException {
		
        int id = resultSet.getInt("TenantID");
	String name = resultSet.getString("FName"); String lastName = resultSet.getString("LName");
        String dateOfBirth = resultSet.getString("DateOfBirth"); String street = resultSet.getString("Street");
        String apt = resultSet.getString("apt"); String city = resultSet.getString("City");
        String state = resultSet.getString("State"); String zip = resultSet.getString("Zip");
        String phone = resultSet.getString("Phone");String email = resultSet.getString("email");
        String specialNeeds = resultSet.getString("SpecialNeeds"); String contactID = null;
		
	Tenant tempTenant = new Tenant(id, contactID, lastName, name, phone, email, street, apt, city, state,
                                        zip, dateOfBirth, specialNeeds);
          
	return tempTenant;
        
	} // end of convertToTenant
    

} // end of ConnectionDB class

