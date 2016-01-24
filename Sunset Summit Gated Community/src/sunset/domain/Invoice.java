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
public class Invoice extends Lease{
    
    private String invoiceID,
            billDue,
            billPaid,
            firstNotice,
            lastNotice;
    
    public Invoice(){
    }
    
    public Invoice(String invoiceID, String billDue, String billPaid, 
            String firstNotice, String lastNotice, String leaseID, String residenceID, String duration,
            String startDate, String endDate, String tenantID, String birthDay,
            String contactID,  String specialNeeds, String comments, 
            String lastName, String firstName, String phoneNum, String email, 
            String street, String city, String zipCode){
        
        super(leaseID, residenceID, duration, startDate, endDate, tenantID, 
                 birthDay, contactID, specialNeeds, comments,
                lastName, firstName, phoneNum, email, street, city, zipCode);
        
        this.invoiceID = invoiceID;
        this.billDue = billDue;
        this.billPaid = billPaid;
        this.firstNotice = firstNotice;
        this.lastNotice = lastNotice;
    }
    
    @Override
    public String getLeaseID(){
        return super.getLeaseID();
    }
    
    @Override
    public String getTenantID(){
        return super.getTenantID();
    }
    
    public String getResID(){
        return super.getResidenceID();
    }
    
    public String getInvoiceID(){
        return invoiceID;
    }
    
    public void setInvoiceID(String invoiceID){
        this.invoiceID = invoiceID;
    }
    
    public String getBillDue(){
        return billDue;
    }
    
    public void setBillDue(String billDue){
        this.billDue = billDue;
    }
    
    public String getBillPaid(){
        return billPaid;
    }
    
    public void setBillPaid(String billPaid){
        this.billPaid = billPaid;
    }
    
    public String getFirstNot(){
        return firstNotice;
    }
    
    public void setFirstNot(String firstNotice){
        this.firstNotice = firstNotice;
    }
    
    public String getLastNot(){
        return lastNotice;
    }
    
    public void setLastNot(String lastNotice){
        this.lastNotice = lastNotice;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Invoice other = (Invoice) obj;
        if(!Objects.equals((this.invoiceID), other.invoiceID)){
            return false;
        }
        return true;
    }
    
    /* Override validate */
    public boolean validate(){
        if(invoiceID == null){
            return false;
        }
        return true;
    }
    
}
