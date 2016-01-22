/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sunset.domain;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Chip
 */
public class Contact implements Serializable{
   
    
    private String contactID,
                   lastName,
                   firstName,
                   phoneNum,
                   email,
                   street,
                   city,
                   zipCode,
                   DOB;
    
    public Contact(){
    }
    
    public Contact(String contactID, String lastName, String firstName, 
            String phoneNum, String email, String street, String city,
            String zipCode, String dateOfBirth){
        
        this.setContactID(contactID);
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setPhoneNum(phoneNum);
        this.setEmail(email);
        this.setStreet(street);
        this.setCity(city);
        this.setZip(zipCode);
        this.setDateOfBirth(dateOfBirth);
    }
    
      
    public String getContactID(){
        return contactID;
    }
    
    public void setContactID(String contactID){
        this.contactID = contactID;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    
    public String getPhoneNum(){
        return phoneNum;
    }
    
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    
    public String getEmail()
    {
        return email;
    }  
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getStreet(){
        return street;
    }
    
    public void setStreet(String street){
        this.street = street;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public String getZip(){
        return zipCode;
    }
    
    public void setZip(String zipCode){
        this.zipCode = zipCode;
    }
    
    public String getDOB(){
        return this.DOB;
    }
    
    public void setDateOfBirth(String DOB){
        this.DOB = DOB;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Contact other = (Contact) obj;
        if(!Objects.equals((this.contactID), other.contactID)){
            return false;
        }
        if(!Objects.equals((this.lastName), other.lastName)){
            return false;
        }
        if(!Objects.equals(this.firstName, other.firstName)){
            return false;
        }
        if(!Objects.equals(this.phoneNum, other.phoneNum)){
            return false;
        }
        if(!Objects.equals(this.email, other.email)){
            return false;
        }
        if(!Objects.equals(this.street, other.street)){
            return false;
        }
        if(!Objects.equals(this.city, other.city)){
            return false;
        }
        if(!Objects.equals(this.zipCode, other.zipCode)){
            return false;
        }
        if(!Objects.equals(this.DOB, other.DOB)){
            return false;
        }
        return true;
    }

   
    
      
    /* Overriding Validate */
    public boolean validate(){
        if(contactID == null){
            return false;
        }
        if(lastName == null){
            return false;
        }
        if(firstName == null){
            return false;
        }
        if(contactID.equals("")){
            return false;
        }
        if(DOB == null){
            return false;
        }
        if(DOB.equals("")){
            return false;
        }
        
        return true;  
    }   
}
