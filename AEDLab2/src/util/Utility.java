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
            case "manufacturedTimestamp": filteredList = filterBasedOnManufacturedTimestamp(propertyValue, filteredList);break;
            case "serialNumber": filteredList = filterBasedOnSerailNumber(propertyValue, filteredList);break;

            case "noOfSeats": filteredList = filterBasedOnNoOfSeats(propertyValue, filteredList);break;
            case "modelNumber": filteredList = filterBasedOnModelNumber(propertyValue, filteredList);break;
            case "city": filteredList = filterBasedOnCity(propertyValue, filteredList);break;
            case "maintenanceExpiry": filteredList = filterBasedOnMaintenanceExpiry(propertyValue, filteredList);break;
        
        
        
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
        
        
    public static ArrayList<Car> filterBasedOnManufacturedTimestamp(String propertyValue, ArrayList<Car> carList) {
        int year = Integer.parseInt(propertyValue.trim());

        return (ArrayList<Car>) carList.stream().filter(car -> car.getManufacturedTimestampDate().getYear() == year)
                .collect(Collectors.toList());
        
   } 
    
      public static ArrayList<Car> filterBasedOnMaintenanceExpiry(String propertyValue, ArrayList<Car> carList) {
        boolean expiredValue = Boolean.parseBoolean(propertyValue.trim());
        return (ArrayList<Car>) carList.stream().filter(car -> car.isExpired() == expiredValue)
                .collect(Collectors.toList());
        
   }  
    
      
       public static ArrayList<Car> filterBasedOnNoOfSeats(String propertyValue, ArrayList<Car> carList) {
        String[] input = propertyValue.split(",");
        int minValue;
        int maxValue;
        
        if (input.length <= 1 ) {
        minValue = Integer.parseInt(input[0]);
                return (ArrayList<Car>) carList.stream().filter(car -> car.getNoOfSeats() == minValue)
                .collect(Collectors.toList());

        } 
        
        if (input.length >= 2) {
        minValue = Integer.parseInt(input[0]);

        maxValue = Integer.parseInt(input[1]);
                return (ArrayList<Car>) carList.stream().filter(car -> car.getNoOfSeats() >= minValue && car.getNoOfSeats()< maxValue)
                .collect(Collectors.toList());
        

        
        }
         
    return carList;
         
           
   }  
}
