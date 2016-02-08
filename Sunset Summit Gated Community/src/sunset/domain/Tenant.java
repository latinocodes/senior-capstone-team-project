/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunset.domain;
import java.util.*;
/*
 * FILENAME:    Tenant
 * DESCRIPTION: This file will initiate the object, Tenant.  Attributes will be
 *              initialized and setters/getters will be implemented.  Override
 *              methods will also be utilized.
 * @author      Chip
 * VERSION:     CapstoneProjV1
 */
public class Tenant extends Contact{
 
    /* Declaration of variable */
    private int tenantID;
   
    /* Default Constructor */
    public Tenant(){
    }
    
    /* Constructor */
    public Tenant(int tenantID, String contactID, 
            String lastName, String firstName, String phoneNum, String email, 
            String street, String apt, String city, String state, String zipCode,
            String dateOfBirth, String specNeeds){
        
        super(contactID, lastName, firstName, dateOfBirth, phoneNum, email, street, apt,
                city, state, zipCode, specNeeds);
        
        this.tenantID = tenantID;        
    }
    
    /* Override method to get contactID */
    @Override
    public String getContactID(){
        return super.getContactID();
    }
    

    /**
     * @return the tenantID
     */
    public int getTenantID() {
        return tenantID;
    }

    /**
     * @param tenantID the tenantID to set
     */
    public void setTenantID(int tenantID) {
        this.tenantID = tenantID;
    }

     /**
      * 
      * @param obj
      * @return 
      */
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Tenant other = (Tenant) obj;
        if(!Objects.equals((this.tenantID), other.tenantID)){
            return false;
        }
        
        
        return true;
    }
    
}