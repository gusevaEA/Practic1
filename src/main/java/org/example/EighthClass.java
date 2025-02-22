package org.example;

public class EighthClass {
    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        /// Проверка
        printString("Привет, меня зовут Катя", 3);
        printString("Как дела?", 2);
    }
}
