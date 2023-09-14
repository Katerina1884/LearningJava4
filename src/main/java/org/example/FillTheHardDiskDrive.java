package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FillTheHardDiskDrive {
    public static void main(String[] args) {
        int[] size = new int[5];
        fillArray(size);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите объём жесткого диска:");
        int space = scanner.nextInt();

        int count = save(size, space);

        System.out.println("save(" + Arrays.toString(size) + "," + space + ") -> " + count);

    }

    public static void fillArray(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10) + 1; // Генерация случайных чисел в диапазоне от 1 до 10
        }
    }

    public static int save(int[] sizes, int hd) {
        int count = 0; // сколько файлов
        int remainingSpace = hd; // сколько места осталось

        for (int size : sizes) {
            if (size <= remainingSpace) {
                count++;
                remainingSpace -= size;
            } else {
                break;
            }
        }

        return count;
    }
}
