import java.util.Scanner;

public class IT24300246Lab10Q1 {

    // Method to determine the grade based on the mark
    public static String determineGrade(double mark) {
        String grade = "";
        if (mark >= 75) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 50) {
            grade = "C";
        } else if (mark >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }


        assert (mark >= 75 && grade.equals("A")) ||
               (mark >= 60 && mark < 75 && grade.equals("B")) ||
               (mark >= 50 && mark < 60 && grade.equals("C")) ||
               (mark >= 40 && mark < 50 && grade.equals("D")) ||
               (mark < 40 && grade.equals("F")) : "Incorrect Grade Assigned" ;

        return grade;
    }

    public static void main(String[] args) {
       

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the mark (0 - 100): ");
        double mark = scanner.nextDouble();

        // Assertion to check if the mark is between 0 and 100 
        assert mark >= 0 && mark <= 100 : "Invalid Mark";

        // Determine the grade based on the valid mark
        String grade = determineGrade(mark);

        // If the mark is valid and grade is determined correctly, print the grade
        System.out.println("\nMark is Validated");
        System.out.print("The Grade for the Entered Mark is: " + grade);

    }
}

