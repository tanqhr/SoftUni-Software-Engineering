package christmasRaces.entities.cars;

import christmasRaces.common.ExceptionMessages;

public class SportsCar extends BaseCar {
    private static final double SPORTSCAR_CUBIC_CENTIMETERS = 3000;
    private static final int MIN_HORSE_POWER_SPORT_CAR = 250;
    private static final int MAX_HORSE_POWER_SPORT_CAR = 450;

    public SportsCar(String model, int horsePower) {
        super(model, horsePower, SPORTSCAR_CUBIC_CENTIMETERS);
    }


    @Override
    public void setHorsePower(int horsePower) {
        if(horsePower < 250 || horsePower > 400){
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_HORSE_POWER,horsePower));
        }

    }
}
