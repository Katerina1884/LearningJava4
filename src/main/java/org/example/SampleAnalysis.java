package org.example;

public class SampleAnalysis {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        for(int value : values) {
            if(value >= 1 && value<=3) {
                group1++;
            }
            else if(value>=4 && value<=6) {
                group2++;
            }
            else {
                group3++;
            }
        }
        System.out.println("Количество чисел в диапазоне 1-3: " + group1);
        System.out.println("Количество чисел в диапазоне 4-6: " + group2);
        System.out.println("Количество чисел в диапазоне 7-9: " + group3);
    }
}
