package BasicSyntaxConditionalStatementsLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double totalMoney = balance;
        double allPrice = 0;
        while (!command.equals("Game Time")) {
            String game = command;
            double price = 0;

            if (game.equals("OutFall 4")) {
                price = 39.99;
                if (totalMoney == 0) {
                    System.out.println("Out of money!");
                    return;
                }
                if (totalMoney < price) {
                    System.out.println("Too Expensive");

                }
                if (totalMoney >= price) {
                    totalMoney -= price;
                    allPrice += price;
                    System.out.printf("Bought %s%n", game);

                }
            } else if (game.equals("CS: OG")) {
                price = 15.99;
                if (totalMoney == 0) {
                    System.out.println("Out of money!");
                    return;
                }
                if (totalMoney < price) {
                    System.out.println("Too Expensive");

                }
                if (totalMoney >= price) {
                    totalMoney -= price;
                    allPrice += price;
                    System.out.printf("Bought %s%n", game);
                }
            } else if (game.equals("Zplinter Zell")) {
                price = 19.99;
                if (totalMoney == 0) {
                    System.out.println("Out of money!");
                    return;
                }
                if (totalMoney < price) {
                    System.out.println("Too Expensive");

                }
                if (totalMoney >= price) {
                    totalMoney -= price;
                    allPrice += price;
                    System.out.printf("Bought %s%n", game);

                }
            } else if (game.equals("Honored 2")) {
                price = 59.99;
                if (totalMoney == 0) {
                    System.out.println("Out of money!");
                    return;
                }
                if (totalMoney < price) {
                    System.out.println("Too Expensive");

                }
                if (totalMoney >= price) {
                    totalMoney -= price;
                    allPrice += price;
                    System.out.printf("Bought %s%n", game);
                }
            } else if (game.equals("RoverWatch")) {
                price = 29.99;
                if (totalMoney == 0) {
                    System.out.println("Out of money!");
                    return;
                }
                if (totalMoney < price) {
                    System.out.println("Too Expensive");
                }
                if (totalMoney >= price) {
                    totalMoney -= price;
                    allPrice += price;
                    System.out.printf("Bought %s%n", game);
                }
            } else if (game.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if (totalMoney == 0) {
                    System.out.println("Out of money!");
                    return;
                }
                if (totalMoney < price) {
                    System.out.println("Too Expensive");

                }
                if (totalMoney >= price) {
                    totalMoney -= price;
                    allPrice += price;
                    System.out.printf("Bought %s%n", game);
                }
            } else {
                System.out.println("Not Found");
            }

            command = scanner.nextLine();
        }
        if (balance == allPrice) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", allPrice, totalMoney);
        }
    }
}


