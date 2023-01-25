package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            int capacity = 255;
            int litrs=0;
            for (int i = 0; i < n; i++) {
                int water = Integer.parseInt(scanner.nextLine());
                litrs+=water;
                if (litrs>capacity){
                    litrs-=water;

                    System.out.println("Insufficient capacity!");
                }

            }System.out.println(litrs);
        }
    }


