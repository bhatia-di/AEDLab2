/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import model.GeographicData;

/**
 *
 * @author 18577
 */
public class Car {
    private String modelName;
    private boolean isAvailable;
    private LocalDate availabilityTimestamp;
    private String manufacturer;
    private LocalDate manufacturedTimestamp;
    private int noOfSeats;
    private String serialNumber;
    private String modelNumber;
    private GeographicData geographicData;
    private LocalDate maintenanceExpiryTimestamp;  
    
}
