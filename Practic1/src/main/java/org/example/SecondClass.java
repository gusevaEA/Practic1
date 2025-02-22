package org.example;

public class SecondClass {
    public static void main (String[] args) {
        checkSumSign();
    }
    public static void checkSumSign() {
        int a = 2;
        int b = -1;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
