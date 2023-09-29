package Secondprogram;

public class Starpattern {

	public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 2; i <= rows; i++) {
   
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars for this row
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
