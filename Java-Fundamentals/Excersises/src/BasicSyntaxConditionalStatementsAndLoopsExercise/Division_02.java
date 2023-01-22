package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Division_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number = Integer.parseInt(scanner.nextLine());
            int num = 0;

            if (number % 2 == 0) {
                num = 2;

            }
            if (number % 3 == 0) {
                num = 3;
            }
            if (number % 6 == 0) {
                num = 6;
            }
            if (number % 7 == 0) {
                num = 7;
            }
            if (number % 10 == 0) {
                num = 10;
            }if(num == 0) {
                System.out.println("Not divisible");
            }else{
                System.out.printf("The number is divisible by %d%n", num);
            }


        }
    }


