package edu.nmu.chorniy;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int width, height;
        int[][] matrix;
        Scanner input = new Scanner(System.in);

        // Введення розміру матриці
        System.out.print("Введіть ширину матриці (не більше 20): ");
         width = input.nextInt();
        System.out.print("Введіть висоту матриці (не більше 20): ");
         height = input.nextInt();

        // Перевірка допустимого розміру матриці
        if (width > 20 || height > 20) {
            System.out.println("Розмір матриці перевищує допустимі межі.");
            return;
        }

        matrix = createMatrix(width, height, input);

        System.out.println("Матриця:");
        printMatrix(matrix);

        int minValue = findMinValue(matrix);
        int maxValue = findMaxValue(matrix);
        double average = calculateAverage(matrix);

        System.out.println("Мінімальний елемент: " + minValue);
        System.out.println("Максимальний елемент: " + maxValue);
        System.out.println("Середнє арифметичне: " + average);
    }

    public static int[][] createMatrix(int width, int height, Scanner input) {
        int[][] matrix = new int[height][width];
        Random random = new Random();

        System.out.println("Виберіть спосіб заповнення матриці:");
        System.out.println("1. Ввести елементи з клавіатури");
        System.out.println("2. Заповнити випадковими числами");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введіть елементи матриці:");
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        matrix[i][j] = input.nextInt();
                    }
                }
                break;
            case 2:
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        matrix[i][j] = random.nextInt(100); // Випадкове число від 0 до 99
                    }
                }
                break;
            default:
                System.out.println("Неправильний вибір. Використовується варіант 1.");
                System.out.println("Введіть елементи матриці:");
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        matrix[i][j] = input.nextInt();
                    }
                }
                break;
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    public static int findMinValue(int[][] matrix) {
        int minValue = matrix[0][0];// Початкове значення мінімального елемента

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
        }

        return minValue;
    }

    public static int findMaxValue(int[][] matrix) {
        int maxValue = matrix[0][0]; // Початкове значення максимального елемента

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }

        return maxValue;
    }

    public static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }

        return (double) sum / count;
    }
}
