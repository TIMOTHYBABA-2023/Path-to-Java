package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Calculator calculator1 = new Calculator();
            calculator1.sumOfNumbers(25,78);
            calculator1.differenceOfNumbers(60,40);
            calculator1.modulusOfNumbers(1000,500);

        Calculator calculator2 = new Calculator(25,50);
        calculator2.sumOfNumbers();
        calculator2.differenceOfNumbers();
        calculator2.modulusOfNumbers();
        calculator2.modulusOfNumbers(56,25);
    }



}