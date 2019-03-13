package com.company;
import java.util.Scanner;

public class Main  {
//    The main class is for entering data and outputting the result
    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(System.in);
            String[] arrOfInput = new String[3];
            System.out.print("Input a mathematical expression: ");
            String num1 = read.next();
            String operator = read.next();
            String num2 = read.next();
            String expression = num1 + " " + operator +" "+ num2;

            if ("IIIVIIIX".contains(String.valueOf(num1))
                    && "IIIVIIIX".contains(String.valueOf(num1))) {
                int arabicNum1 = RomanNumbers.FromRomanToArabic(num1);
                int arabicNum2 = RomanNumbers.FromRomanToArabic(num2);
                arrOfInput[0] = Integer.toString(arabicNum1);
                arrOfInput[1] = operator;
                arrOfInput[2] = Integer.toString(arabicNum2);
                String expressionOfRoman = arrOfInput[0]+" "+ arrOfInput[1] +" "+ arrOfInput[2];
                int result = Operations.ResultOfTheOperation(expressionOfRoman);
                System.out.println(num1 + " " + operator + " " + num2 + " = " + ArabicNumbers.FromArabicToRoman(result));

            } else if ("1,2,3,4,5,6,7,8,9,10,0".contains(String.valueOf(num1))
                    && "1,2,3,4,5,6,7,8,9,10,0".contains(String.valueOf(num2))) {
                System.out.print(num1 + " " + operator + " " + num2 + " = " + Operations.ResultOfTheOperation(expression));

            } else System.out.println("Incorrect input");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
