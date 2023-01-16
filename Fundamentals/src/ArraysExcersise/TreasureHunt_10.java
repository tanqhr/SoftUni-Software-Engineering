package ArraysExcersise;

import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String items = scanner.nextLine();
        String[] input = items.split("\\|");
        String[]new1=input;

        String input2 = scanner.nextLine();



        while (!input2.equals("Yohoho!")) {
            String[] command = input2.split(" ");
            String action = command[0];


            switch (action) {

                case "Loot":
                    boolean isTrue = false;
                    for (int i = 1; i < command.length; i++) {
                        String element = command[i];

                        for (int j = 0; j < input.length; j++) {

                            String element2 = input[j];

                            if (!element.equals(element2)) {
                                isTrue = true;
                            } else {
                                break;
                            }
                        }
                        if (isTrue) {
                            String[] input3 = new String[new1.length + 1];
                            for (int j = 0; j < input3.length - 1; j++) {
                                new1[j] = input[j];
                                input3[j] = new1[j];
                                input3[input3.length - 1] = element;


                            }
                            new1 = input3;
                            input = input3;
                            isTrue = false;

                        }
                        }


                        break;

                        case "Drop":
                            int index = Integer.parseInt(command[1]);
                            if (index >= 0 && index <= input.length - 1) {
                                for (int i = new1.length-1; i >=0 ; i--) {

                                }

                            }
                            break;


                        case "Steal":
                            index = Integer.parseInt(command[1]);
                            if (index >= 0 && index <= input.length - 1) {
                                break;

                            }

                    }input2= scanner.nextLine();

            }

        System.out.println();
        }
    }
