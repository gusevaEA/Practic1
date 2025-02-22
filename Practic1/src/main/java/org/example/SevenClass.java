package org.example;

public class SevenClass {
    public static void SevenClass(int number) {
        if (number >= 0) {
            System.out.println(number + " Число отрицательное");
        } else {
            System.out.println(number + " Число положительное");
        }
    }

    public static void main(String[] args) {
        /// Проверка
        SevenClass(2);
        SevenClass(-10);
        SevenClass(0);
    }
}
