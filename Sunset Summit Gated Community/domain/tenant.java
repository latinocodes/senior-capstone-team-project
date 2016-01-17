/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs493.domain;

/**
 *
 * @author Jose
 */
public class tenant extends Person {
 
    private int tenantID;

    public tenant(String name, String lastName, int year, int day, int month, int tenantID) {
        super(name, lastName, year, day, month);
        super.setLastName(lastName);
        this.setTenantID(tenantID);
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
     * @return the name
     */
    public String getName() {
        return super.getName();
    }
   
}
