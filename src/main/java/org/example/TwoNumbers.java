package org.example;
import java.util.ArrayList;
import java.util.List;

public class TwoNumbers {
    public static void main(String[] args) {
        List<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        for (int i = 3; i < 6; i++) {
            arr.add(i);
        }

        int a = 3;
        int b = 4;

        boolean result = isSequential(arr, a, b);
        System.out.println(result);
    }

    public static boolean isSequential(List<Object> arr, int a, int b) {
        int indexA = arr.indexOf(a);
        int indexB = arr.indexOf(b);

        return Math.abs(indexA - indexB) == 1;
    }
}
