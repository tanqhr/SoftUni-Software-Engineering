package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        int[]arr= Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];

            }
        }
        System.out.println(sum);
            }

        }
