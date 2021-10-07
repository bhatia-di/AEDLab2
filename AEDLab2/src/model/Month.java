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
public class Month {
    private int monthNumber;
    private String monthLabel;
    
    public Month(int monthNumber, String monthLabel) {
        
        this.monthNumber = monthNumber;
        this.monthLabel = monthLabel;
    
    
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public String getMonthLabel() {
        return monthLabel;
    }

    public void setMonthLabel(String monthLabel) {
        this.monthLabel = monthLabel;
    }
    
    public String toString() {
        return monthLabel;
    }
    
    
    
    
}
