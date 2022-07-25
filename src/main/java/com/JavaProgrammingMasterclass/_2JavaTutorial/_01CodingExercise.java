package com.JavaProgrammingMasterclass._2JavaTutorial;

public class _01CodingExercise {
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
}
