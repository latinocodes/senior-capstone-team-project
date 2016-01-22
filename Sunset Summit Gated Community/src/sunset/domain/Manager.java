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
public class Manager extends Employee{
    
    public Manager(int employeeID, String position, String contactID, String firstName, String lastName, String dateOfBirth, String phoneNum, String email, String street, String city, String zipCode){
        
        super(employeeID, position, contactID, lastName, firstName, phoneNum, email, street, city, zipCode, dateOfBirth);
        
    }
   
}
