package org.example;

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
}
