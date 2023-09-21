package org.example;
import java.util.HashSet;
import java.util.Set;

public class Elements {
        public static void main(String[] args) {
            int[] arr = { 4, 20, 10, 7, 4, 5, 20, 10 };

            Set<Integer> uniqueNumbers = new HashSet<>();
            for (int i : arr) {
                uniqueNumbers.add(i);
            }

            int count = uniqueNumbers.size();
            System.out.println("Количество различных элементов в массиве: " + count);
        }

}

