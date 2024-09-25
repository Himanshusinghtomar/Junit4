package org.testing.services;

public class CalculatorService {


    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int subtractTwoNumbers(int a, int b) {
        return a - b;
    }

    public static int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }

    public static int divideTwoNumbers(int a, int b) {
        return a / b;
    }

    public static int sumAnyNumbers(int ...numbers)
    {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
