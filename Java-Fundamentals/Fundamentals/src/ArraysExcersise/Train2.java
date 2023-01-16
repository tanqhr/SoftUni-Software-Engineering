package ArraysExcersise;

import java.util.Scanner;

public class Train2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons=Integer.parseInt(scanner.nextLine());
        int []wagons=new int[countWagons];
        for (int i = 0; i < countWagons; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            wagons[i] = countPeople;
        }
            int sum=0;

            for(int number:wagons) {
                System.out.print(number + " ");
                sum += number;
            }
                System.out.println();
                System.out.println(sum);
            }

        }



