package org.example;

import java.util.Scanner;

public class Main {
public static int calculateLevels(int balls) {
    int levels = 0;
    int totalBalls = 0;

    while (totalBalls < balls) {
        levels++;
        totalBalls += levels;
    }

    if (totalBalls > balls) {
        levels--;
    }

    return levels;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число шаров");
        int balls = scanner.nextInt();
        System.out.println(calculateLevels(balls));
    }
}
