package com.pasan.dice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean appCompleted = false;

        do {
            try {
                System.out.println("How many dice would you like to roll :");
                int numberOfDice = scanner.nextInt();

                appCompleted = true;

                System.out.println("About to roll " + numberOfDice + "dice");

                Random rand = new Random();

                for (int i = 0; i < numberOfDice; i++ ){
                    int rollNumber = rand.nextInt(6)+1;
                    System.out.println(display(rollNumber));
                }
            }catch (InputMismatchException e){
                System.out.println("That is not a valid number.");
                scanner.next();
            }
        }while (!appCompleted);

    }

    static String display(int value){
        return switch (value){
            case 1 -> " _________\n|         |\n|    0    |\n|         |\n --------";
            case 2 -> " _________\n|0        |\n|         |\n|        0|\n --------";
            case 3 -> " _________\n|0        |\n|    0    |\n|        0|\n --------";
            case 4 -> " _________\n|0       0|\n|         |\n|0       0|\n --------";
            case 5 -> " _________\n|0       0|\n|    0    |\n|0       0|\n --------";
            case 6 -> " _________\n|0   0   0|\n|         |\n|0   0   0|\n --------";
            default -> "Not a valid dice value";
        };
    }
}
