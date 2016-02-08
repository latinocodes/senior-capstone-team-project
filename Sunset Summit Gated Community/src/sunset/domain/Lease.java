/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sunset.domain;
import java.util.*;
/* FILENAME: Lease
 * DESCRIPTION: This file will extend from Tenant.  The attributes for this
 *              class will be designated along with Oject-Oriented format. 
 *              Overriding methodes will be utilized as well
 * @author Chip
 */
public class Lease extends Tenant{
    
    /* Declaration of variables */
    private String leaseID,
            duration,
            startDate,
            endDate;
    
    /* Default constructor */
    public Lease(){
    }
    
    /* Construtor */
    public Lease(String leaseID, String duration, String startDate, 
            String endDate, int tenantID, String contactID,  String lastName,
            String firstName, String phoneNum, String email, String street, String apt,
            String city, String state, String zipCode, String dateOfBirth,
            String specNeeds){
        
        super(tenantID, contactID, lastName, firstName, phoneNum, email, street, apt,
                city, state, zipCode, dateOfBirth, specNeeds);
        
        
        this.leaseID = leaseID;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    /**
     * Call to getTenantID in the Tenant Class
     * @return 
     */
    @Override
    public int getTenantID(){
        return super.getTenantID();
    }
    
    /* Getter for leaseID */
    public String getLeaseID(){
        return leaseID;
    }
    
    /* setter for leaseID */
    public void setLeaseID(String leaseID){
        this.leaseID = leaseID;
    }
        
    /* Getter for duration */
    public String getDuration(){
        return duration;
    }
    
    /* setter for duration */
    public void setDuration(String duration){
        this.duration = duration;
    }
    
    /* Getter for startDate */
    public String getStart(){
        return startDate;
    }
    
    /* setter for startDate */
    public void setStart(String startDate){
        this.startDate = startDate;
    }
    
    /* Getter for endDate */
    public String getEnd(){
        return endDate;
    }
    
    /* setter for endDate */
    public void setEnd(String endDate){
        this.endDate = endDate;
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
        final Lease other = (Lease) obj;
        if(!Objects.equals(this.leaseID, other.leaseID)){
            return false;
        }
        return true;
    }
    
    /* Overriding Validate */
    public boolean validate(){
        if(leaseID == null){
            return false;
        }
        if(leaseID.equals("")){
            return false;
        }
       
        return true;
    }
    
}
