package christmasRaces.core;

import christmasRaces.common.ExceptionMessages;
import christmasRaces.common.OutputMessages;
import christmasRaces.core.interfaces.Controller;
import christmasRaces.entities.cars.BaseCar;
import christmasRaces.entities.cars.Car;
import christmasRaces.entities.cars.MuscleCar;
import christmasRaces.entities.cars.SportsCar;
import christmasRaces.entities.drivers.Driver;
import christmasRaces.entities.drivers.DriverImpl;
import christmasRaces.entities.races.Race;
import christmasRaces.entities.races.RaceImpl;
import christmasRaces.repositories.RaceRepository;
import christmasRaces.repositories.interfaces.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ControllerImpl implements Controller {
    private final static int MINIMUM_DRIVERS_IN_RACE = 3;
    private Repository<Driver> driverRepository;
    private Repository<Car> carRepository;
    private Repository<Race> raceRepository;

    public ControllerImpl(Repository<Driver> driverRepository, Repository<Car> carRepository, Repository<Race> raceRepository) {
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
        this.raceRepository = raceRepository;
    }


    @Override
    public String createDriver(String driverName) {

            if (driverRepository.getByName(driverName)!=null) {
                throw new IllegalArgumentException(String.format(ExceptionMessages.DRIVER_EXISTS, driverName));
            }


        //  if(driverRepository.getByName(driverName)!=null){

        //}
        Driver driver = new DriverImpl(driverName);
        //  if(driverRepository.getAll().contains(driver1)){

        //   }
        driverRepository.add(driver);

        return String.format(OutputMessages.DRIVER_CREATED, driverName);
    }

    @Override
    public String createCar(String type, String model, int horsePower) {
        if(carRepository.getByName(model)!=null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.CAR_EXISTS, model));

        }
        Car car = null;
        if (type.equals("Muscle")) {
            car = new MuscleCar(model, horsePower);


        } else if (type.equals("Sports")) {
            car = new SportsCar(model, horsePower);

        }carRepository.add(car);
        return String.format(OutputMessages.CAR_CREATED, type + "Car", model);
    }


    @Override
    public String addCarToDriver(String driverName, String carModel) {
        Driver driver = driverRepository.getByName(driverName);
        if(driver==null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.DRIVER_NOT_FOUND, driverName));


        }
              Car car = carRepository.getByName(carModel);
        if(car==null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.CAR_NOT_FOUND, carModel));

        }driver.addCar(car);
        return String.format(OutputMessages.CAR_ADDED, driverName, carModel);

            }







    @Override
    public String addDriverToRace(String raceName, String driverName) {
        Race race =raceRepository.getByName(raceName);
        if(race==null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.RACE_NOT_FOUND, raceName));

        }
        Driver driver = driverRepository.getByName(driverName);
        if(driver==null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.DRIVER_NOT_FOUND, driverName));

        }
        race.addDriver(driver);

        return String.format(OutputMessages.DRIVER_ADDED,driverName,raceName);
    }

    @Override
    public String startRace(String raceName) {
        Race race = raceRepository.getByName(raceName);
        if(race==null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.RACE_NOT_FOUND,raceName));
        }
        if(race.getDrivers().size()<3){
            throw new IllegalArgumentException(String.format(ExceptionMessages.RACE_INVALID,raceName,MINIMUM_DRIVERS_IN_RACE));
        }
        Collection <Driver> drivers= race.getDrivers();
        int numberOfLabs=race.getLaps();
       // List<Driver> winners = drivers.stream().sorted((d1,d2) ->Double.compare(d2.getCar().calculateRacePoints(numberOfLabs),d1.getCar().calculateRacePoints(numberOfLabs))).limit(3).collect(Collectors.toList());
       List<Driver>winners = drivers.stream().
              sorted((firstDriver, secondDriver)->
                      (int)(secondDriver.getCar().calculateRacePoints(numberOfLabs) - firstDriver.getCar().calculateRacePoints(numberOfLabs)))
        .limit(3).collect(Collectors.toList());
        raceRepository.remove(race);
        Driver firstDriver = winners.get(0);
        Driver secondDriver = winners.get(1);
        Driver thirdDriver = winners.get(2);

StringBuilder builder =new StringBuilder();
       builder.append(String.format(OutputMessages.DRIVER_FIRST_POSITION,firstDriver.getName(),race.getName()))
                       .append(System.lineSeparator());
              builder .append(String.format(OutputMessages.DRIVER_SECOND_POSITION,secondDriver.getName(),race.getName()))
                               .append(System.lineSeparator());
        builder .append(String.format(OutputMessages.DRIVER_THIRD_POSITION,thirdDriver.getName(),race.getName()));

        return builder.toString();
    }

    @Override
    public String createRace(String name, int laps) {
        Race race = raceRepository.getByName(name);
        if(race!=null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.RACE_EXISTS,name));

        }Race newRace = new RaceImpl(name,laps);
        raceRepository.add(newRace);

        return String.format(OutputMessages.RACE_CREATED,name);

        }


    }

