package com.company;

public class ArabicNumbers {
    public static String FromArabicToRoman(int arabicNumber) {
        String romanNumber = "";
        while (arabicNumber >= 100) {
            romanNumber += "C";
            arabicNumber -= 100;
        } while (arabicNumber >= 90) {
            romanNumber += "XC";
            arabicNumber -= 90;
        } while (arabicNumber >= 50) {
            romanNumber += "L";
            arabicNumber -= 50;
        } while (arabicNumber >= 40) {
            romanNumber += "XL";
            arabicNumber -= 40;
        } while (arabicNumber >= 10) {
            romanNumber += "X";
            arabicNumber -= 10;
        } while (arabicNumber >= 9) {
            romanNumber += "IX";
            arabicNumber -= 9;
        } while (arabicNumber >= 5) {
            romanNumber += "V";
            arabicNumber -= 5;
        } while (arabicNumber >= 4) {
            romanNumber += "IV";
            arabicNumber -= 4;
        } while (arabicNumber >= 1) {
            romanNumber += "I";
            arabicNumber -= 1;
        } return romanNumber;
    }
}
