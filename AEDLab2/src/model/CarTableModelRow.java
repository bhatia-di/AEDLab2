/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author 18577
 */
public class CarTableModelRow {
     private String modelName;
    private boolean isAvailable;
    private String availabilityTimestamp;
    private String manufacturer;
    private String manufacturedTimestamp;
    private int noOfSeats;
    private String serialNumber;
    private String modelNumber;
    private GeographicData geographicData;
    private String maintenanceExpiryTimestamp;  

    public CarTableModelRow(String modelName, boolean isAvailable, String availabilityTimestamp, String manufacturer, String manufacturedTimestamp, int noOfSeats, String serialNumber, String modelNumber, GeographicData geographicData, String maintenanceExpiryTimestamp) {
        this.modelName = modelName;
        this.isAvailable = isAvailable;
        this.availabilityTimestamp = availabilityTimestamp;
        this.manufacturer = manufacturer;
        this.manufacturedTimestamp = manufacturedTimestamp;
        this.noOfSeats = noOfSeats;
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.geographicData = geographicData;
        this.maintenanceExpiryTimestamp = maintenanceExpiryTimestamp;
    }
    
    
}
