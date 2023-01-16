package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


    public class ListManipulatorAdvanced_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).
                    map(Integer::parseInt).collect(Collectors.toList());
            String input = scanner.nextLine();
            while (!input.equals("end")) {
                List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
                String command = commandLine.get(0);
                switch (command) {
                    case "Contains":
                        int numToAdd = Integer.parseInt(commandLine.get(1));
                        if (numList.contains(numToAdd)) {
                            System.out.println("Yes");
                        } else {
                            System.out.println("No such number");
                        }
                        break;

                    case "Print":
                        String numToPrint = commandLine.get(1);
                        if (numToPrint.equals("even")) {
                            for (int i = 0; i < numList.size(); i++) {
                                int num = numList.get(i);
                                if (num % 2 == 0) {
                                    System.out.print(num + " ");
                                }

                            }
                            System.out.println();

                        }
                            if (numToPrint.equals("odd")) {
                                for (int i = 0; i < numList.size(); i++) {
                                    int num = numList.get(i);
                                    if (num % 2 != 0) {
                                        System.out.print(num + " ");
                                    }

                                }

                            System.out.println();
                        }
                        break;
                              
                    case "Get":
                        int sum = 0;
                        for (int i = 0; i < numList.size(); i++) {
                            int num = numList.get(i);
                            sum += num;
                        }
                        System.out.println(sum);
                        break;

                    case "Filter":
                        String function = commandLine.get(1);
                        int numb = Integer.parseInt(commandLine.get(2));
                        if (function.equals(">=")) {
                            for (int i = 0; i < numList.size(); i++) {
                                int num = numList.get(i);
                                if (num >= numb) {
                                    System.out.print(num + " ");
                                }


                            }
                            System.out.println();

                        }
                        if (function.equals(">")) {
                            String function1 = commandLine.get(1);
                            int numb1 = Integer.parseInt(commandLine.get(2));

                            for (int i = 0; i < numList.size(); i++) {
                                int num = numList.get(i);
                                if (num > numb1) {
                                    System.out.print(num + " ");
                                }


                            }
                            System.out.println();
                        }
                        if (function.equals("<=")) {


                            for (int i = 0; i < numList.size(); i++) {
                                int num = numList.get(i);
                                if (num <= numb) {

                                    System.out.print(num + " ");
                                }


                            }
                            System.out.println();

                        }
                        if (function.equals("<")) {
                            for (int i = 0; i < numList.size(); i++) {


                                int num = numList.get(i);

                                if (num < numb) {
                                     

                                    System.out.print(num + " ");


                                }
                            }
                            System.out.println();
                        }
                        break;

                }
                        input = scanner.nextLine();

                }

            }
        }

