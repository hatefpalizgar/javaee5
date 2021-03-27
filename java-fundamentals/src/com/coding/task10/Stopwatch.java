package com.coding.task10;

public class Stopwatch {
    
    private long startTime;
    private long endTime;
    
    public Stopwatch() {
        startTime = System.currentTimeMillis();
    }
    
    public void start() {
        startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return endTime - startTime;
    }
    
    public long getStartTime() {
        return startTime;
    }
    
    public long getEndTime() {
        return endTime;
    }
}
