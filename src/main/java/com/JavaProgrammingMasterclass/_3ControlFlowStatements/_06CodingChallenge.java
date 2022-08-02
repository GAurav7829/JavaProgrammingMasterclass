package com.JavaProgrammingMasterclass._3ControlFlowStatements;

public class _06CodingChallenge {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean result = false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return result;
        }
        if (bigCount * 5 + smallCount < goal) return result;
        if (goal % 5 > smallCount) return result;
        return true;
    }

    public static int getLargestPrime(int number) {
        if (number >= 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;
        }
        return -1;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // a loop which prints a new line (a row)
            System.out.println();
            System.out.println();
            for (int i = 0; i < number; i++) {
                // a loop which prints * and a space
                for (int j = 0; j < number; j++) {

                    // i == 0 top
                    // (i == number - 1) bottom
                    // (j == number - 1) right
                    //  j == 0 left

                    if (i == 0 || (i == number - 1) || j == 0 || (j == number - 1) || (i == j) || ((j + 1) == number - (i + 1) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
