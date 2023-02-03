package ProgrammingFundamentalsFinalExam_05;

import java.util.*;

public class Pirates_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            Map<String, List<Integer>> map = new LinkedHashMap<>();
            while (!input.equals("Sail")) {

                String town = input.split("\\|\\|")[0];
                int population = Integer.parseInt(input.split("\\|\\|")[1]);
                int golden = Integer.parseInt(input.split("\\|\\|")[2]);
                if (map.containsKey(town)) {
                    int currentPopulation = map.get(town).get(0);
                    int currentGolden = map.get(town).get(1);
                    map.get(town).add(0, currentPopulation + population);
                    map.get(town).add(1, currentGolden + golden);
                    map.get(town).remove(2);
                    map.get(town).remove(2);
                } else {
                    map.put(town, new ArrayList<>());
                    map.get(town).add(population);
                    map.get(town).add(golden);

                }
                input = scanner.nextLine();
            }
            String commands = scanner.nextLine();

            while (!commands.equals("End")) {
                String towns = commands.split("=>")[1];
                if (commands.contains("Plunder")) {
                    int people = Integer.parseInt(commands.split("=>")[2]);
                    int golds = Integer.parseInt(commands.split("=>")[3]);

                    if (map.containsKey(towns)) {
                        int currentPeople = map.get(towns).get(0);
                        int currentGolds = map.get(towns).get(1);
                        map.get(towns).add(0, currentPeople - people);
                        map.get(towns).add(1, currentGolds - golds);
                        map.get(towns).remove(2);
                        map.get(towns).remove(2);


                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", towns, golds, people);

                    }
                    if (map.get(towns).get(0) == 0 || map.get(towns).get(1) == 0) {
                        map.remove(towns);
                        System.out.printf("%s has been wiped off the map!%n", towns);
                    }

                } else if (commands.contains("Prosper")) {
                    int goldss = Integer.parseInt(commands.split("=>")[2]);
                    if (goldss < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        int currentGolds = map.get(towns).get(1);
                        map.get(towns).add(1, currentGolds + goldss);
                        map.get(towns).remove(2);


                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", goldss, towns, currentGolds + goldss);

                    }
                }

                commands = scanner.nextLine();

            }
            if (map.size()!=0) {
                System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", map.size());
                for (Map.Entry<String, List<Integer>> stringListEntry : map.entrySet()) {

                    System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", stringListEntry.getKey(), stringListEntry.getValue().get(0), stringListEntry.getValue().get(1));

                }
            } else {
                System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
            }
        }
    }
