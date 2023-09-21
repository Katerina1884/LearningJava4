package org.example;

public class NiceArray {
    public static boolean isNice(Integer[] arr) { // определяет, хороший массив или нет
        for (int i = 0; i < arr.length; i++) {
            if (contains(arr, arr[i] - 1) && contains(arr, arr[i] + 1)) {
                return false;
            }
        }
        return arr.length != 0;
    }

    public static boolean contains(Integer[] arr, int val) { // проверяет, содержится ли переданное значение в массиве
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) { // перебирает массив и сравнивает со значением val
                return false;
            }
        }
        return true;
    }
}
