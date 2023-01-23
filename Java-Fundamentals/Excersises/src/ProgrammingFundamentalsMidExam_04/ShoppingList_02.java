package ProgrammingFundamentalsMidExam_04;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ShoppingList_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> list = Arrays.stream(scanner.nextLine().split("\\!")).collect(Collectors.toList());
            String input = scanner.nextLine();


            //Rearrange {item} - if the grocery exists in the list, remove it from its current position and add it at the end of the list.
            while (!input.equals("Go Shopping!")) {
                String[] tokens = input.split("\\s+");
                String command = tokens[0];
                String product = tokens[1];
                switch (command) {

                    case "Urgent":
                        if (!list.contains(product)) {
                            list.add(0, product);
                        }
                        break;

                    case "Unnecessary":
                        if (list.contains(product)) {
                            list.remove(product);
                        }
                        break;

                    case "Correct":
                        String newProduct = tokens[2];
                        if (list.contains(product)) {
                            int indexProduct = list.indexOf(product);
                            list.add(indexProduct, newProduct);
                            list.remove(product);
                        }

                        break;

                    case "Rearrange":
                        if (list.contains(product)) {
                            list.remove(product);
                            list.add(product);

                            break;
                        }
                }


                input = scanner.nextLine();
            }
            System.out.print(String.join(", ", list));

        }

    }



