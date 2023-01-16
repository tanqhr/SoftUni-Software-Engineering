package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CondanseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (array.length > 1) {
            int[] condensed = new int[array.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = array[i] + array[i + 1];
            }
            array = condensed;
        }
        System.out.println(array[0]);
    }
}