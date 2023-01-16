package ListMoreExcersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        List<Integer> drums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        List<Integer> newNumbers = new ArrayList<>(drums);
        while (!input.equals("Hit it again, Gabsy!")) {
            int num = Integer.parseInt(input);
            for (int i = 0; i < drums.size(); i++) {
                int nu = newNumbers.get(i);
                int number = nu - num;
                newNumbers.set(i, number);
                if (number <= 0) {
                    int nums = drums.get(i);
                    int sumDrum = nums * 3;
                    if (sum > sumDrum) {
                        sum -= sumDrum;
                        newNumbers.set(i, nums);
                    }


                        }

                    }

                input = scanner.nextLine();
            }
            for (int number : newNumbers) {
                if (number > 0) {
                    System.out.print(number + " ");

                }
            }
            System.out.println();
            System.out.printf("Gabsy has %.2flv.", sum);
        }
    }
