package com.company;

public class FizzBuzz {
    /*
    given a number (n), for each (i)nteger between 1 and n inclusive print the following if:
        i is multiple of 3 & 5 print FizzBuzz
        i is a multiple of 3 but not 5 print Fizz
        i is a multiple of 5 but not 3 print Buzz
        i is neither a multiple of 3 or 5 print the value of i

     */

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
