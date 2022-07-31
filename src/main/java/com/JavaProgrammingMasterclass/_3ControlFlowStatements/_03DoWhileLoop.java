package com.JavaProgrammingMasterclass._3ControlFlowStatements;

public class _03DoWhileLoop {
    public static void main(String[] args) {
        whileLoopExample1();
        whileLoopExample2();

        doWhileLoopExample1();

        whileLoopExample3();

        int sum = sumOfDigits(23);
        System.out.println(sum);
        sum = sumOfDigits(5);
        System.out.println(sum);
    }


    private static void doWhileLoopExample1() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    private static void whileLoopExample2() {
        int count = 1;
        while (true) {
            if (count == 5) break;
            System.out.println(count);
            count++;
        }
    }

    private static void whileLoopExample1() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    private static void whileLoopExample3() {
        int num = 4;
        int finishNum = 20;
        while (num <= finishNum) {
            num++;
            if (!isEvenNumber(num))
                continue;
            System.out.println("Even Number: " + num);
        }
    }

    private static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    public static int sumOfDigits(int num) {
        if (num < 10 || num < 0) return -1;
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);
        return sum;
    }
}
