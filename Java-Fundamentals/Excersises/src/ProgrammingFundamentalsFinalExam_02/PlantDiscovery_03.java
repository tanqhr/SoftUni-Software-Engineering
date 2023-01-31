package ProgrammingFundamentalsFinalExam_02;

import java.util.*;

public class PlantDiscovery_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int count = Integer.parseInt(scanner.nextLine());
            Map<String, Integer> map = new LinkedHashMap<>();
            Map<String, Double> map2 = new LinkedHashMap<>();

            for (int i = 0; i < count; i++) {
                String[] input = scanner.nextLine().split("<->");
                String plant = input[0];
                int rate = Integer.parseInt(input[1]);
                map.putIfAbsent(plant, 0);
                map2.putIfAbsent(plant, 0.0);

                map.put(plant, rate);
            }

            String commands = scanner.nextLine();
            while (!commands.equals("Exhibition")) {
                String[] iii = commands.split("[: -]+");
                String command = iii[0];
                String plants = iii[1];
                if (!map.containsKey(plants)) {
                    System.out.println("error");

                } else {
                    switch (command) {
                        case "Rate":
                            double rating = Double.parseDouble((iii[2]));
                            if (map2.get(plants) == 0) {
                                map2.put(plants, rating);

                            } else {
                                double currentRate = (map2.get(plants) + rating) / 2;
                                map2.put(plants, currentRate);

                            }
                            break;
                        case "Update":
                            int rates = Integer.parseInt(iii[2]);
                            map.put(plants, rates);

                            break;

                        case "Reset":
                            map2.put(plants, 0.0);
                            break;
                    }

                }commands = scanner.nextLine();
            }
            System.out.println("Plants for the exhibition:");
            double countss = 0.0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {

                System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), map2.get(entry.getKey()));


            }

        }
    }


