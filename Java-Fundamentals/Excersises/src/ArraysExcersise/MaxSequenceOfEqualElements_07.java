package ArraysExcersise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();
            int length = 1;
            int maxLength = 0;
            int startIndex = 0;
            int bestStartIndex = 0;
            for (int i = 1; i <= array.length - 1; i++) {
                if (array[i] == array[i - 1]) {
                    length++;
                } else {
                    length = 1;
                    startIndex = i;
                }
                if (length > maxLength) {
                    maxLength = length;
                    bestStartIndex = startIndex;
                }

            }
            for (int i = bestStartIndex; i < bestStartIndex + maxLength; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

