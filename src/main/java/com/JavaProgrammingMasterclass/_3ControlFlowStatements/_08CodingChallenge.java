package com.JavaProgrammingMasterclass._3ControlFlowStatements;

import java.util.Scanner;

public class _08CodingChallenge {
    public static void inputThenPrintSumAndAverage(){
        int sum = 0, count = 0;
        double avg =0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                int value = sc.nextInt();
                sum += value;
                count++;
            } else if (count == 0){
                System.out.println("SUM = 0 AVG = 0");
                break;
            } else {
                avg = (double)sum/count;
                int intVal = (int)Math.round(avg);
                System.out.println("SUM = " + sum + " AVG = " + intVal);
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }

    //*******PAINT JOB*****************************************************************
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return  -1;
        }
        double areaToPaint = width * height;
        double areaWeCanPaint = areaPerBucket * extraBucket;
        double areaLeftToPaint = areaToPaint - areaWeCanPaint;
        if (areaLeftToPaint < 0) {
            return 0;
        } else {
            return ((int)Math.ceil(areaLeftToPaint / areaPerBucket));
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0.0) {
            return  -1;
        }
        double areaToPaint = width * height;
        return ((int)Math.ceil(areaToPaint / areaPerBucket));
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0.0) {
            return  -1;
        }
        return ((int)Math.ceil(area / areaPerBucket));
    }
}
