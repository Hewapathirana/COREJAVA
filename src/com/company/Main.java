package com.company;


public class Main {

    public static void main(String[] args) {
      Vehicle vehicle = new Vehicle();
      Car car = new Car();
      vehicle.start();
        try { Thread.sleep(10);} catch (Exception e){};
      car.start();

    }

}
