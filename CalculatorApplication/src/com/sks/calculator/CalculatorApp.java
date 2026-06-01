package com.sks.calculator;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== CALCULATOR MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Calculator Closed.");
                break;
            }

            System.out.print("Enter First Number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter Second Number: ");
            double num2 = sc.nextDouble();

            switch (choice) {

                case 1:
                    System.out.println("Result = " + add(num1, num2));
                    break;

                case 2:
                    System.out.println("Result = " + subtract(num1, num2));
                    break;

                case 3:
                    System.out.println("Result = " + multiply(num1, num2));
                    break;

                case 4:
                    try {
                        System.out.println("Result = " + divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }

        return a / b;
    }
}