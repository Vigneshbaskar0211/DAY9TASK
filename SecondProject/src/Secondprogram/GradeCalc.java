package Secondprogram;

import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Value:");
        int marks = scanner.nextInt();
        
        char grade = calculateGrade(marks);
        
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
    
    public static char calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return 'A';
        } else if (marks >= 80 && marks < 90) {
            return 'B';
        } else if (marks >= 70 && marks < 80) {
            return 'C';
        } else if (marks >= 60 && marks < 70) {
            return 'D';
        } else if (marks >= 0 && marks < 60) {
            return 'E';
        } else {
            return 'F';
        }
    }
}