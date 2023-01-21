package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackIn30Minutes_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int hour = Integer.parseInt(scanner.nextLine());
            int minutes = Integer.parseInt(scanner.nextLine());
            int time = minutes + 30;
            if (time >= 60) {
                hour = hour + 1;
                time = time - 60;
            } if (hour >= 24) {
                hour = hour - 24;

            }
            if (time < 10) {
                System.out.printf("%d:0%d", hour, time);
            } else {

                System.out.printf("%d:%d", hour, time);
            }
        }
    }


