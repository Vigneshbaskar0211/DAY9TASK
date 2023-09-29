package Secondprogram;

import java.util.Scanner;

public class LargestNumberCalc {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double largest = findLargestNumber(num1, num2, num3);

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }

    public static double findLargestNumber(double num1, double num2, double num3) {
        double largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        return largest;
    }
}
