package ProgrammingFundamentalsMidExamRetake_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
            double totalSum = 0;
            double sum = 0;
            int count = 0;
            String input = scanner.nextLine();

            while (!input.equals("Yohoho!")) {
                String[] tokens = input.split(" ");
                String command = tokens[0];

                switch (command) {


                    case "Loot":
                        for (int i = 1; i < tokens.length; i++) {

                            String item = tokens[i];
                            if (!list.contains(item)) {
                                list.add(0, item);
                            }
                        }
                        break;

                    case "Drop":
                        int index = Integer.parseInt(tokens[1]);
                        if (index >= 0 && index <= list.size()- 1) {
                            String treasure = list.get(index);
                            list.remove(index);

                            list.add(treasure);
                        }
                        break;

                    case "Steal":
                        int indexSteal = Integer.parseInt(tokens[1]);
                        if (indexSteal > list.size()) {
                            indexSteal = list.size();
                        }if(indexSteal>=1) {
                        List<String> stolen = new ArrayList<>();
                        for (int i = list.size() - indexSteal; i <= list.size() - 1; i++) {
                            String steal = list.get(i);
                            stolen.add(steal);
                            if (i == list.size() - 1) {
                                System.out.println(steal);
                            } else {
                                System.out.print(steal + ", ");

                            }

                        }
                        list.removeAll(stolen);

                    }
                        break;
                }
                input = scanner.nextLine();
            }



            if (list.isEmpty()) {
                System.out.println("Failed treasure hunt.");
            } else {
                for (int i = 0; i <= list.size()-1; i++) {
                    String numLetter = list.get(i);
                    sum += numLetter.length();
                }totalSum = sum / list.size();
                System.out.printf("Average treasure gain: %.2f pirate credits.", totalSum);
            }

        }
    }

