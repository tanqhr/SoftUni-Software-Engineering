package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int consumes = 0;
            int count = 0;
            int allConsumes = 0;
            int startingYield = Integer.parseInt(scanner.nextLine());
            while (startingYield >= 100) {
                count++;
                consumes = startingYield - 26;
                allConsumes += consumes;
                startingYield -= 10;
            }
            if (allConsumes >= 26) {
                allConsumes -= 26;

            }System.out.println(count);
            System.out.println(allConsumes);
        }
    }
