package com.JavaProgrammingMasterclass._3ControlFlowStatements;

public class _05ParsingValuesToString {
    public static void main(String[] args) {
        String numToString = "2022";
        System.out.println("NumberToString: " + numToString);

        int num = Integer.parseInt(numToString);
        System.out.println("number: " + num);

        numToString += 1;
        num += 1;
        System.out.println(numToString);
        System.out.println(num);

        try {
            numToString = "2022a";
            num = Integer.parseInt(numToString);    //NumberFormatException
        }catch (Exception ex){
            System.err.println(ex);
        }
        numToString = "2022";
        double dbl = Double.parseDouble(numToString);
        System.out.println(dbl);

    }
}
