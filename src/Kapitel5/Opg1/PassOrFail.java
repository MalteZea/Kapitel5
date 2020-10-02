package Kapitel5.Opg1;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {

        //Promt the use for an input
        System.out.print("Enter your score: ");

        //Enter a score
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        //If equeal or greater then 60, sout pass
        if (score >= 60) {
            System.out.println("You pass the exam.");
        } else if (score < -1) {
            System.out.println("Invalid score.");
        } else if (score == -1) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("You dont pass the exam.");

            //Else if score lower then -1 sout invalid score
            //Else if socre equals -1, exit program
            //Else sout fail

            //

            //If input equals -1, Exit program


        }
    }
}