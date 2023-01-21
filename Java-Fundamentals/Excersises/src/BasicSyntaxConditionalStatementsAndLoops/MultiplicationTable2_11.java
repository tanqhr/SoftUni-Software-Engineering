package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

    public class MultiplicationTable2_11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
            int times = Integer.parseInt(scanner.nextLine());
            int sum = 0;

            for (int i = times; i <= 10; i++) {
                sum = number * i;
                System.out.printf("%d X %d = %d%n", number, i, sum);

            }if (times > 10) {
                sum=number*times;
                System.out.printf("%d X %d = %d%n", number, times, sum);
            }
        }
    }

