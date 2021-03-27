package com.lecture.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {
        
        LocalTime localTime = LocalTime.now()
                .withSecond(0)                    // set the seconds to 0
                .withNano(0);                       // set the nanoseconds to 0
        System.out.println("Now is the time: " + localTime);    // Now is the time: 22:41
        LocalTime now = LocalTime.now();
        System.out.println("Now is the time: " + now);          // Now is the time: 22:49:01.241
        now = now.plusMinutes(10).plusHours(1);
        System.out.println("Now is the changed time: " + now);  // Now is the changed time: 23:59:01.241
    
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);            // YYYY-MM-DD
        
        LocalDate myCustomDate = LocalDate.of(2021,12,25);
        System.out.println(myCustomDate);
        
        
    }
}
