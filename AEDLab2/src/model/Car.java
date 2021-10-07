/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import model.GeographicData;

/**
 *
 * @author 18577
 */
public class Car {
    private String modelName;
    private boolean isAvailable;
    private LocalDateTime availabilityTimestamp;
    private String manufacturer;
    private LocalDate manufacturedTimestamp;
    private int noOfSeats;
    private String serialNumber;
    private String modelNumber;
    private GeographicData geographicData;
    private LocalDate maintenanceExpiryTimestamp;  

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

    public LocalDateTime getAvailabilityTimestamp() {
        return availabilityTimestamp;
    }

    public void setAvailabilityTimestamp(LocalDateTime availabilityTimestamp) {
        this.availabilityTimestamp = availabilityTimestamp;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDate getManufacturedTimestamp() {
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

    public LocalDate getMaintenanceExpiryTimestamp() {
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
