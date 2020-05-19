package com.company;

public class Main {


    public static void javaIncrement(int x,int y){
          int z = y;
        if(++x >10 && ++y <15){

            ++x;
        }
        else {
            /*here z will be equal to incremented value of y
            * if we wrote the expression as z=y++ then z will be
            * equal to before incremented value of y*/
            z = ++y;
            //z= y++;
        }

        System.out.println("x = " + x + " Y = " +y + " Z = " +z);
    }


    public static void main(String[] args) {
	  Main.javaIncrement(10,15);
    }
}
