package org.example;

public class SampleAnalysis {
    public static void main(String[] args) {
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        for(int i = 0; i<=9; i++) {
            if(i >= 1 && i<=3) {
                group1++;
            }
            else if(i>=4 && i<=6) {
                group2++;
            }
            else if(i>=7 && i<=9) {
                group3++;
            }
        }
        System.out.println("Количество чисел в диапазоне 1-3: " + group1);
        System.out.println("Количество чисел в диапазоне 4-6: " + group2);
        System.out.println("Количество чисел в диапазоне 7-9: " + group3);
    }
}
