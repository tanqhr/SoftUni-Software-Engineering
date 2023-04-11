package christmasRaces.entities.drivers;

import christmasRaces.common.ExceptionMessages;
import christmasRaces.entities.cars.Car;

public class DriverImpl implements Driver{
    private String name;
    private Car car;
    private int numberOfWins;
    private boolean canParticipate;

    public DriverImpl(String name) {
        this.setName(name);
        this.canParticipate = false;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Car getCar() {
        return this.car;
    }

    @Override
    public int getNumberOfWins() {
        return this.numberOfWins;
    }

    @Override
    public void addCar(Car car) {
        if(car==null){
            throw new IllegalArgumentException(ExceptionMessages.CAR_INVALID);

        }
        this.car=car;

    }

    @Override
    public void winRace() {
        this.numberOfWins++;

    }

    @Override
    public boolean getCanParticipate() {

        return car != null;
    }

    private void setName(String name) {
        if(name == null || name.trim().length() < 5){
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_NAME,name,5));
        }
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public boolean isCanParticipate() {
        return canParticipate;
    }

    public void setCanParticipate(boolean canParticipate) {
        this.canParticipate = canParticipate;
    }
}
