package ProgrammingFundamentalsMidExam_04;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class HeartDelivery_03 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Integer> list = Arrays.stream(scanner.nextLine().split("\\@")).map(Integer::parseInt).collect(Collectors.toList());
            String input = scanner.nextLine();
            int startIndex = 0;
            int count = 0;

            int num = 0;
            while (!input.equals("Love!")) {
                String[] tokens = input.split(" ");
                String command = tokens[0];
                int index = Integer.parseInt(tokens[1]);

                startIndex += index;
                if (startIndex > list.size() - 1) {
                    startIndex = 0;
                }
                int numOnIndex = list.get(startIndex);
                num = list.get(startIndex) - 2;
                list.set(startIndex, num);
                if (num == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", startIndex);
                    count++;
                }
                if (num < 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", startIndex);
                }

                input = scanner.nextLine();
            }
            int places = list.size();

            System.out.printf("Cupid's last position was %d.%n", startIndex);
            if (count != places) {
                System.out.printf("Cupid has failed %d places.", places - count);
            } else {
                System.out.println("Mission was successful.");
            }
        }
    }


