package org.example;

public class Calculator {

    private Integer firstNumber;
    private Integer secondNumber;

    public Calculator(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    //Empty constructor
    public Calculator() {
    }

    // Method that adds the two numbers without passing arguments through it...
    public Integer sumOfNumbers(){
        Integer sum = firstNumber + secondNumber;
        System.out.println(sum);
        return sum;
    }

    // Method that adds the subtracts numbers without passing arguments through it...
    public Integer differenceOfNumbers(){
        Integer difference = firstNumber - secondNumber;
        System.out.println(difference);
        return difference;
    }

    // Method that finds modulus of numbers without passing arguments through it...
    public Integer modulusOfNumbers(){
        Integer modulus = firstNumber % secondNumber;
        System.out.println(modulus);
        return modulus;
    }

    // Method that adds the two numbers...
    public Integer sumOfNumbers(Integer firstNumber, Integer secondNumber){
        Integer sum = firstNumber + secondNumber;
        System.out.println(sum);
        return sum;
    }

    // Method that subtracts the two numbers...
    public Integer differenceOfNumbers(Integer firstNumber, Integer secondNumber){
        Integer difference = firstNumber - secondNumber;
        System.out.println(difference);
        return difference;
    }


    // Method that gets the remainder of the two numbers...
    public Integer modulusOfNumbers(Integer firstNumber, Integer secondNumber){
        Integer modulus = firstNumber % secondNumber;
        System.out.println(modulus);
        return modulus;
    }



}
