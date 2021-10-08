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
public class CarProperties {
    
    private String carPropertyName;
    private String carPropertyLabel;

    public CarProperties(String carPropertyName, String carPropertyLabel) {
        this.carPropertyName = carPropertyName;
        this.carPropertyLabel = carPropertyLabel;
    }
    
    

    public String getCarPropertyName() {
        return carPropertyName;
    }

    public void setCarPropertyName(String carPropertyName) {
        this.carPropertyName = carPropertyName;
    }

    public String getCarPropertyLabel() {
        return carPropertyLabel;
    }

    public void setCarPropertyLabel(String carPropertyLabel) {
        this.carPropertyLabel = carPropertyLabel;
    }
    
    public String toString() {
        return carPropertyLabel;
    }
    
    
       
}
