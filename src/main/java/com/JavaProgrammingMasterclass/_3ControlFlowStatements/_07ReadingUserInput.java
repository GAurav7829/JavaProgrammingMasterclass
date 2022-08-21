package com.JavaProgrammingMasterclass._3ControlFlowStatements;

import java.util.Scanner;

public class _07ReadingUserInput {
    public static void main(String[] args) {


    }

    private static void showMinMax() {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        boolean firstTime = true;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter Number: ");
                boolean isInt = scanner.hasNextInt();
                if (isInt) {
                    int num = scanner.nextInt();
                    if (firstTime) {
                        min = num;
                        max = num;
                        firstTime = false;
                    } else {
                        if (min > num) min = num;
                        if (max < num) max = num;
                    }
                } else {
                    System.out.println("Invalid number entered. Showing result...");
                    break;
                }
            }
        }

        System.out.println("Min num: " + min);
        System.out.println("Max num: " + max);
    }

    private static void sumOfTenNumbers() {
        int sum = 0;
        int counter = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("SUM of 10 numbers............");
            while (counter < 10) {
                int order = counter + 1;
                System.out.print("Enter number #" + order + ": ");
                boolean isInt = scanner.hasNextInt();
                if (isInt) {
                    int num = scanner.nextInt();
                    counter++;
                    sum += num;
                } else {
                    System.out.println("Invalid Number...");
                }
                scanner.nextLine(); //handle end of line (enter key)
            }
        }
        System.out.println("Sum: " + sum);
    }

    private static void readNameAndYear() {
        String name;
        int yearOfBirth;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Name: ");
            name = scanner.nextLine();
            System.out.print("Enter Year of Birth: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                yearOfBirth = scanner.nextInt();
                System.out.println("Name: " + name);
                System.out.println("Year Of Birth: " + yearOfBirth);
            } else {
                System.out.println("Invalid year");
            }
        }
    }
}
