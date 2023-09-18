package org.example;

public class ArrayMinMaxSum {
    public static void main(String[] args) {
        int[] array = {9, 7, 4, 3, 2, 5, 1, 3};
        int min = getMin(array);
        int max = getMax(array);
        int sum = summa(array, min, max);
        System.out.println("Минимальный элемент: " + getMin(array));
        System.out.println("Максимальный элемент: " + getMax(array));
        System.out.println("Сумма между минимальным и максимальным: " + sum);
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] < min) {
                min = array[i]; //пусть сразу возвращают индексы
            }
        return min;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int summa(int[] array, int minValue, int maxValue) {
        int sum = 0;
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                startIndex = i;
            }
            if (array[i] == maxValue) {
                endIndex = i;
            }
        }

        if (startIndex < endIndex) {
            for (int i = startIndex + 1; i < endIndex; i++) {
                sum += array[i];
            }
        } else {
            for (int i = endIndex + 1; i < startIndex; i++) {
                sum += array[i];
            }
        }
        return sum;
    }
}
