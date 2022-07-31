package com.JavaProgrammingMasterclass._3ControlFlowStatements;

public class _04CodingChallenge {
    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        int rev = 0;

        for (int number = num; number != 0; number /= 10) {
            rev = rev * 10 + number % 10;
        }

        return num == rev;
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) return -1;
        int sum = num % 10;
        for (int number = num; ; number /= 10) {
            if (number / 10 == 0) {
                sum += number % 10;
                break;
            }
        }
        return sum;
    }

    public static int getEvenDigitSum(int num) {
        if (num < 0) return -1;
        int sum = 0;
        for (int number = num; number != 0; number /= 10) {
            int n = number % 10;
            if (n % 2 == 0) sum += n;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) return false;
        String str1 = num1 + "";
        String str2 = num2 + "";
        String[] splitStr1 = str1.split("");
        for (int i = 0; i < splitStr1.length; i++) {
            if (str2.contains(splitStr1[i])) return true;
        }
        return false;
    }

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) return false;
        if (num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10) return true;
        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int div1 = 0;
        int div2 = 0;
        int greatestCommonDivisor = -1;
        for (int i = 1, j = 1; i <= first || j <= second; i++, j++) {
            if (first % i == 0) div1 = i;
            if (second % j == 0) div2 = j;
            if (div1 == div2) greatestCommonDivisor = div1;
        }
        return greatestCommonDivisor;
    }

    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.print(i + " ");
        }
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 1)
            return false;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0) sum += i;
        return sum == num;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            number /= 10;
            count++;;
        }
        return count;
    }

    public static int reverse(int number) {
        int remainder,reverseNumber = 0;
        boolean isNegative = false;
        if (number < 0) {
            number = Math.abs (number);
            isNegative = true;
        }
        while (number > 0) {
            remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        if (isNegative == true) {
            return -reverseNumber;
        }
        return reverseNumber;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reverseNumber = reverse(number);
            int numberDigitCount = getDigitCount(number);
            int reverseNumberDigitCount = getDigitCount(reverseNumber);
            String s = "";
            int remainder = 0;
            while (reverseNumber > 0) {
                remainder = reverseNumber % 10;
                switch(remainder) {
                    case 0:
                        s = s + "Zero ";
                        break;
                    case 1:
                        s = s + "One ";
                        break;
                    case 2:
                        s = s + "Two ";
                        break;
                    case 3:
                        s = s + "Three ";
                        break;
                    case 4:
                        s = s + "Four ";
                        break;
                    case 5:
                        s = s + "Five ";
                        break;
                    case 6:
                        s = s + "Six ";
                        break;
                    case 7:
                        s = s + "Seven ";
                        break;
                    case 8:
                        s = s + "Eight ";
                        break;
                    case 9:
                        s = s + "Nine ";
                        break;
                    default:
                        break;
                }
                reverseNumber /= 10;
            }
            if (numberDigitCount > reverseNumberDigitCount) {
                for(int i = 0; i < (numberDigitCount - reverseNumberDigitCount); i++) {
                    s = s + "Zero ";
                }
            }
            System.out.println(s);
        }
    }
}
