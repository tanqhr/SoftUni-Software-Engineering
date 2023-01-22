package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine_07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double coins = Double.parseDouble(scanner.nextLine());
            ;
            double sum = 0;
            String command = String.valueOf(coins);
            while (!command.equals("Start")) {
                double coin = Double.parseDouble(command);

                if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                    sum += coin;
                } else {
                    System.out.printf("Cannot accept %.2f%n ", coin);

                }
                command = scanner.nextLine();

            }
            String product = scanner.nextLine();
            double price = 0;
            while (!product.equals("End")) {
                String type = product;
                switch (type) {
                    case "Nuts":
                        price = 2.0;

                        break;
                    case "Water":
                        price = 0.7;
                        break;

                    case "Crisps":
                        price = 1.5;
                        break;

                    case "Soda":
                        price = 0.8;
                        break;

                    case "Coke":
                        price = 1.0;
                        break;
                    default:
                        System.out.println("Invalid product");
                        break;
                }
                if (type.equals("Nuts") || type.equals("Water") || type.equals("Crisps") || type.equals("Soda") || type.equals("Coke")) {
                    if (sum >= price) {
                        sum -= price;
                        System.out.printf("Purchased %s%n", type);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                }product = scanner.nextLine();
            }
            System.out.printf("Change: %.2f%n", sum);
        }
    }


