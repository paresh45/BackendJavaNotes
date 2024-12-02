package com.capstone.MainClasses;

import com.capstone.program.ThreadToPrintNumber;
import com.capstone.program.factorialOfANumber;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolToPrintFactorial {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 1000000; i++) {
            ex.execute(new factorialOfANumber(i));
           // ex.execute(new ThreadToPrintNumber(i));
        }
    }
}
