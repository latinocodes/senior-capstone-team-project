/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sunset.domain;

import java.util.*;

/* FILENAME: Residence
 * DESCRIPTION: This file will extend Lease and create the necessary attributes
 *              that are needed for the residence of the property.  Set/Get
 *              methods will be utilized along with overriding methods
 * @author Chip
 */
public class Residence extends Lease{
    
    /* Variable declarations */
    private String residenceID,
            aptNum,
            rentCost;
    
    /* Default contsructor */
    public Residence(){
    }
    
    /* Constructor */
    public Residence(String residenceID, String aptNum, String rentCost,
            String leaseID,  String duration, String startDate, String endDate, 
            int tenantID, String contactID, String lastName, String firstName,
            String phoneNum, String email, String street, String apt, String city, 
            String state, String zipCode, String dateOfBirth, String specNeeds){
        
        super(leaseID, duration, startDate, endDate, tenantID, contactID, 
                lastName, firstName, phoneNum, email,street,apt, city, state,
                zipCode, dateOfBirth, specNeeds);
        this.residenceID = residenceID;
        this.aptNum = aptNum;
        this.rentCost = rentCost;
    }
    
    
    
   /**
    * Call to get the ContractID from Lease
    * @return 
    */
    public String getContractID(){
        return super.getContactID();
    }
     
    /* Getter for residenceID */
    public String getResID(){
        return residenceID;
    }
    
    /* Setter for residenceID */
    public void setResID(String residenceID){
        this.residenceID = residenceID;
    }
    
    /* Getter for apartment number */
    public String getAptNum(){
        return aptNum;
    }
    
     /* Setter for apartment number */
    public void setAptNum(String aptNum){
        this.aptNum = aptNum;
    }
    
    /* Getter for rent cost */
    public String getRentCost(){
        return rentCost;
    }
    
    /* Setter for rent cost */
    public void setRentCost(String rentCost){
        this.rentCost = rentCost;
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
        final Residence other = (Residence) obj;
        if(!Objects.equals(this.aptNum, other.aptNum)){
            return false;
        }
        if(!Objects.equals(this.residenceID, other.residenceID)){
            return false;
        }
        return true;
    }
    
    /* Override validate */
    public boolean validate(){
        if(residenceID == null){
            return false;
        }
        if(aptNum == null){
            return false;
        }
        if(rentCost == null){
            return false;
        }
        if(residenceID.equals("")){
            return false;
        }
        return true;
    }
    
}
