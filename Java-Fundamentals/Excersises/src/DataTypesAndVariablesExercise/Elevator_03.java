package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int people=Integer.parseInt(scanner.nextLine());
            int capacity=Integer.parseInt(scanner.nextLine());

            double times=Math.ceil(people*1.0/capacity);

            System.out.printf("%.0f", times);
        }
    }


