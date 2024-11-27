package com.capstone.MainClasses;

import com.capstone.program.ThreadToPrintNumber;

public class ThreadToPrintNumberMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new ThreadToPrintNumber(i));
            thread.start();
        }
    }
}
