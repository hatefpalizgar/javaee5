package com.lecture.objects;



public class Main {
    public static void main(String[] args) {
        // instantiate a TaxOffice object
        TaxOffice tallinnOffice = new TaxOffice();
        System.out.println(tallinnOffice.getTaxRate());
        
        // we have to limit access to taxRate
        // defined taxRate as private
        // provided getter method for reading its value
        
        tallinnOffice.setTaxRate(0.204);
        System.out.println(tallinnOffice.getTaxRate());
     
        
    }
}
