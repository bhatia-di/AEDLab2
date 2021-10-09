/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import model.Car;

/**
 *
 * @author 18577
 */
public final class Utility {
    
    
    public static ArrayList<Car> filterTable(String propertyName, String propertyValue, ArrayList<Car> carList) {
        System.out.println("--------------");
        ArrayList<Car> filteredList = (ArrayList<Car>) carList.clone();
        switch(propertyName) {
            
            case "isAvailable": filteredList = filterBasedOnAvailabity(propertyValue, filteredList);
            case "modelName": filteredList = filterBasedOnModelName(propertyValue, filteredList);
            case "manufacturer": filteredList = filterBasedOnManufacturer(propertyValue, filteredList);
            //case "manufacturedTimestamp": filteredList = filterBasedOnModelName(propertyValue, filteredList);
            //case "noOfSeats": filteredList = filterBasedOnModelName(propertyValue, filteredList);
            case "modelNumber": filteredList = filterBasedOnModelNumber(propertyValue, filteredList);
            case "geographicData": filteredList = filterBasedOnCity(propertyValue, filteredList);
            //case "maintenanceExpiryTimestamp": filteredList = filterBasedOnModelName(propertyValue, filteredList);
        
        
        
      }
    
    return filteredList;
   }
    
    public static ArrayList<Car> filterBasedOnAvailabity(String propertyValue, ArrayList<Car> carList) {
        
        boolean isAvailable = Boolean.parseBoolean(propertyValue.trim());
        return (ArrayList<Car>) carList.stream().filter(car -> car.isIsAvailable() == isAvailable).collect(Collectors.toList());
        
    }
    
     public static ArrayList<Car> filterBasedOnModelName(String propertyValue, ArrayList<Car> carList) {
        return (ArrayList<Car>) carList.stream().filter(car -> propertyValue.trim().toUpperCase().equals(car.getModelName().toUpperCase())).collect(Collectors.toList());
        
   }
     
      public static ArrayList<Car> filterBasedOnManufacturer(String propertyValue, ArrayList<Car> carList) {
        return (ArrayList<Car>) carList.stream().filter(car -> propertyValue.trim().toUpperCase().equals(car.getManufacturer().toUpperCase())).collect(Collectors.toList());
        
   }
      
      public static ArrayList<Car> filterBasedOnModelNumber(String propertyValue, ArrayList<Car> carList) {
        return (ArrayList<Car>) carList.stream().filter(car -> propertyValue.trim().toUpperCase().equals(car.getModelNumber().toUpperCase())).collect(Collectors.toList());
        
   }
      
        public static ArrayList<Car> filterBasedOnCity(String propertyValue, ArrayList<Car> carList) {
        return (ArrayList<Car>) carList.stream().filter(car -> propertyValue.trim().toUpperCase().equals(car.getGeographicData().getCity().toUpperCase())).collect(Collectors.toList());
        
   }
    
}
