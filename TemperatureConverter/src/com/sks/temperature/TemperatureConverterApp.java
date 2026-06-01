package com.sks.temperature;

import java.util.Scanner;

public class TemperatureConverterApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== TEMPERATURE CONVERTER =====");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Thank You!");
                break;
            }

            System.out.print("Enter Temperature: ");
            double temp = sc.nextDouble();

            switch (choice) {

                case 1:
                    double fahrenheit = (temp * 9 / 5) + 32;
                    System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                    break;

                case 2:
                    double celsius = (temp - 32) * 5 / 9;
                    System.out.println("Temperature in Celsius: " + celsius);
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}