package com.lecture.objects;

public class TaxOffice {
    // field, state
    private double taxRate;
    
    // default constructor
    public TaxOffice() {
        taxRate = 0.2;
    }
    
    // getter method
    public double getTaxRate() {
        return taxRate;
    }
    
    // setter method
    public double setTaxRate(double newTaxRate) {
        double maximumChange = 0.05 * taxRate;
        if((newTaxRate - taxRate) > maximumChange){
            System.out.println("Hey, you are not allowed to increase tax rate more than 5%");
            return taxRate;
        }
        System.out.println("Successfully increased the tax rate");
        taxRate = newTaxRate;
        return taxRate;
    }
}
