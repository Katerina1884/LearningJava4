package org.example;

public class PossibilitiesArray {
        public static void main(String[] args) {
            int[] a = {1, 2, 0, 3};
            boolean result = isAllPossibilities(a);
            System.out.println(result);
        }

        public static boolean isAllPossibilities(int[] a) {
            int n = a.length;

            boolean[] visited = new boolean[n];
            for (int j : a) {
                if (j >= 0 && j < n) {
                    visited[j] = true; //если длина 0, то возвращаем false
                }
                else return false;
            }

            for (boolean value : visited) {
                if (!value) {
                    return false;
                }
            }

            return true;
        }
    }
