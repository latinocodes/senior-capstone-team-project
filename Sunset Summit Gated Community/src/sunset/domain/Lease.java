/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sunset.domain;
import java.util.*;
/**
 *
 * @author Chip
 */
public class Lease extends Tenant{
    
    private String leaseID,
            residenceID,
            duration,
            startDate,
            endDate;
    
    public Lease(){
    }
    
    public Lease(String leaseID, String residenceID, String duration,
            String startDate, String endDate, String tenantID, String birthDay,
            String contactID,  String specialNeeds, String comments, 
            String lastName, String firstName, String phoneNum, String email, 
            String street, String city, String zipCode){
        
        super(tenantID, birthDay, contactID, specialNeeds, comments,
                lastName, firstName, phoneNum, email, street, city, zipCode);
        
        this.leaseID = leaseID;
        this.residenceID = residenceID;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    @Override
    public String getTenantID(){
        return super.getTenantID();
    }
    
    public String getLeaseID(){
        return leaseID;
    }
    
    public void setLeaseID(String leaseID){
        this.leaseID = leaseID;
    }
    
    public String getResidenceID(){
        return residenceID;
    }
    
    public void setResidenceID(String residenceID){
        this.residenceID = residenceID;
    }
    
    public String getDuration(){
        return duration;
    }
    
    public void setDuration(String duration){
        this.duration = duration;
    }
    
    public String getStart(){
        return startDate;
    }
    
    public void setStart(String startDate){
        this.startDate = startDate;
    }
    
    public String getEnd(){
        return endDate;
    }
    
    public void setEnd(String endDate){
        this.endDate = endDate;
    }
    
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
        if(residenceID == null){
            return false;
        }
        if(leaseID.equals("")){
            return false;
        }
        if(residenceID.equals("")){
            return false;
        }
        return true;
    }
    
}
