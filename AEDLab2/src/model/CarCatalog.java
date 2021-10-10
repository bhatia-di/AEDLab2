/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;

/**
 *
 * @author 18577
 */
public class CarCatalog {
    private ArrayList<Car> cars;
    private LocalDateTime lastUpdatedTimestamp = LocalDateTime.now();
    
    public CarCatalog() {
        cars = new ArrayList<Car>();
       
        initializeCatalog();
    }
    
    public void initializeCatalog() {
    
     cars.add(new Car("Tesla", true, null, "Space X", 
                LocalDate.of(2015, java.time.Month.MARCH, 23),
                4, "1HNN9734983498MS", "SX5", new GeographicData("", "Boston", "MA", "USA", "02115"),
                LocalDate.of(2021, java.time.Month.SEPTEMBER, 30)));
        
        cars.add(new Car("Avalon", false, 
                LocalDateTime.of(2021, java.time.Month.SEPTEMBER, 30, 20, 00, 00), 
                "Toyota", 
                LocalDate.of(2015, java.time.Month.MARCH, 23),
                4, "1HNN9734983498MS", "SX5",
                new GeographicData("", "Boston", "MA", "USA", "02115"),
                LocalDate.of(2021, java.time.Month.SEPTEMBER, 30)));
        
        cars.add(new Car("Tundra", true, 
                LocalDateTime.of(2021, java.time.Month.SEPTEMBER, 30, 20, 00, 00), 
                "Toyota", 
                LocalDate.of(2015, java.time.Month.MARCH, 23),
                6, "1HNN9734983498MS", "SX5",
                new GeographicData("", "Cambridge", "MA", "USA", "02115"),
                LocalDate.of(2021, java.time.Month.SEPTEMBER, 30)));
        
         cars.add(new Car("X1", true, null,
                "BMW", 
                LocalDate.of(2015, java.time.Month.MARCH, 23),
                6, "1HNN9734983498MS", "SX5",
                new GeographicData("", "Cambridge", "MA", "USA", "02115"),
                LocalDate.of(2021, java.time.Month.SEPTEMBER, 30)));
         
         
          cars.add(new Car("X2", true, null,
                "BMW", 
                LocalDate.of(2015, java.time.Month.MARCH, 23),
                6, "1HNN9734983498MS", "SX5",
                new GeographicData("", "Cambridge", "MA", "USA", "02115"),
                LocalDate.of(2021, java.time.Month.SEPTEMBER, 30)));
          
          
          
           cars.add(new Car("X3", true, null,          
                "BMW", 
                LocalDate.of(2015, java.time.Month.MARCH, 23),
                6, "1HNN9ty734983498MS", "SX5",
                new GeographicData("", "Burligton", "MA", "USA", "02115"),
                LocalDate.of(2021, java.time.Month.SEPTEMBER, 30)));
           
            cars.add(new Car("Z1", true, null,
                "BMW", 
                LocalDate.of(2015, java.time.Month.MARCH, 23),
                6, "1HNN97349r83498MS", "SX5",
                new GeographicData("", "Cambridge", "MA", "USA", "02115"),
                LocalDate.of(2025, java.time.Month.SEPTEMBER, 30)));
            
            
             cars.add(new Car("LANCER", false, 
                LocalDateTime.of(2021, java.time.Month.SEPTEMBER, 30, 20, 00, 00), 
                "MITUSABHI", 
                LocalDate.of(2015, java.time.Month.MARCH, 23),
                6, "1HNN97346983498MS", "SX5",
                new GeographicData("", "Reading", "MA", "USA", "02115"),
                LocalDate.of(2023, java.time.Month.JUNE, 30)));
        
        
        
    }
    
 

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
        setLastUpdatedTimestamp(LocalDateTime.now());
    }

    public String getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp.toString();
    }

    public void setLastUpdatedTimestamp(LocalDateTime lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }
    
    
    public int getTotalCars() {
        
        return getCars().size();
    
    }
    
    
    public int getAvailableNumberOfCars() {
        ArrayList<Car> availCars = (ArrayList<Car>) cars.stream().filter(car -> car.isIsAvailable() == true)
                .collect(Collectors.toList());
        return availCars.size();    
    }
    
    
    public int getUnAvailableNumberOfCars() {
        ArrayList<Car> availCars = (ArrayList<Car>) cars.stream().filter(car -> car.isIsAvailable() == false)
                .collect(Collectors.toList());
        return availCars.size();    
    }
    
    public String getListOfManufacturer()  {
        
        Set<String> manufacturerSet = new HashSet<String>();
        StringBuffer outputString = new StringBuffer();
        
        for(Car carRecord: cars) {
            manufacturerSet.add(carRecord.getManufacturer());       
        }
        Iterator manufacturerSetIterator = manufacturerSet.iterator();
        while(manufacturerSetIterator.hasNext()) {
        outputString.append(manufacturerSetIterator.next());
        if (manufacturerSetIterator.hasNext()) outputString.append(" , ");
        
        }
        
        
        return outputString.toString();
    
    }
    
    public Car getCarAtIndex(int index) {
        
        return cars.get(index);
    
  }
    
    
    
    
}
