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
public class Person {
    private String name;
    private String lastName;
    private int year;
    private int date;
    private int month;
    
    /**
     *
     * @param name
     * @param lastName
     */
    public Person(String name, String lastName, int year, int date, int month){
        
        this.setName(name);
        this.setLastName(lastName);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(int date) {
        this.date = date;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }
    
    
    
    
    
    
}
