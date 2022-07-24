package com.JavaProgrammingMasterclass._1FirstStep;

public class _03PrimitiveTypeChallenge {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);


        int intValue1 = 5 / 3;
//        float floatValue = 5.25;  //cte: require float, found double, by default floating point datatype is double
        float floatValue = 5f / 3;
        double doubleValue = 5d / 3;
        System.out.println("intValue    : " + intValue1);
        System.out.println("floatValue  : " + floatValue);
        System.out.println("doubleValue : " + doubleValue);

        //convert pound to KG
        float pound = 2;
        float kg = pound * 0.45359237f;
        System.out.println(pound + " pound = " + kg + "Kg");


    }
}
