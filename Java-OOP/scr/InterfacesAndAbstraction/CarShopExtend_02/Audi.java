package CarShopExtend_02;

public class Audi extends CarImpl implements Rentable{
    private Integer minRentPerDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced,Integer minRentPerDay,Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentPerDay=minRentPerDay;
        this.pricePerDay=pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentPerDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires %nMinimum rental period of %d days. Price per day %f", super.getModel(), countryProduced(), Car.TIRES, this.minRentPerDay,this.pricePerDay);

    }
}
