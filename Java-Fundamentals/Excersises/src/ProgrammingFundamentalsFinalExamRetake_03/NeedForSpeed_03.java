package ProgrammingFundamentalsFinalExamRetake_03;

import java.util.*;

public class NeedForSpeed_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int count=Integer.parseInt(scanner.nextLine());
            Map<String, List<Integer>> cars=new LinkedHashMap<>();
            for (int i = 0; i < count; i++) {
                String []input=scanner.nextLine().split("\\|");
                String car=input[0];
                int mile=Integer.parseInt(input[1]);
                int fuel=Integer.parseInt(input[2]);
                cars.putIfAbsent(car,new ArrayList<>());
                cars.get(car).add(mile);
                cars.get(car).add(fuel);
            }
            String commands= scanner.nextLine();
            while(!commands.equals("Stop")){
                String command=commands.split(" : ")[0];
                String car=commands.split(" : ")[1];
                int miliage=cars.get(car).get(0);
                int fuel=cars.get(car).get(1);
                switch (command) {
                    case "Drive":

                        String carName = commands.split(" : ")[1];
                        int miles = Integer.parseInt(commands.split(" : ")[2]);
                        int fuels = Integer.parseInt(commands.split(" : ")[3]);
                        if (cars.containsKey(carName)) {
                            if (cars.get(carName).get(1) >= fuels) {
                                cars.get(carName).set(1, fuel-fuels);
                                cars.get(carName).set(0, miliage+miles);
                                System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carName, miles, fuels);
                            } else {
                                System.out.println("Not enough fuel to make that ride");
                            }
                        }
                        if (cars.get(carName).get(0) >= 100000) {
                            System.out.printf("Time to sell the %s!%n", carName);
                            cars.remove(carName);
                        }
                        break;
                    case "Refuel":
                        String carNameRefuel = commands.split(" : ")[1];
                        int fuelsRefuel = Integer.parseInt(commands.split(" : ")[2]);
                        if (cars.containsKey(carNameRefuel)) {
                            if (fuelsRefuel + fuel > 75) {
                                int diffRefuel = 75 - fuel;
                                int refuel = 75;
                                cars.get(carNameRefuel).set(1, refuel);
                                System.out.printf("%s refueled with %d liters%n", carNameRefuel, diffRefuel);
                            } else {
                                cars.get(carNameRefuel).set(1, fuel+fuelsRefuel);
                                System.out.printf("%s refueled with %d liters%n", carNameRefuel, fuelsRefuel);
                            }
                        }

                        break;

                    case "Revert":
                        String carNameRevent = commands.split(" : ")[1];
                        int kilometers = Integer.parseInt(commands.split(" : ")[2]);
                        if (cars.containsKey(carNameRevent)) {
                            int diffKm = miliage - kilometers;
                            if (diffKm < 10000) {
                                diffKm = 10000;
                            } else {
                                cars.get(carNameRevent).set(0, diffKm);

                                System.out.printf("%s mileage decreased by %d kilometers%n", carNameRevent, kilometers);

                                break;
                            }

                        }
                }
                commands= scanner.nextLine();
            }
            for (Map.Entry<String, List<Integer>> entry : cars.entrySet()) {
                System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));


            }


        }
    }


