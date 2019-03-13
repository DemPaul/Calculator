package com.company;
import java.util.Scanner;

public class Operations {
    public static int ResultOfTheOperation(String str) {
        Scanner read = new Scanner(str);
        int first = read.nextInt();
        String operator = read.next();
        int second = read.nextInt();
        int result = 0;
        if (operator.equals("*")) {
            result += (first * second);
        } else if (operator.equals("/")) {
                result += (first / second);
        } else if (operator.equals("+")) {
            result += (first + second);
        } else if (operator.equals("-")) {
            result += (first - second);
        } else {
            System.out.println("Incorrect operator");
        } return result;
    }
}



