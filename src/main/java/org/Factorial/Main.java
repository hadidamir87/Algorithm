package org.Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This program returns factorial of your number.\nEnter your number.");
        Scanner scanner=new Scanner(System.in);
        Integer number=scanner.nextInt();
  FactorialTest factorialTest=new FactorialTest();
        System.out.println(factorialTest.factorial(number));

    }
}