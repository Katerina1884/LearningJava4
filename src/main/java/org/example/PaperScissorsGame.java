package org.example;

import java.util.Random;
import java.util.Scanner;

public class PaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество партий");
        int numberOfParts = scanner.nextInt();
        int userPoints = 0;
        int computerPoints = 0;
        for(int i = 1; i <= numberOfParts; i++) {
        System.out.println("Выберите один из вариантов: 1. Камень, 2.Ножницы, 3.Бумага");
        int userSelection = scanner.nextInt();

        String[] allSelections = { "Камень", "Ножницы", "Бумага" };
        String finalUserSelection = allSelections[userSelection - 1];
        Random random = new Random();
        int computerSelection = random.nextInt(3);
        String finalComputerSelection = allSelections[computerSelection];

        System.out.println("Вы выбрали " + finalUserSelection);
        System.out.println("Компьютер выбрал " + finalComputerSelection);

            if (finalComputerSelection.equals(finalUserSelection)) {
                System.out.println("Ничья");
            } else if (finalUserSelection.equals("Камень") && finalComputerSelection.equals("Ножницы") || finalUserSelection.equals("Бумага") && finalComputerSelection.equals("Камень") || finalUserSelection.equals("Ножницы") && finalComputerSelection.equals("Бумага")) {
                System.out.println("Вы выиграли!");
                userPoints++;
            } else {
                System.out.println("Вы проиграли!");
                computerPoints++;
            }
        }
        System.out.println("Ваши очки " + userPoints);
        System.out.println("Очки компьютера " + computerPoints);
    }
}
