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
    private int     residenceID;
    private String  rentCost;
    
    private Invoice invoice;
    
    /* Default contsructor */
    public Residence(){
    }
    
    public Residence(int residenceID, String MMRentCost){
        
        this.setRentCost(MMRentCost);
        this.setResID(residenceID);
    }
    
    /* Constructor */
    public Residence(int residenceID, String rentCost,
            int leaseID,  String duration, String startDate, String endDate){
        
        super(leaseID, duration, startDate, endDate);
        
        this.residenceID = residenceID;
        this.rentCost = rentCost;
    }
    
      /* Constructor */
    public Residence(int residenceID, String aptNum, String rentCost,
            int leaseID,  String duration, String startDate, String endDate, Invoice newInvoice){
        
        super(leaseID, duration, startDate, endDate);
        
        this.residenceID = residenceID;
        this.rentCost = rentCost;
        this.invoice = newInvoice;
    }
    
    public Invoice getInvoice(){
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice){
        this.invoice = invoice;
    }
    
     
    /* Getter for residenceID */
    public int getResID(){
        return residenceID;
    }
    
    /* Setter for residenceID */
    public void setResID(int residenceID){
        this.residenceID = residenceID;
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
        if(!Objects.equals(this.residenceID, other.residenceID)){
            return false;
        }
        return true;
    }
    
    /* Override validate */
    public boolean validate(){
        if(rentCost == null){
            return false;
        }
        return true;
    }
    
}
