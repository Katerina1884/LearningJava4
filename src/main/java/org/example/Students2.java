package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Students2 {

    static void fillMatrix(int[][] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(4)+2;
            }
        }
    }

    static void printMatrix(int[][] a) {
        for (int[] ints : a) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static double[] averageMarks(int[][] a) {
        double[] avgArray = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            avgArray[i] = (double) sum / a[i].length;
        }
        return avgArray;
    }

    static int countGoodStudents(int[][] a) {
        int count = 0;
        for(int[] b : a) {
            boolean check = true;
            for (int j = 0; j < b.length; j++) {
                if (b[j] < 4) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
            }
        }
        return count;
    }

    static boolean checkSubject(int[][] a, int col) {
        for (int i = 0; i < a.length; i++) {
            if (a[i][col] == 2) {
                return false;
            }
        }
        return true;
    }

    public static int findTopStudent(int[][] a) {
        int maxExcellentCount = 0;
        int topStudent = 0;

        for (int i = 0; i < a.length; i++) {
            int excellentCount = 0;
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] == 5) {
                    excellentCount++;
                }
            }

            if (excellentCount > maxExcellentCount) {
                maxExcellentCount = excellentCount;
                topStudent = i; // номер студента
            }
        }

        return topStudent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.print("m = ");
        int m = scanner.nextInt();

        int[][] a = new int[n][m];
        fillMatrix(a);
        printMatrix(a);

        double[] avgArray = averageMarks(a);
        System.out.println(Arrays.toString(avgArray));

        int countGood = countGoodStudents(a);
        System.out.println("Кол-во хороших студентов = " + countGood);


        int topStudent = findTopStudent(a);
        System.out.println("Студент с наивысшим количеством оценок 'отлично': " + topStudent);

        System.out.println("Введите номер столбца");
        int col = scanner.nextInt();

        if (checkSubject(a, col)) {
            System.out.println("Все сдали");
        }
        else {
            System.out.println("Не все сдали");
        }
    }
}

