package Kapitel5.Opg8;

//Write a program that prompts the user to enter the number
//of students and each student’s name and score, and finally displays the name of
//the student with the highest score. Use the next() method in the Scanner class
//to read a name, rather than using the nextLine() method.

import java.util.Scanner;

public class TheHighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the total number of students, followed by the name of each student and their score.");
        System.out.print("Total number of students: ");
        int totalStudents = input.nextInt();
        int highestScore = 0;
        String bestStudent = "";

        for (int i = 0; i < totalStudents; i++) {
            System.out.print("First name, last name and score: ");
            Students students = new Students();

            if (highestScore <= students.score) {
                highestScore = students.score;
                bestStudent = students.name;
            }
        }
        System.out.println("The student with the highest score is " + bestStudent + " with a score of " + highestScore);
    }
}