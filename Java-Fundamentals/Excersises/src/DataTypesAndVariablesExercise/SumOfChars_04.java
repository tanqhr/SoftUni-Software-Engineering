package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numberOfLines=Integer.parseInt(scanner.nextLine());
            int sum=0;
            for (int i = 1; i <=numberOfLines ; i++) {
                char symbol=scanner.nextLine().charAt(0);
                sum+=symbol;

            }
            System.out.printf("The sum equals: %d", sum);
        }
    }



