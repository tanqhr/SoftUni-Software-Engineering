package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= number; i++) {
                int sum = 0;
                int num = i;
                while (num > 0) {

                    sum = sum + (num % 10);
                    num = num / 10;

                } if (sum == 5 || sum == 7 || sum == 11) {
                    System.out.printf("%d -> True%n", i);
                }else {
                    System.out.printf("%d -> False%n", i);
                }

            }

        }
    }


