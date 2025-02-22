package org.example;

public class NinthClass {
    public static boolean LeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(LeapYear(2028));
    }
}
