package com.sks.bank;

import java.util.ArrayList;

public class BankAccount {

    private String accountHolder;
    private double balance;

    private ArrayList<String> transactions = new ArrayList<>();

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance += amount;

        transactions.add("Deposited: ₹" + amount);

        System.out.println("Amount Deposited Successfully");
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient Balance!");
        }

        balance -= amount;

        transactions.add("Withdrawn: ₹" + amount);

        System.out.println("Amount Withdrawn Successfully");
    }

    public void showBalance() {

        System.out.println("Current Balance: ₹" + balance);
    }

    public void showTransactions() {

        System.out.println("\nTransaction History");

        if (transactions.isEmpty()) {
            System.out.println("No Transactions Found");
        } else {

            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}