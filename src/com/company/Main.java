package com.company;


public class Main {

    public static void main(String[] args) throws Exception {

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

        System.out.println(t1.isAlive()); // true
      //by using join, t1 and t2 threads telling main thread to hold until finish the t1 and t2
        t1.join();
        t2.join();

        // isalive method can be used for check whether a thread is running or completed
        System.out.println(t1.isAlive()); // false
        // main thread will execute this
        System.out.println("bye");

    }

}
