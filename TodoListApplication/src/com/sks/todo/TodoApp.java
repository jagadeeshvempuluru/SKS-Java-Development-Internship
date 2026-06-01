package com.sks.todo;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {

            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Complete");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Task Title: ");
                    String title = sc.nextLine();

                    tasks.add(new Task(title));

                    System.out.println("Task Added Successfully!");
                    break;

                case 2:

                    if (tasks.isEmpty()) {
                        System.out.println("No Tasks Available.");
                    } else {

                        for (int i = 0; i < tasks.size(); i++) {

                            Task task = tasks.get(i);

                            System.out.println(
                                    (i + 1) + ". "
                                    + task.getTitle()
                                    + " - "
                                    + (task.isCompleted()
                                            ? "Completed"
                                            : "Pending"));
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Task Number: ");
                    int index = sc.nextInt();

                    if (index > 0 && index <= tasks.size()) {

                        tasks.get(index - 1).markCompleted();

                        System.out.println("Task Marked Completed!");

                    } else {

                        System.out.println("Invalid Task Number");
                    }

                    break;

                case 4:

                    System.out.println("Application Closed");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}