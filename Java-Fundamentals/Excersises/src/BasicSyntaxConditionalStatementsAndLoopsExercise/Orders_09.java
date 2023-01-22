package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders_09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count=Integer.parseInt(scanner.nextLine());
            double total=0;
            for (int i = 1; i <=count ; i++) {
                double price=Double.parseDouble(scanner.nextLine());
                int days=Integer.parseInt(scanner.nextLine());
                int capsules=Integer.parseInt(scanner.nextLine());
                double sum=price*days*capsules;
                System.out.printf("The price for the coffee is: $%.2f%n", sum);
                total+=sum;

            }
            System.out.printf("Total: $%.2f", total);
        }
    }


