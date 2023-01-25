package DataTypesAndVariablesExercise;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class BeerKegs_08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
            double bigestSum=0;
            String biggest = "";
            for (int i = 0; i < number; i++) {
                String model = scanner.nextLine();
                double radius = Double.parseDouble(scanner.nextLine());
                int height = Integer.parseInt(scanner.nextLine());
                double sum = (Math.PI * (radius * radius) * height);
                if (sum >= bigestSum) {
                    bigestSum=sum;
                    biggest = model;

                }

            }System.out.println(biggest);
        }
    }

