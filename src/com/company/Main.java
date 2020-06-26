package com.company;


public class Main {


    public static void main(String[] args) throws Exception {

      Counter counter = new Counter();

      Thread t1 = new Thread(counter);
      Thread t2 = new Thread(counter);
      t1.start();
      t2.start();
      t1.join();
      t2.join();

        System.out.println("count = " + counter.cunt);



    }

}
