package com.company;

public class Vehicle extends Thread {
    public  void run(){
        for(int i =1;i<6;i++) {
            System.out.println("Vehicle");
           try { Thread.sleep(500);} catch (Exception e){};
        }
    }
}
