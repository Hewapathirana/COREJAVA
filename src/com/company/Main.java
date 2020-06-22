package com.company;


public class Main {

    public static void main(String[] args) {
      Runnable vehicle = new Vehicle();
      Runnable car = new Car();

      Thread t1 = new Thread(vehicle);
      Thread t2 = new Thread(car);


      t1.start();
        try { Thread.sleep(10);} catch (Exception e){};
      t2.start();

    }

}
