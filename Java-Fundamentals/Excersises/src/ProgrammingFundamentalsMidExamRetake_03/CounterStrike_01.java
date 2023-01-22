package ProgrammingFundamentalsMidExamRetake_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CounterStrike_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int startPoints = Integer.parseInt(scanner.nextLine());
            int count = 0;
            String command = scanner.nextLine();

            while (!command.equals("End of battle")) {
                int input = Integer.parseInt(command);
                if (startPoints-input >= 0) {
                    count++;
                    startPoints -= input;
                    if (count % 3 == 0) {
                        startPoints += count;
                    }
                } else if (startPoints-input<=0) {
                    System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", count, startPoints);
                    return;
                }
                command = scanner.nextLine();

            }
            System.out.printf("Won battles: %d. Energy left: %d",count,startPoints) ;
        }
    }


