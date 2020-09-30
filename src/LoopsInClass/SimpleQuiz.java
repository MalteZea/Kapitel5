package LoopsInClass;

import java.util.Scanner;

public class SimpleQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Velkommen til denne matematikprøve.");
        System.out.println("Du vil nu komme igennem 4 forskellige opgaver");

        //Første opgave. Multiplikation.
        System.out.println("Første opgave:");
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.print("Hvad er " + number1 + " + " + number2 + "? ");
        int guess = input.nextInt();

        while (number1 + number2 != guess) {
            number1 = (int) (Math.random() * 10);
            number2 = (int) (Math.random() * 10);
            System.out.print("Forkert svar, prøv igen. \nHvad er " + number1 + " + " + number2 + "? ");
            guess = input.nextInt();
        }

        System.out.println("Korrekt!");

        //Anden opgave. Addition.
        System.out.println("Anden opgave:");
        int number11 = (int) (Math.random() * 10);
        int number12 = (int) (Math.random() * 10);

        System.out.print("Hvad er " + number11 + " * " + number12 + "? ");
        int guess1 = input.nextInt();

        while (number11 * number12 != guess1) {
            number11 = (int) (Math.random() * 10);
            number12 = (int) (Math.random() * 10);
            System.out.print("Forkert svar, prøv igen. \nHvad er " + number11 + " * " + number12 + "? ");
            guess1 = input.nextInt();
        }

        System.out.println("Korrekt!");

        //Tredje opgave. Subtraction.
        System.out.println("Tredje opgave:");
        int number21 = (int) (Math.random() * 10);
        int number22 = (int) (Math.random() * 10);

        System.out.print("Hvad er " + number11 + " - " + number21 + "? ");
        int guess2 = input.nextInt();

        while (number21 - number22 != guess2) {
            number21 = (int) (Math.random() * 10);
            number22 = (int) (Math.random() * 10);
            System.out.print("Forkert svar, prøv igen. \nHvad er " + number21 + " - " + number22 + "? ");
            guess2 = input.nextInt();
        }

        System.out.println("Korrekt!");

        //Fjerde opgave. Flere operators.
        System.out.println("Fjerde opgave:");
        int number31 = (int) (Math.random() * 100 + 10);
        int number32 = (int) (Math.random() * 100 + 10);
        int number33 = (int) (Math.random() * 100 + 10);

        System.out.print("Hvad er " + number31 + " - " + number32 + " + " + number33 + "? ");
        int guess3 = input.nextInt();

        while (number31 - number32 + number33 != guess3) {
            number31 = (int) (Math.random() * 100 + 10);
            number32 = (int) (Math.random() * 100 + 10);
            number33 = (int) (Math.random() * 100 + 10);
            System.out.print("Forkert svar, prøv igen. \nHvad er " + number31 + " - " + number32 +
                    " + " + number33 + "? ");
            guess3 = input.nextInt();
        }

        System.out.println("Tillykke! Du har bestået matematikprøven!");
    }
}
