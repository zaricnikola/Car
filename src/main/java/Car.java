/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zaric
 */
public class Car {
    public String brand;
    public String model;
    public String color;
    private int buildYear;

public Car() {
    
}  

public Car(int buildYear) {
    this.buildYear = buildYear;
}

public Car(String brand, String model, String color, int buildYear) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.buildYear = buildYear;
   
}
 
    public int getBuildYear() {
        return this.buildYear;
    }
    
    public void printAttributes() {
        System.out.println("Brand " + this.brand);
        System.out.println("Model " + this.model);
        System.out.println("Color " + this.color);
        System.out.println("Build Year " + this.buildYear);
        
    }
}



