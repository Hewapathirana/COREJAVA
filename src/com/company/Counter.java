package com.company;

public class Counter implements Runnable {
    int cunt;

    @Override
    public synchronized void run() {
        for(int i =1;i<=1000;i++) {cunt++;}
    }
}
