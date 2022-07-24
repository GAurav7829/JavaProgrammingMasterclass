package com.JavaProgrammingMasterclass._1FirstStep;

public class _04StringClass {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        str = str + " in Java";
        System.out.println(str);
        str = "\u00A9 2022";
        System.out.println(str);
        str = "20.64548";
        System.out.println(str);
        str = str + "55.99";
        System.out.println(str);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double dbl = 12.78;
        lastString = lastString + dbl;
        System.out.println(lastString);
    }
}
