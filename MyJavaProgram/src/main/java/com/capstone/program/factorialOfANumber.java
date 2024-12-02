package com.capstone.program;

public class factorialOfANumber implements Runnable {
    int x;
    public factorialOfANumber(int x) {
        this.x = x;
    }
    public int factorial(int fact) {
        if (fact == 1 || fact == 0) {
            return 1;
        }

        return fact * factorial(fact-1);
    }

    @Override
    public void run() {
        System.out.println("Factorial of Number="+x+"is"+factorial(x)+"Using Thread:"+Thread.currentThread().getName());
    }
}
