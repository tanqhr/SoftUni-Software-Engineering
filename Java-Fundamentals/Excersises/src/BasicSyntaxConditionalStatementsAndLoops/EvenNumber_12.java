package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EvenNumber_12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());

            while (number%2!=0){
                System.out.println("Please write an even number.");
                number=Integer.parseInt(scanner.nextLine());
            }
            if (number % 2 == 0) {
                System.out.printf("The number is: %d%n", Math.abs(number));
            }
        }
    }


