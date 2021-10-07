/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 18577
 */
public class GeographicData {
    /** Drop down for state
     */
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    
    
    
    public GeographicData(String add, String city, String state, String country, String zipcode) {
    this.address= add;
    this.city = city;
    this.state = state;
    this.country = country;
    this.zipcode = zipcode;
    
          
    }
          
}
