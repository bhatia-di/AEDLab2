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
            
            case "isAvailable": filteredList = filterBasedOnAvailabity(propertyValue, filteredList);break;
            case "modelName": filteredList = filterBasedOnModelName(propertyValue, filteredList);break;
            case "manufacturer": filteredList = filterBasedOnManufacturer(propertyValue, filteredList);break;
            //case "manufacturedTimestamp": filteredList = filterBasedOnModelName(propertyValue, filteredList);break;
            //case "availabilityTimestamp": filteredList = filterBasedOnModelName(propertyValue, filteredList);break;
            case "serialNumber": filteredList = filterBasedOnSerailNumber(propertyValue, filteredList);break;

            //case "noOfSeats": filteredList = filterBasedOnModelName(propertyValue, filteredList);break;
            case "modelNumber": filteredList = filterBasedOnModelNumber(propertyValue, filteredList);break;
            case "city": filteredList = filterBasedOnCity(propertyValue, filteredList);break;
            //case "maintenanceExpiry": filteredList = filterBasedOnModelName(propertyValue, filteredList);break;
        
        
        
      }
    
    return filteredList;
   }
    
    public static ArrayList<Car> filterBasedOnAvailabity(String propertyValue, ArrayList<Car> carList) {
        
        boolean isAvailable = Boolean.parseBoolean(propertyValue.trim());
        return (ArrayList<Car>) carList.stream().filter(car -> car.isIsAvailable() == isAvailable)
                .collect(Collectors.toList());
        
    }
    
     public static ArrayList<Car> filterBasedOnModelName(String propertyValue, ArrayList<Car> carList) {
        return (ArrayList<Car>) carList.stream().filter(car -> propertyValue.trim().equalsIgnoreCase(car.getModelName())).collect(Collectors.toList());
        
   }
     
      public static ArrayList<Car> filterBasedOnManufacturer(String propertyValue, ArrayList<Car> carList) {
        return (ArrayList<Car>) carList.stream().filter(car -> propertyValue.trim().equalsIgnoreCase(car.getManufacturer()))
                .collect(Collectors.toList());
        
   }
      
      public static ArrayList<Car> filterBasedOnModelNumber(String propertyValue, ArrayList<Car> carList) {
        return (ArrayList<Car>) carList.stream().filter(car -> propertyValue.trim().equalsIgnoreCase(car.getModelNumber()))
                .collect(Collectors.toList());
        
   }
      
        public static ArrayList<Car> filterBasedOnCity(String propertyValue, ArrayList<Car> carList) {
            System.out.println(carList.size());
        return (ArrayList<Car>) carList.stream().filter(car -> propertyValue.trim().equalsIgnoreCase(car.getGeographicData().getCity()))
                .collect(Collectors.toList());
        
   }
        
        public static ArrayList<Car> filterBasedOnSerailNumber(String propertyValue, ArrayList<Car> carList) {
            System.out.println(carList.size());
        return (ArrayList<Car>) carList.stream().filter(car -> propertyValue.trim().equalsIgnoreCase(car.getSerialNumber()))
                .collect(Collectors.toList());
        
   }
    
}
