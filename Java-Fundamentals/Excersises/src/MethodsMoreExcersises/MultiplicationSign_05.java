package MethodsMoreExcersises;

import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        isPositiveNegstiveOrZero(number1, number2, number3);
    }

    public static void isPositiveNegstiveOrZero(int num1, int num2, int num3) {
     if (num1==0||num2==0||num3==0) {
         System.out.println("zero");

     }else if (num1 < 0 || num2 < 0 || num3 < 0) {
            int count = 0;
            if (num1 < 0) {
                count++;
            }
            if (num2 < 0) {
                count++;
            }
            if (num3 < 0) {
                count++;
            }
            if (count != 2) {
                System.out.println("negative");
            }
            if (count == 2) {
                System.out.println("positive");
            }
        }
         else if(num1>0&&num2>0&&num3>0){
            System.out.println("positive");
        }
    }

}
