package NeedForSpeed_04;

public class Car extends Vehicle{
    private static final double DEFAULT_FUEL_CONSUMPTION = 3;


    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
