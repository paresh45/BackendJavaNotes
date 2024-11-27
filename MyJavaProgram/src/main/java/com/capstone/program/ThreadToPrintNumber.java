package com.capstone.program;
//Printing 1 to 100 in multiple thread
public class ThreadToPrintNumber implements Runnable {
    int x;
    public ThreadToPrintNumber(int x) {
        this.x = x;
    }
    @Override
    public void run() {
        System.out.println(x +" : Thread " + Thread.currentThread().getName() + " is running ");
    }
}
