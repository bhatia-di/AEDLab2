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
    
    public GeographicData(String add, String city, String state, String country, String zipcode) {
    this.address= add;
    this.city = city;
    this.state = state;
    this.country = country;
    this.zipcode = zipcode;
    
          
    }
          
}
