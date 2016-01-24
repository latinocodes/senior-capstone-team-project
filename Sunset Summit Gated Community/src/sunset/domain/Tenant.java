/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunset.domain;
import java.util.*;
/**
 *
 * @author Jose
 */
public class Tenant extends Contact{
 
    private String tenantID;
    private String specialNeeds;
   

    public Tenant(){
    }
        
    public Tenant(String tenantID, String birthDay, String contactID, String specialNeeds, String comments,
                String lastName, String firstName, String phoneNum, String email, String street, String city, String zipCode){
        
        super(contactID, lastName, firstName, phoneNum, email, street, city, zipCode, birthDay);
        
        this.setTenantID(tenantID);
        this.setSpecialNeeds(specialNeeds);
        
    }
    
    @Override
    public String getContactID(){
        return super.getContactID();
    }
    
    @Override
    public String getLastName(){
        return super.getLastName();
    }
    
    @Override
    public String getFirstName(){
        return super.getFirstName();
    }
    
    @Override
    public String getPhoneNum(){
        return super.getPhoneNum();
    }
    
    @Override
    public String getEmail(){
        return super.getEmail();
    }
    
    @Override
    public String getStreet(){
        return super.getStreet();
    }
    
    @Override
    public String getCity(){
        return super.getCity();
    }
    
    @Override
    public String getZip(){
        return super.getZip();
    }
    

    /**
     * @return the tenantID
     */
    public String getTenantID() {
        return tenantID;
    }

    /**
     * @param tenantID the tenantID to set
     */
    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }
 
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
    

    /* Overriding validate */
    public boolean validate(){
        if(tenantID == null){
            return false;
        }
        if(tenantID.equals("")){
            return false;
        }
        return true;
    }

    /**
     * @return the SpecialNeeds
     */
    public String getSpecialNeeds() {
        return specialNeeds;
    }

    /**
     * @param SpecialNeeds the SpecialNeeds to set
     */
    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }
    
}