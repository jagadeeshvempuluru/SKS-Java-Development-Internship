package com.sks.bank;

import java.util.Scanner;

public class BankingSystemApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        BankAccount account = new BankAccount(name, 0);

        while (true) {

            System.out.println("\n===== BANKING SYSTEM =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter Amount: ");
                        double deposit = sc.nextDouble();

                        account.deposit(deposit);

                        break;

                    case 2:

                        System.out.print("Enter Amount: ");
                        double withdraw = sc.nextDouble();

                        account.withdraw(withdraw);

                        break;

                    case 3:

                        account.showBalance();

                        break;

                    case 4:

                        account.showTransactions();

                        break;

                    case 5:

                        System.out.println("Thank You!");
                        sc.close();
                        System.exit(0);

                    default:

                        System.out.println("Invalid Choice");
                }

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
    }
}