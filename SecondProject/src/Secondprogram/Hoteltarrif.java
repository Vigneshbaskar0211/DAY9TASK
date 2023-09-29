package Secondprogram;

import java.util.Scanner;

public class Hoteltarrif {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();

        System.out.print("Enter the number of days stayed: ");
        int daysStayed = scanner.nextInt();

        double tariff = calculateHotelTariff(month, roomRent, daysStayed);
        
        System.out.printf("Hotel Tariff: %.2f%n", tariff);

        scanner.close();
    }

    public static double calculateHotelTariff(int month, double roomRent, int daysStayed) {
        double tariff;

        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                // Room rent is 20% higher during peak seasons
                tariff = (roomRent * 1.2) * daysStayed;
                break;
            default:
                tariff = roomRent * daysStayed;
                break;
        }

        return tariff;
    }
}
