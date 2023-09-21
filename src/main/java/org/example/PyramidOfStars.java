package org.example;

import java.util.Locale;
import java.util.Scanner;

public class PyramidOfStars {
    public static void main(String[] args) {
        getPyramid(3);
    }

    public static void getPyramid(int height) {
        if (height > 0) {
            for (int i = 0; i < height; i++) {
                for (int j = 1; j < height - i; j++) { // можно было переменными
                    System.out.print(" ");
                }
                for (int c = 1; c <= i * 2 + 1; c++) {
                    System.out.print("*");
                }
                if (i != height - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static class Stepik2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество секунд, прошедших с полуночи");
            long totalSecs = scanner.nextInt();
            int hours = Math.toIntExact(totalSecs / 3600);
            int minutes = Math.toIntExact((totalSecs % 3600) / 60);
            int seconds = Math.toIntExact(totalSecs % 60);

            System.out.println(String.format(Locale.ENGLISH, "%02d:%02d:%02d", hours, minutes, seconds));
        }
    }
}
