package sunset.domain;

//~--- JDK imports ------------------------------------------------------------

import java.util.*;

/*
* FILENAME:    Tenant
* DESCRIPTION: This file will initiate the object, Tenant.  Attributes will be
*              initialized and setters/getters will be implemented.  Override
*              methods will also be utilized.
 */
public class Tenant extends Contact {

    /* Declaration of variable */
    private int       tenantID;
    private Residence lease;

    /* Default Constructor */
    public Tenant() {}

    /* Constructor */
    public Tenant(int tenantID, int contactID, String lastName, String firstName, String phoneNum, String email,
                  String street, String apt, String city, String state, String zipCode, String dateOfBirth,
                  String specNeeds) {
        super(contactID, lastName, firstName, phoneNum, email, street, apt, city, state, zipCode, dateOfBirth,
              specNeeds);
        this.tenantID = tenantID;
    }

    /* Constructor with Residence object */
    public Tenant(int tenantID, int contactID, String lastName, String firstName, String phoneNum, String email,
                  String street, String apt, String city, String state, String zipCode, String dateOfBirth,
                  String specNeeds, Residence lease) {
        super(contactID, lastName, firstName, phoneNum, email, street, apt, city, state, zipCode, dateOfBirth,
              specNeeds);

        // Creating lease for tenant
        this.lease    = lease;
        this.tenantID = tenantID;
    }

    public Residence getLease() {
        return this.lease;
    }

    public void setLease(Residence Lease) {
        this.lease = Lease;
    }

    /* Override method to get contactID */
    @Override
    public int getContactID() {
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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Tenant other = (Tenant) obj;

        if (!Objects.equals((this.tenantID), other.tenantID)) {
            return false;
        }

        return true;
    }
}
