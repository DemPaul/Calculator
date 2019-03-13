package com.company;
import java.util.HashMap;

public class RomanNumbers {
    public static int FromRomanToArabic(String romanInput) {
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("II", 2);
        numbers.put("III", 3);
        numbers.put("IV", 4);
        numbers.put("V", 5);
        numbers.put("VI", 6);
        numbers.put("VII", 7);
        numbers.put("VIII", 8);
        numbers.put("IX", 9);
        numbers.put("X", 10);
        return numbers.get(romanInput);
    }
}
