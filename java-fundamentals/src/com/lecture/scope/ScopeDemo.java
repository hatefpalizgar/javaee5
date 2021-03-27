package com.sda.scope;

public class ScopeDemo {
    // class scope
    public static void main(String[] args) {
        int x = 1;  // x scope: main method
        int y = 1;  // y scope: main method
        
        for (int i = 0; i < 10; i++) {  // i scope: for loop
            x += i;
        }
        
        for (int i = 0; i< 10; i++) {
            y += i;
        }
    }
    // end of main()
    
    
    
}
