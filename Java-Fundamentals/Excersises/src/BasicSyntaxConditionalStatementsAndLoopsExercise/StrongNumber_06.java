package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber_06 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int input = Integer.parseInt(scanner.nextLine());
            int startNumber=input;
            int sumFact = 0;
            while (input != 0) {
                int lastdigit = input % 10;
                int fact = 1;
                for (int i = 1; i <= lastdigit; i++) {
                    fact = fact * i;

                }sumFact += fact;
                input = input / 10;
            }if (startNumber==sumFact){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }

        }
    }

