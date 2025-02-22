package org.example;

public class ThirdClass {
    public static void main(String[] args) {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value<= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
