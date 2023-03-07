package Vehicles_01;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;

    public VehicleImpl(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String drive(double distance) {
        double fuelNeeded = distance * this.getFuelConsumption();
        if(fuelNeeded>this.fuelQuantity){
            return this.getClass().getSimpleName() + " needs refueling";
        }
        this.fuelQuantity-=fuelNeeded;
        DecimalFormat formatter = new DecimalFormat("##.##");
        return String.format("%s travelled %s km",this.getClass().getSimpleName(),formatter.format(distance));

    }

    @Override
    public void refuel(double liters) {
        this.fuelQuantity+=liters;

    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
