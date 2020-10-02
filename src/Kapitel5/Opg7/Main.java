package Kapitel5.Opg7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double rate = 0.06;
        final int tuitionInitial = 10000;
        int studyStart;
        int studyYears;
        double tuitionFinal;
        double calculatingRate = 1 + rate;
        double tuitionSum = 0;

        System.out.print("In how many years will your tuition start? ");
        studyStart = input.nextInt();

        System.out.print("How many years will you pay tuition? ");
        studyYears = input.nextInt();

        tuitionFinal = tuitionInitial * Math.pow(calculatingRate, studyStart);
        System.out.println("Your study will begin in " + studyStart + " years with a beginning tuition cost of $" + (int)tuitionFinal + ".");

        for (int i = studyStart; i < studyYears + studyStart; i++) {
            tuitionFinal = tuitionInitial * Math.pow(calculatingRate, i);
            tuitionSum += tuitionFinal;
        }

        System.out.println("Your total tuition amount after " + studyYears + " of years will be $" + (int)tuitionSum + ".");
}
}