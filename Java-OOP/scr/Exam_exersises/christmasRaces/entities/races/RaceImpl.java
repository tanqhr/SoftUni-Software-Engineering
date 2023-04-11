package christmasRaces.entities.races;

import christmasRaces.common.ExceptionMessages;
import christmasRaces.entities.drivers.Driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RaceImpl implements Race{

    private String name;
    private int labs;
    private Collection<Driver>drivers;




    public RaceImpl(String name, int labs) {
        this.setName(name);
        this.setLabs(labs);
        drivers = new ArrayList<>();

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLaps() {
        return labs;
    }

    @Override
    public Collection<Driver> getDrivers() {
        return drivers;
    }

    @Override
    public void addDriver(Driver driver) {
        if (driver == null) {
            throw new IllegalArgumentException(ExceptionMessages.DRIVER_INVALID);


        } else if (!driver.getCanParticipate()) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.DRIVER_NOT_PARTICIPATE, driver.getName()));

        }else if (drivers.contains(driver)) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.DRIVER_ALREADY_ADDED, driver.getName(), this.name));

        }
            drivers.add(driver);
    }


    private void setName(String name) {
        if(name==null || name.trim().length() < 5){
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_NAME, name, 5));
        }
        this.name = name;
    }

    private void setLabs(int labs) {
        if(labs < 1){
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_NUMBER_OF_LAPS,1));
        }
        this.labs = labs;
    }
}
