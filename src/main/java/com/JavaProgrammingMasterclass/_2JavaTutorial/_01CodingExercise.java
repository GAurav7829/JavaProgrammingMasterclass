package com.JavaProgrammingMasterclass._2JavaTutorial;

public class _01CodingExercise {

    public static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {
        //checkNumber
        System.out.println(checkNumber(0));
        System.out.println(checkNumber(99));
        System.out.println(checkNumber(-56));

        //speedConverter
        System.out.println(toMilesPerHour(10.25));
        //printConversion
        printConversion(10.25);
        //printMegaBytesAndKiloBytes
        printMegaBytesAndKiloBytes(2500);
        //shouldWakeUp
        System.out.println(shouldWakeUp(true, 10));
        //isLeapYear
        System.out.println(isLeapYear(2016));
    }

    public static String checkNumber(int num) {
        String res = "zero";
        if (num > 0)
            res = "positive";
        else if (num < 0)
            res = "negative";
        return res;
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("invalid Value");
        else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int MB = kiloBytes / 1024;
            int KB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + MB + " MB and " + KB + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        if (hourOfDay < 8 || hourOfDay > 22)
            return barking;
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = num1 * 1000;
        num2 = num2 * 1000;

        if ((int) num1 == (int) num2)
            return true;
        return false;
    }

    public static boolean hasEqualSum(int n1, int n2, int n3) {
        if (n1 + n2 == n3) return true;
        return false;
    }

    public static boolean hasTeen(int n1, int n2, int n3) {
        if (isTeen(n1) || isTeen(n2) || isTeen(n3))
            return true;
        return false;
    }

    private static boolean isTeen(int n) {
        if (n >= 13 && n <= 19) return true;
        return false;
    }

    public static String printYearsAndDays(long minutes) {
        if (minutes < 0)
            return INVALID_VALUE;
        long year = minutes / (60 * 24 * 365);
        long day = (minutes % (60 * 24 * 365)) / (24 * 60);
        return minutes + " min = " + year + " y and " + day + " d";
    }

    public static void printEqual(int n1, int n2, int n3) {
        if (n1 < 0 || n2 < 0 || n3 < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }
        if (n1 == n2 && n1 == n3)
            System.out.println("All numbers are equal");
        else if (n1 != n2 && n1 != n3 && n2 != n3)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ((temperature > 24) && (temperature < 36))
            return true;
        else if ((summer) && (temperature > 24) && (temperature < 46))
            return true;
        return false;
    }
}
