package com.company;

public class Main {

   Main(){
       System.out.println("main class");
   }

   private void mainGo(){
       new MainIneer().innerGo();
   }

   class  MainIneer{
       MainIneer(){
           System.out.println("inner class of main");
       }

       public void innerGo(){
           System.out.println("inner go");
       }
   }

    public static void main(String[] args) {
        Main main= new Main();
        main.mainGo();
    }

    /*
    * Instantiating the outer class
      Outer_Demo outer = new Outer_Demo();

      Instantiating the inner class
      Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
      System.out.println(inner.getNum());
      *
      * */
}
