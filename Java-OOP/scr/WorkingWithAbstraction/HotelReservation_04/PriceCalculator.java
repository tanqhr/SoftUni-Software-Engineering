package HotelReservation_04;

public class PriceCalculator {
    public static double calculateHolidayPrice(double pricePerDay,int days,Season season, DiscountType discountType){
        double priceForAllDays=pricePerDay*days;
        priceForAllDays=priceForAllDays*season.getMultiplyCoefficient();

        priceForAllDays=priceForAllDays-(priceForAllDays*(discountType.getPersent()/100));

        return priceForAllDays;

    }
}
