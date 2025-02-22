package org.example;

public class ThirteenthClass {

    public static void main(String[] args) {
        int n = 5;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }
        System.out.println("Квадратный двумерный массив с единицами на главной диагонали:");
        printArray(array);
    }
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
