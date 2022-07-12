/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zaric
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.color = "red";
        //audi.buildYear = 2005;
        audi.printAttributes();
        
        Car bmw = new Car();
        bmw.brand = "bmw";
        bmw.model = "x5";
        bmw.printAttributes();
        
        Car fiat = new Car(2010);
        System.out.println("godina " + fiat.getBuildYear());
        
        Car lada = new Car("lada", "niva", "green", 2018);
        lada.printAttributes();
        
    }
    
}
