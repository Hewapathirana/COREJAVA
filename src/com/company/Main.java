package com.company;


public class Main {

    public static void main(String[] args) {

        //here we are using a anonymous class to implement the runnable functional interface
      Runnable vehicle = () -> {
              for(int i =1;i<6;i++) {
                  System.out.println("Vehicle");
                  try { Thread.sleep(500);} catch (Exception e){};
              }
          };

      Runnable car = () ->{
          for(int i =1;i<6;i++) {
              System.out.println("Car");
              try { Thread.sleep(500);} catch (Exception e){};
          }
      };

      // we can minimize the code by replace the vehicle with above lambda expression

      Thread t1 = new Thread(vehicle);
      Thread t2 = new Thread(car);


      t1.start();
        try { Thread.sleep(10);} catch (Exception e){};
      t2.start();

    }

}
