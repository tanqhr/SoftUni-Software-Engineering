package ArraysExcersise;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();



        for (int i = 0; i <= array.length - 1; i++) {
            int currentNumber = array[i];
            if(i== array.length-1){
                System.out.print(currentNumber);
                break;
            }
            boolean isMax = false;
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (currentNumber > array[j]) {
                    isMax = true;
                } else {
                    isMax = false;
                    break;
                }

            }if(isMax){
                System.out.print(currentNumber+ " ");
            }

        }
    }
}
