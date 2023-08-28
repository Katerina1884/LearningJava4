package org.example;

import java.util.Scanner;

public class FindDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        System.out.println(numberOfDivisors(n));
    }

    public static long numberOfDivisors(int n) {
        long count = 0;
        for(int i = 1; i<= n; i++){
            if((n%i)==0){
                count++;
            }
        }
        return count;
    }
}
