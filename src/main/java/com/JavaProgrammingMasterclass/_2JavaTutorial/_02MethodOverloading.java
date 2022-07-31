package com.JavaProgrammingMasterclass._2JavaTutorial;

public class _02MethodOverloading {

    public static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {
        int newScore = calculateScore("grv", 500);
        System.out.println("New Score: " + newScore);
        newScore = calculateScore(600);
        System.out.println("New Score: " + newScore);

        System.out.println(calcFeetAndInchesToCentimeters(1, 12));

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(4500));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 && inches > 12))
            return -1;
        return (feet * 12 + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0 && inches > 12)
            return -1;
        return inches * 2.54;
    }

    public static String getDurationString(int min, int sec) {
        if (min < 0 || (sec < 0 && sec > 59))
            return INVALID_VALUE;
        return min / 60 + "h " + min % 60 + "m " + sec + "s";
    }

    public static String getDurationString(int sec) {
        if (sec < 0)
            return INVALID_VALUE;

        int m = sec / 60;
        int s = sec % 60;
        return getDurationString(m, s);
    }

    public static double area(double radius) {
        if (radius < 0)
            return -1;
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0)
            return -1;
        return x * y;
    }


}

