package sunset.domain;

//~--- JDK imports ------------------------------------------------------------

import java.io.Serializable;

import java.util.*;

/*FILENAME:    Contact
* DESCRIPTION: This contact file will initiate the attributes as well as
*              implement the setters/getters.  This file will also utilize
*              the overriding methods.
 */
public class Contact implements Serializable {

    /* Declaring the variables */
    private String lastName, firstName, dateOfBirth, phoneNum, email, street, apt, city, state, zipCode, specialNeeds;
    int            contactID;

    /* default constructor */
    public Contact() {}

    /* Constructor */
    public Contact(int contactID, String lastName, String firstName, String phoneNum, String email, String street,
                   String apt, String city, String state, String zipCode, String dateOfBirth, String specialNeeds) {
        this.contactID    = contactID;
        this.lastName     = lastName;
        this.firstName    = firstName;
        this.dateOfBirth  = dateOfBirth;
        this.phoneNum     = phoneNum;
        this.email        = email;
        this.street       = street;
        this.apt          = apt;
        this.city         = city;
        this.state        = state;
        this.zipCode      = zipCode;
        this.specialNeeds = specialNeeds;
    }

    // set apartment
    public void setApt(String apt) {
        this.apt = apt;
    }

    // get apartment
    public String getApt() {
        return apt;
    }

    /* getter for contactID */
    public int getContactID() {
        return contactID;
    }

    /* setter for contactID */
    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    /* getter for lastName */
    public String getLastName() {
        return lastName;
    }

    /* setter for lastName */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /* getter for firstName */
    public String getFirstName() {
        return firstName;
    }

    /* setter for firstName */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /* getter for dateOfBirth */
    public String getBirthDate() {
        return dateOfBirth;
    }

    /* setter for dateOfBirth */
    public void setBirthDate(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /* getter for phoneNum */
    public String getPhoneNum() {
        return phoneNum;
    }

    /* setter for phoneNum */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /* getter for email */
    public String getEmail() {
        return email;
    }

    /* setter for email */
    public void setEmail(String email) {
        this.email = email;
    }

    /* getter for street */
    public String getStreet() {
        return street;
    }

    /* setter for street */
    public void setStreet(String street) {
        this.street = street;
    }

    /* getter for city */
    public String getCity() {
        return city;
    }

    /* setter for city */
    public void setCity(String city) {
        this.city = city;
    }

    /* getter for state */
    public String getState() {
        return state;
    }

    /* setter for state */
    public void setState(String state) {
        this.state = state;
    }

    /* getter for zipCode */
    public String getZip() {
        return zipCode;
    }

    /* setter for zipCode */
    public void setZip(String zipCode) {
        this.zipCode = zipCode;
    }

    /* getter for specialNeeds */
    public String getSpecNeeds() {
        return specialNeeds;
    }

    /* setter for specialNeeds */
    public void setSpecNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
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

        final Contact other = (Contact) obj;

        if (!Objects.equals((this.contactID), other.contactID)) {
            return false;
        }

        if (!Objects.equals((this.lastName), other.lastName)) {
            return false;
        }

        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }

        if (!Objects.equals(this.phoneNum, other.phoneNum)) {
            return false;
        }

        if (!Objects.equals(this.email, other.email)) {
            return false;
        }

        if (!Objects.equals(this.street, other.street)) {
            return false;
        }

        if (!Objects.equals(this.city, other.city)) {
            return false;
        }

        if (!Objects.equals(this.zipCode, other.zipCode)) {
            return false;
        }

        if (!Objects.equals(this.dateOfBirth, other.dateOfBirth)) {
            return false;
        }

        if (!Objects.equals(this.state, other.state)) {
            return false;
        }

        if (!Objects.equals(this.specialNeeds, other.specialNeeds)) {
            return false;
        }

        return true;
    }

    /* Overriding Validate */
    public boolean validate() {
        if (lastName == null) {
            return false;
        }

        if (firstName == null) {
            return false;
        }

        if (street == null) {
            return false;
        }

        if (city == null) {
            return false;
        }

        if (state == null) {
            return false;
        }

        if (zipCode == null) {
            return false;
        }

        if (phoneNum == null) {
            return false;
        }

        return true;
    }
}
