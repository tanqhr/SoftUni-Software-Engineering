package ListMoreExcersise;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < list.size() / 2; i++) {
            int time = list.get(i);
            sum1 += list.get(i);
            if (time == 0) {
                sum1 -= sum1 * 0.2;
            }

        }
        for (int i = list.size() - 1; i > list.size() / 2; i--) {
            int time2 = list.get(i);
            sum2 += list.get(i);
            if (time2 == 0) {
                sum2 -= sum2 * 0.2;
            }

        }
        if (sum1 <= sum2) {
            System.out.printf("The winner is left with total time: %.1f", sum1);

        }
        if (sum2<=sum1) {
            System.out.printf("The winner is right with total time: %.1f", sum2);
        }
    }

}