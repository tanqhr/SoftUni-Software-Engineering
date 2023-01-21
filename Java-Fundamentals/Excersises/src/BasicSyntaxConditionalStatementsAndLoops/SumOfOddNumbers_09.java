package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
            int num = 1;
            int sum=0;
            for (int i = 1; i <= number; i++) {
                num = num;
                sum+=num;
                System.out.printf("%d%n", num);
                num += 2;



            }
            System.out.printf("Sum: %d", sum);
        }
    }
