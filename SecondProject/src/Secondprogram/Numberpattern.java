package Secondprogram;

import java.util.Scanner;

public class Numberpattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int a = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ + "\t");
            }
            System.out.println();
        }
    }
}