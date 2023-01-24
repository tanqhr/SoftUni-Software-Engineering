package HotelReservation_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String[]splittedInput=input.split("\\s+");
        double pricePerDay=Double.parseDouble(splittedInput[0]);
        int numberOfDays=Integer.parseInt(splittedInput[1]);
        Season season=Season.valueOf(splittedInput[2].toUpperCase());

        DiscountType discountType=DiscountType.valueOf(splittedInput[3].toUpperCase());
        double holidayPrice=PriceCalculator.calculateHolidayPrice(pricePerDay,numberOfDays,season,discountType);

        System.out.printf("%.2f",holidayPrice);
    }
}
