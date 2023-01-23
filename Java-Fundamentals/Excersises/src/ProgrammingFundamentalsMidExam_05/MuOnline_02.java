package ProgrammingFundamentalsMidExam_05;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MuOnline_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
            int healt = 100;
            int bitcoin = 0;
            int room = 0;
            for (int i = 0; i < list.size(); i++) {
                room++;
                String input = list.get(i);
                String[] tokens = input.split(" ");
                String command = tokens[0];
                int number = Integer.parseInt(tokens[1]);
                switch (command) {
                    case "potion":
                        if (healt + number > 100) {
                            number = 100 - healt;
                            healt = 100;
                        } else {
                            healt += number;
                        }
                        System.out.printf("You healed for %d hp.%n", number);
                        System.out.printf("Current health: %d hp.%n", healt);

                        break;
                    case "chest":
                        bitcoin += number;
                        System.out.printf("You found %d bitcoins.%n", number);
                        break;
                    default:
                        healt -= number;
                        if (healt > 0) {
                            System.out.printf("You slayed %s.%n", command);
                        } else {
                            System.out.printf("You died! Killed by %s.%n", command);
                            System.out.printf("Best room: %d", room);
                            return;
                        }
                        break;
                }


            }
            if (room == list.size() && healt > 0) {
                System.out.println("You've made it!");
                System.out.printf("Bitcoins: %d%n", bitcoin);
                System.out.printf("Health: %d", healt);


            }
        }
    }

