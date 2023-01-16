package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxLength = Math.max(firstArray.length, secondArray.length);
        int sum = 0;
        boolean areNotIdentical = false;
        for (int i = 0; i < maxLength; i++) {
            sum += firstArray[i];
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areNotIdentical = true;
                break;
            }
        }
            if (!areNotIdentical) {
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }

        }
    }

