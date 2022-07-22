package com.JavaProgrammingMasterclass._1FirstStep;

public class _02PrimitiveType {
    public static void main(String[] args) {
        //INT
        int intValue = 10000;
        int intMinValue = Integer.MIN_VALUE;    //gives the minimum integer number that can be stores in int datatype
        int intMaxValue = Integer.MAX_VALUE;    //gives the maximum integer number that can be stores in int datatype
        System.out.println("intValue: " + intValue);
        System.out.println("intMinValue: " + intMinValue);
        System.out.println("intMaxValue: " + intMaxValue);
        System.out.println("Busted MIN value: " + (intMinValue - 1));   //underflow
        System.out.println("Busted MAX value: " + (intMaxValue + 1)); //overflow

//        int intMaxTest = 2147483648;  //cte: int value is too large
        int intMaxTest = 2_147_483_647; //can be written like this for easier readability   //java v7 or higher

        //BYTE
        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("byteMinValue: " + byteMinValue);
        System.out.println("byteMaxValue: " + byteMaxValue);

        //SHORT
        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("shortMinValue: " + shortMinValue);
        System.out.println("shortMaxValue: " + shortMaxValue);
//        short bigShortLiteralValue = 32768; //cte: require short, provide int

        //LONG
        long longValue = 100L;  //put L at the end to show it is a long value (NOT necessary)
        long longMinValue = Long.MIN_VALUE;
        long longMaxvalue = Long.MAX_VALUE;
        System.out.println("longMinValue: " + longMinValue);
        System.out.println("longMaxvalue: " + longMaxvalue);
//        long bigLongLiteralValue = 2_147_483_647_234;   //cte: integer number too large
        long bigLongLiteralValue = 2_147_483_647_234L;  //valid, as we put L in the end, that denotes it is long value
        System.out.println("bigLongLiteralValue: " + bigLongLiteralValue);
    }
}
