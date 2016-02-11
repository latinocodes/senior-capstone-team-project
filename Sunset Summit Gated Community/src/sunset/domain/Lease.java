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
public class Lease {
    
    /* Declaration of variables */
    private int leaseID;
    
    private String duration,
                   startDate,
                   endDate;
    
    /* Default constructor */
    public Lease(){
    }
    
    /* Construtor */
    public Lease(int leaseID, String duration, String startDate, 
            String endDate){

        this.leaseID = leaseID;
        this.duration = duration;
        this.startDate = startDate;
        this.endDate = endDate;
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
    
    
}
