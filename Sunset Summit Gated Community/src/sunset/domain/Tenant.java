/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunset.domain;

/**
 *
 * @author Jose
 */
public class Tenant extends Person {
 
    private int tenantID;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private String email;

    public Tenant(String name, String lastName, int tenantID, String address, String city,
                    String state, String zipCode, String phone, String email) {
        super(name, lastName);
        this.setTenantID(tenantID);
        this.setAddress(address);
        this.setCity(city);
        this.setState(state);
        this.setZipCode(zipCode);
        this.setPhone(phone);
        this.setEmail(email);
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

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
   
}
