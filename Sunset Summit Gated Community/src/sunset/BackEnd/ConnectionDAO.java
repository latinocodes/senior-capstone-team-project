/*  
 *  FILENAME: ConnectionDAO.java
 *  DESCRIPTION: This class creates implements the code for conn to the database and execute SQL statements
 */
package sunset.BackEnd;

import java.sql.*;
import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sunset.domain.*;


//*************************************************************************************
//  Class Name: ConnectionDAO
//  Descrption: This class handles all of the logic of MySQL database for Sunset Summit
//*************************************************************************************
public class ConnectionDAO {

  // Database Credentials
  private final String usr = "testing";
  private final String password = "testing";
  private final String url = "jdbc:mysql://71.198.36.146:3306/SunsetSummit?setSSL=true";

    //***************************************************************************
    //  Defines the Class.forName and conn address as well as makes the connection
    //  returns a the connection to the database
    //***************************************************************************
  
    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	return DriverManager.getConnection(url, usr, password);
    }

    //*******************************************************
    //  Method to get add a tenant to the databse 
    //  it insets associate data in other tables like invoices, Lease, etc.
    //  returns a boolean Object to perfome
    //*******************************************************
    public boolean addTenant(Tenant tenant) throws Exception {
        
        boolean flag = false;
        Residence lease = tenant.getLease();
        Invoice invoice = lease.getInvoice();
       
        String sql1 = "INSERT INTO Contact (ContactID, FName, LName, Street, AptNum, City, State, Zip, Phone, Email, SpecialNeeds, DateOfBirth) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        String sql2 = "INSERT INTO Tenant(TenantID, ContactID)VALUES(?,?)";
        String sql3 = "INSERT INTO Lease(LeaseID, ResidenceID, TenantID, Duration, StartDate, EndDate) VALUES(?,?,?,?,?,?)";
        String sql4 = "INSERT INTO Residence(ResidenceID, LeaseID, TenantID, MMRentCost) VALUES(?,?,?,?) ";
        String sql5 = "INSERT INTO Invoice(InvoiceID, LeaseID, TenantID, ResidenceID, BillDueDate) VALUES(?,?,?,?,?) ";
        
        Connection connection = null;
	Statement stmt = null;
		
        try{
            connection = getConnection();
            System.out.println("MySQL Database Connected!");
                        
            PreparedStatement preparedStatement = connection.prepareStatement(sql1);
                        
            preparedStatement.setInt(1, tenant.getTenantID());
            preparedStatement.setString(2, tenant.getFirstName());
            preparedStatement.setString(3, tenant.getLastName());
            preparedStatement.setString(4, tenant.getStreet());
            preparedStatement.setString(5, tenant.getApt());
            preparedStatement.setString(6, tenant.getCity());
            preparedStatement.setString(7, tenant.getState());
            preparedStatement.setInt(8, Integer.parseInt(tenant.getZip()));
            preparedStatement.setString(9, tenant.getPhoneNum());
            preparedStatement.setString(10, tenant.getEmail());
            preparedStatement.setString(11, tenant.getSpecNeeds());
            preparedStatement.setString(12, tenant.getBirthDate());
                       
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
            
            //adding data to Tenant table
            preparedStatement = connection.prepareStatement(sql2);
                        
            preparedStatement.setInt(1, tenant.getTenantID());
            preparedStatement.setInt(2, tenant.getTenantID());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            
            // adding data to lease Table
            preparedStatement = connection.prepareStatement(sql3);
                        
            preparedStatement.setInt(1, tenant.getTenantID());
            preparedStatement.setInt(2, tenant.getTenantID());
            preparedStatement.setInt(3, tenant.getTenantID());
            preparedStatement.setString(4, lease.getDuration());
            preparedStatement.setString(5, lease.getStart());
            preparedStatement.setString(6, lease.getEnd());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            
            // adding data to Residence Table
            preparedStatement = connection.prepareStatement(sql4);
                        
            preparedStatement.setInt(1, tenant.getTenantID());
            preparedStatement.setInt(2, tenant.getTenantID());
            preparedStatement.setInt(3, tenant.getTenantID());
            preparedStatement.setString(4, lease.getRentCost());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            
            // adding data to Residence Table
            preparedStatement = connection.prepareStatement(sql5);
                        
            preparedStatement.setInt(1, tenant.getTenantID());
            preparedStatement.setInt(2, tenant.getTenantID());
            preparedStatement.setInt(3, tenant.getTenantID());
            preparedStatement.setInt(4, tenant.getTenantID());
            preparedStatement.setString(5, invoice.getBillDue());
            

            preparedStatement.executeUpdate();
            preparedStatement.close();
	
            
        }catch(SQLException e){
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Something when wrong try adding Tenant Again!");
		
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
    
    //*******************************************************
    //  Method to get delete a tenant from the databse 
    //  it deletes associate data in other tables like invoices, Lease, etc.
    //  returns a boolean Object to perfome
    //*******************************************************
    public Boolean deleteTenant(Tenant tenant) throws Exception {
        
        boolean flag = false;
        
     try{
        Connection conn = getConnection();
	
        Statement stmt = conn.createStatement();
        String sql =  "DELETE FROM Invoice WHERE TenantID='"+tenant.getTenantID()+"'"; 
        String sql1 = "DELETE FROM Residence WHERE TenantID='"+tenant.getTenantID()+"'"; 
        String sql2 = "DELETE FROM Lease WHERE TenantID='"+tenant.getTenantID()+"'"; 
        String sql3 = "DELETE FROM Tenant WHERE ContactID='"+tenant.getTenantID()+"'"; 
        String sql4 = "DELETE FROM Contact WHERE ContactID='"+tenant.getTenantID()+"'"; 
        
        stmt.executeUpdate(sql);
        stmt.executeUpdate(sql1);
        stmt.executeUpdate(sql2);
        stmt.executeUpdate(sql3);
        stmt.executeUpdate(sql4);

        
        stmt.close();
        conn.close();
        
        flag = true;
    
     }catch(SQLException e){
        //return flag;
         JOptionPane.showMessageDialog(null, "Tenant was not deleted!");
         System.out.println(e);
    }
     
     return flag;   
     
} // end of deleteTenant
    
    //*******************************************************
    //  Method to get getAllDataForTenant from the databse 
    //  everything like invoices, 
    //  returns a boolean Object to perfome
    //*******************************************************
    public Tenant getAllDataForTenant(Tenant tenant){
        
        Residence tempResidence = new Residence();
        Lease tempLease = new Lease();
        Tenant tempTenant = new Tenant();
        Invoice tempInvoice = new Invoice();

        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        
        String sql =  "SELECT * FROM Contact WHERE ContactID='"+tenant.getTenantID()+"'";
        String sql1 = "SELECT * FROM Lease WHERE TenantID ='"+tenant.getTenantID()+"'";
        String sql2 = "SELECT * FROM Invoice WHERE TenantID ='"+tenant.getTenantID()+"'";
        String sql3 = "SELECT * FROM Residence WHERE TenantID='"+tenant.getTenantID()+"'";
        
        try{
            // GET DATA from Contact
            conn = getConnection();
            stmt = conn.createStatement();

            resultSet = stmt.executeQuery(sql);
            
            while(resultSet.next()){
              tempTenant = convertToTenant(resultSet);
            }
            
            stmt.close();
            
        }catch(Exception e){
        }
        
        try{
            // GET DATA from lease table
            conn = getConnection();
            stmt = conn.createStatement();

            resultSet = stmt.executeQuery(sql1);
            
            while(resultSet.next()){
              tempLease = convertToLease(resultSet);
            }
            
            stmt.close();
            
        }catch(Exception e){
        }
        
        try{
            // GET DATA from invoice table
            conn = getConnection();
            stmt = conn.createStatement();

            resultSet = stmt.executeQuery(sql2);
            
            while(resultSet.next()){
              tempInvoice = convertToInvoice(resultSet);
            }
            
            stmt.close();
            
        }catch(Exception e){
        }
        try{
            // GET DATA from Residence table
            conn = getConnection();
            stmt = conn.createStatement();

            resultSet = stmt.executeQuery(sql3);
            
            while(resultSet.next()){
              tempResidence = convertToResidence(resultSet);
            }
            
            stmt.close();
            
        }catch(Exception e){
        }
        
        tempResidence.setDuration(tempLease.getDuration());
        tempResidence.setStart(tempLease.getStart());
        tempResidence.setEnd(tempLease.getEnd());
        tempResidence.setInvoice(tempInvoice);
        tempTenant.setLease(tempResidence);
        
        
        return tempTenant;
        
    } // end of getAllDataForTenant

    //*******************************************************
    //  Method to update Tenant data to databse 
    //  returns a boolean Object to perfome
    //*******************************************************
    public Boolean updateTenant(Tenant tenant) throws Exception {
        
        boolean flag = false;
  
        Residence lease = tenant.getLease();
        Invoice invoice = lease.getInvoice();
       
        String sql1 = "UPDATE Contact SET ContactID=?, FName=?, LName=?, Street=?, AptNum=?, City=?, State=?, Zip=?, Phone=?, Email=?, SpecialNeeds=?, DateOfBirth=? WHERE ContactID='"+tenant.getTenantID()+"'";
        String sql2 = "UPDATE Tenant SET TenantID=?, ContactID=? WHERE TenantID='"+tenant.getTenantID()+"'";
        String sql3 = "UPDATE Lease SET LeaseID=?, ResidenceID=?, TenantID=?, Duration=?, StartDate=?, EndDate=? WHERE LeaseID='"+lease.getResID()+"'";
        String sql4 = "UPDATE Residence SET ResidenceID=?, LeaseID=?, TenantID=?, MMRentCost=? WHERE ResidenceID='"+lease.getResID()+"'";
        String sql5 = "UPDATE Invoice SET InvoiceID=?, LeaseID=?, TenantID=?, ResidenceID=?, BillDueDate=? WHERE InvoiceID='"+invoice.getInvoiceID()+"'";
        
        Connection conn = null;
		
        try{
            conn = getConnection();
            System.out.println("MySQL Database Connected!");
                        
            PreparedStatement stmt = conn.prepareStatement(sql1);
                        
            stmt.setInt(1, tenant.getTenantID());
            stmt.setString(2, tenant.getFirstName());
            stmt.setString(3, tenant.getLastName());
            stmt.setString(4, tenant.getStreet());
            stmt.setString(5, tenant.getApt());
            stmt.setString(6, tenant.getCity());
            stmt.setString(7, tenant.getState());
            stmt.setInt(8, Integer.parseInt(tenant.getZip()));
            stmt.setString(9, tenant.getPhoneNum());
            stmt.setString(10, tenant.getEmail());
            stmt.setString(11, tenant.getSpecNeeds());
            stmt.setString(12, tenant.getBirthDate());
                       
            stmt.executeUpdate();
            stmt.close();
            
            
            //Updating data to Tenant table
            stmt = conn.prepareStatement(sql2);
                        
            stmt.setInt(1, tenant.getTenantID());
            stmt.setInt(2, tenant.getTenantID());

            stmt.executeUpdate();
            stmt.close();
            
            // Updating data to lease Table
            stmt = conn.prepareStatement(sql3);
                        
            stmt.setInt(1, tenant.getTenantID());
            stmt.setInt(2, tenant.getTenantID());
            stmt.setInt(3, tenant.getTenantID());
            stmt.setString(4, lease.getDuration());
            stmt.setString(5, lease.getStart());
            stmt.setString(6, lease.getEnd());

            stmt.executeUpdate();
            stmt.close();
            
            // Updating data to Residence Table
            stmt = conn.prepareStatement(sql4);
                        
            stmt.setInt(1, tenant.getTenantID());
            stmt.setInt(2, tenant.getTenantID());
            stmt.setInt(3, tenant.getTenantID());
            stmt.setString(4, lease.getRentCost());

            stmt.executeUpdate();
            stmt.close();
            
            // Updating data to Residence Table
            stmt = conn.prepareStatement(sql5);
                        
            stmt.setInt(1, tenant.getTenantID());
            stmt.setInt(2, tenant.getTenantID());
            stmt.setInt(3, tenant.getTenantID());
            stmt.setInt(4, tenant.getTenantID());
            stmt.setString(5, invoice.getBillDue());
            

            stmt.executeUpdate();
            stmt.close();
	
            
        }catch(SQLException e){
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Something when wrong try Updating Tenant, try again!");
		
        }finally{
            System.out.println("Closing the connection");
            if(conn != null){
                try{
                    conn.close();
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
          
          String sql =  "select * from Contact where FName='"+tenant.getFirstName()+"'AND LName='"+tenant.getLastName()+"'";
          String sql1 = "select * from Contact where LName='" +tenant.getLastName()+"'";
          String sql2 = "select * from Contact where FName='"+tenant.getFirstName()+"'";
          String sql3 = "select * from Contact where AptNum='"+tenant.getApt()+"'";
          String sql4 = "select * from Contact where ContactID='"+tenant.getTenantID()+"'";
          
          
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
        
        String sql = "select * from Contact";       // selecting everyting from Contact table
        
		
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
            System.out.println(e);
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
    //  Getting the last tenantID and it autoIncrement
    //  Storing in list of Tenant
    //*****************************************************
    
    public int getlastTenant() throws Exception {
        
        // create list of tenants
	List<Tenant> list = new ArrayList<>();
        int tempNum = 0;
	Statement myStmt = null;
	ResultSet resultSet = null;
        Connection conn = getConnection();
        
        String sql = "select * from Contact";       // selecting everyting from Contact table
        
		
	try {
            myStmt = conn.createStatement();
            resultSet = myStmt.executeQuery(sql);
			
            while (resultSet.next()) {
                
                // convert the result from the database to tenant object
                Tenant tempTenant = convertToTenant(resultSet);
                tempNum = tempTenant.getTenantID();
                // adding Tenant to list
		list.add(tempTenant);
            }
        
	} catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Problem getting data from database. Call administrator!");
        }
        
	finally {
            tempNum++;
            myStmt.close();
            resultSet.close();
            // return entire list
            
        }
        return tempNum;
    } // end of getLastTenant Method
    
    //*****************************************************
    //  Setting the First notice in the database sent to tenant
    //  Storing in Inovoice table
    //  calls getDate() to store present date
    //*****************************************************
    public void sendFirstNotice(Tenant tenant) throws SQLException, Exception{

        Residence lease = tenant.getLease();
        Invoice invoice = lease.getInvoice();
        
        invoice.setFirstNot(getDate());
        
        PreparedStatement stmt = null;
        Connection conn = null;
        
        try {
            conn = getConnection();
        } catch (Exception ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "UPDATE Invoice SET FirstNtc=? WHERE InvoiceID='"+invoice.getInvoiceID()+"'";
        
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, invoice.getFirstNot());
        stmt.executeUpdate();
        
        stmt.close();
       
        
    } // end of sendFirstNotice
    
    //*****************************************************
    //  Setting the last notice in the database sent to tenant
    //  Storing in Inovoice table
    //  calls getDate() to store present date
    //*****************************************************
    public void sendLastNotice(Tenant tenant) throws SQLException{

       Residence lease = tenant.getLease();
        Invoice invoice = lease.getInvoice();
        
        invoice.setLastNot(getDate());
        
        PreparedStatement stmt = null;
        Connection conn = null;
        
        try {
            conn = getConnection();
        } catch (Exception ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "UPDATE Invoice SET LastNtc=? WHERE InvoiceID='"+invoice.getInvoiceID()+"'";
        
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, invoice.getLastNot());
        stmt.executeUpdate();
        
        stmt.close();
        
    } // end of sendLastNotice
    
     //*****************************************************
    //  Setting the pay date in the database
    //  Storing in Inovoice table
    //  calls getDate() to store present date
    //*****************************************************
    public void payRent(Tenant tenant) throws SQLException{

        Residence lease = tenant.getLease();
        Invoice invoice = lease.getInvoice();
        
        invoice.setBillPaid(getDate());
        
        PreparedStatement stmt = null;
        Connection conn = null;
        
        try {
            conn = getConnection();
        } catch (Exception ex) {
            Logger.getLogger(ConnectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "UPDATE Invoice SET BillPaidDate=? WHERE InvoiceID='"+invoice.getInvoiceID()+"'";
        
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, invoice.getBillPaid());
        stmt.executeUpdate();
        
        stmt.close();
        
    } // end of payRent
    
    //*****************************************************
    //  Get present date and sets appropiate database format
    //  uses Date from java.util and DateFormat
    //*****************************************************
    
    private static String getDate(){
        
        DateFormat  ft= new SimpleDateFormat("yyyy-MM-d");
        java.util.Date date = new Date();
        String todayDate = ft.format(date);
        
        return todayDate;
        
    } // end of getDate

 
    //*****************************************************
    //  Method to covert the data from databse to Invoice object
    //  returns a Invoice Object
    //*****************************************************
    
    private Invoice convertToInvoice(ResultSet resultSet) throws SQLException{
        int invoiceID = resultSet.getInt("InvoiceID");
        String billDueDate = resultSet.getString("BillDueDate");
        String billPaidDate = resultSet.getString("BillPaidDate");
        String firstNtc = resultSet.getString("firstNtc");
        String lastNtc = resultSet.getString("lastNtc");
        
        Invoice temp = new Invoice(invoiceID, billDueDate, billPaidDate, firstNtc, lastNtc);
       
        return temp;
        
    } // end of convertToInvoice
    
    //*****************************************************
    //  Method to covert the data from databse to Residence object
    //  returns a Residence Object
    //*****************************************************
    private Residence convertToResidence(ResultSet resultSet) throws SQLException{
        
        int residenceID = resultSet.getInt("ResidenceId");
        String MMRentCost = resultSet.getString("MMRentCost");
        
        
        Residence temp = new Residence(residenceID, MMRentCost);
        
        
        return temp;
    } // end of  convertToResidence
    
    //*****************************************************
    //  Method to covert the data from databse to Lease object
    //  returns a Lease Object
    //*****************************************************
    private Lease convertToLease(ResultSet resultSet) throws SQLException{
        
        int leaseID = resultSet.getInt("LeaseId");
        int Duration = resultSet.getInt("Duration");
        String startDate = resultSet.getString("StartDate");
        String endDate = resultSet.getString("endDate");
        
        Lease temp = new Lease(leaseID, Integer.toString(Duration), startDate, endDate);
        
        return temp;
    } // end of convertToLease
    
    //*****************************************************
    //  Method to covert the data from databse to Tenant object
    //  returns a Tenant Object
    //*****************************************************
    private Tenant convertToTenant(ResultSet resultSet) throws SQLException {
		
        int id = resultSet.getInt("ContactID");
	String name = resultSet.getString("FName"); String lastName = resultSet.getString("LName");
        String dateOfBirth = resultSet.getString("DateOfBirth"); String street = resultSet.getString("Street");
        String city = resultSet.getString("City");
        String state = resultSet.getString("State"); String zip = resultSet.getString("Zip");
        String phone = resultSet.getString("Phone");String email = resultSet.getString("Email");
        String specialNeeds = resultSet.getString("SpecialNeeds"); String apt =resultSet.getString("AptNum");
        
	Tenant tempTenant = new Tenant(id, id, lastName, name, phone, email, street,apt, city, state,
                                        zip, dateOfBirth, specialNeeds);
          
	return tempTenant;
        
	} // end of convertToTenant
   
} // end of ConnectionDAO class

