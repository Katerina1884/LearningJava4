package org.example;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            for(int b = 1; b<=10; b++) {
                System.out.printf("%d*%d=%d ", b, i, b*i);
            }
            System.out.println();
            for (int c = 1; c <= 10; c++) {
                System.out.print("--------");
            }
            System.out.println();
        }
    }
}
