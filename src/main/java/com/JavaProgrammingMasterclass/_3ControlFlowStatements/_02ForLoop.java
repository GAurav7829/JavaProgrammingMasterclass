package com.JavaProgrammingMasterclass._3ControlFlowStatements;

public class _02ForLoop {
    public static void main(String[] args) {
        double interest = calculateInterest(10000, 2);
        System.out.println(interest);
        for (int i = 2; i <= 8; i++)
            System.out.println(String.format("%.2f", calculateInterest(10000, i)));

        System.out.println(isPrimeNumber(6));
        for (int i = 1; i <= 50; i++) {
            if (isPrimeNumber(i)) System.out.print(i + " ");
        }
        System.out.println();

        sum3And5Challenge();
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrimeNumber(int num) {
        if (num == 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void sum3And5Challenge() {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
            }
            if (count == 5) break;
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int num) {
        if (num % 2 != 0 && num >= 0) return true;
        return false;
    }

    public static int sumOdd(int start, int end) {
        if ((start < 0 || end < 0) || (start > end)) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++) if (isOdd(i)) sum += i;
        return sum;
    }
}
