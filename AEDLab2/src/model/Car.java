/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import com.sun.istack.internal.NotNull;
import model.GeographicData;

/**
 *
 * @author 18577
 */
public class Car {
    @NotNull
    private String modelName;
    private boolean isAvailable;
    private LocalDateTime availabilityTimestamp;
    private String manufacturer;
    private LocalDate manufacturedTimestamp;
    private int noOfSeats;
    @NotNull
    private String serialNumber;
    private String modelNumber;
    private GeographicData geographicData;
    private LocalDate maintenanceExpiryTimestamp;  
    private boolean isExpired;

    public Car(String modelName, boolean isAvailable, LocalDateTime availabilityTimestamp, String manufacturer, LocalDate manufacturedTimestamp, int noOfSeats, String serialNumber, String modelNumber, GeographicData geographicData, LocalDate maintenanceExpiryTimestamp) {
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
        this.isExpired = maintenanceExpiryTimestamp.compareTo(LocalDate.now()) <= 0;
        
       
    }
    
    public Car() {
    }

    
    
    
    

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public LocalDateTime getAvailabilityTimestampDate() {
        return availabilityTimestamp;
    
    }
    
    public String getAvailabilityTimestamp() {
        return Objects.isNull(availabilityTimestamp) ? "" : availabilityTimestamp.toString();
    }

    public void setAvailabilityTimestamp(LocalDateTime availabilityTimestamp) {
        this.availabilityTimestamp = availabilityTimestamp;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    
    public boolean isExpired() {
        return isExpired;    
    }
        

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturedTimestamp() {
        return manufacturedTimestamp.toString();
    }
  
    public LocalDate getManufacturedTimestampDate() {
        return manufacturedTimestamp;
    }
    public void setManufacturedTimestamp(LocalDate manufacturedTimestamp) {
        this.manufacturedTimestamp = manufacturedTimestamp;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public GeographicData getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(GeographicData geographicData) {
        this.geographicData = geographicData;
    }

    public String getMaintenanceExpiryTimestamp() {
        return maintenanceExpiryTimestamp.toString();
    }
    
    public LocalDate getMaintenanceExpiryTimestampDate() {
        return maintenanceExpiryTimestamp;
    }

    public void setMaintenanceExpiryTimestamp(LocalDate maintenanceExpiryTimestamp) {
        this.maintenanceExpiryTimestamp = maintenanceExpiryTimestamp;
    }

    @Override
    public String toString() {
        return "Car{" + "modelName=" + modelName + ", isAvailable=" + isAvailable + ", availabilityTimestamp=" + availabilityTimestamp + ", manufacturer=" + manufacturer + ", manufacturedTimestamp=" + manufacturedTimestamp + ", noOfSeats=" + noOfSeats + ", serialNumber=" + serialNumber + ", modelNumber=" + modelNumber + ", geographicData=" + geographicData + ", maintenanceExpiryTimestamp=" + maintenanceExpiryTimestamp + '}';
    }
    
    
    
}
