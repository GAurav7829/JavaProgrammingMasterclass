package com.JavaProgrammingMasterclass._3ControlFlowStatements;

public class _01SwitchStatements {
    public static void main(String[] args) {
        switchExample1();
        printDayOfWeek(4);
    }

    private static void switchExample1() {
        int value = 2;
        switch (value) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default statement");
        }
    }

    private static void printDayOfWeek(int day) {
        String DAY = "NOT A VALID DAY";
        switch (day) {
            case 0:
                DAY = "SUNDAY";
                break;
            case 1:
                DAY = "MONDAY";
                break;
            case 2:
                DAY = "TUEDAY";
                break;
            case 3:
                DAY = "WEDNESDAY";
                break;
            case 4:
                DAY = "THURSDAY";
                break;
            case 5:
                DAY = "FRIDAY";
                break;
            case 6:
                DAY = "SATURDAY";
                break;
        }
        System.out.println(DAY);
    }

    public static void printNumberInWord(int num) {
        String NUM = "OTHER";
        switch (num) {
            case 0:
                NUM = "ZERO";
                break;
            case 1:
                NUM = "ONE";
                break;
            case 2:
                NUM = "TWO";
                break;
            case 3:
                NUM = "THREE";
                break;
            case 4:
                NUM = "FOUR";
                break;
            case 5:
                NUM = "FIVE";
                break;
            case 6:
                NUM = "SIX";
                break;
            case 7:
                NUM = "SEVEN";
                break;
            case 8:
                NUM = "EIGHT";
                break;
            case 9:
                NUM = "NINE";
                break;
        }
        System.out.println(NUM);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999))
            return -1;
        int days = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
        }
        return days;
    }
}
