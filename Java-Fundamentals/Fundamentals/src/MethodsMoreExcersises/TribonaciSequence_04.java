package MethodsMoreExcersises;

import java.util.Scanner;

public class TribonaciSequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] printNum = isTribonaciNumber(num);
        for (int numbers : printNum) {
            System.out.print(numbers + " ");
        }

    }


    public static int[] isTribonaciNumber(int number) {
        int[] result = new int[number];

          switch (number) {
            case 1:
               result[0] = 1;
              break;
           case 2:
              result[0] = 1;
              result[1] = 1;
               break;
            case 3:
                 result[0] = 1;
                 result[1] = 1;
                 result[2] = 2;
        break;
        default:

        result[0] = 1;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i < number; i++) {
            int currNum = result[i - 3] + result[i - 2] + result[i - 1];
            result[i] = currNum;
        }
        break;
    }


        return result;



}

        }
