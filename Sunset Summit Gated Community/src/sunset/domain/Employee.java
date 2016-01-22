/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunset.domain;

/**
 *
 * @author Jose
 */
public class Employee extends Contact{
    
    private int employeeID;
    private String position;
    
    public Employee(){
    }
    
    public Employee(int employeeID, String position, String contactID, String lastName, String firstName, String phoneNum, String email, String street, String city, String zipCode, String dateOfBirth){
        super(contactID, lastName, firstName, phoneNum, email, street, city, zipCode, dateOfBirth);
        this.setEmployeeID(employeeID);
        this.setPosition(position);
    }
    
    public String getPosition(){
        
        return this.position;
    }
    
    public int getEmployeeID(){
        return this.employeeID;
    }
    
    public void setEmployeeID(int employeeID){
        
        this.employeeID = employeeID;
    }
    
    public void setPosition(String position){
        this.position = position;
    }
    
    
}
