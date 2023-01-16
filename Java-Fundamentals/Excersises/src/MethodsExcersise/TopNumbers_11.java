package MethodsExcersise;

import java.util.Scanner;

public class TopNumbers_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (isSumOfDigitsDivisible(i) && holdsOddDigit(i)) {
                System.out.println(i);
            }

        }
    }
    public static boolean isSumOfDigitsDivisible(int num){
        int sum=0;
        while (num!=0){
            sum+=num%10;
            num=num/10;

        }if(sum % 8 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean holdsOddDigit (int num){
        while (num!=0) {
            int newNum = num % 10;
            if (newNum % 2 != 0) {
                return true;
            }
            num = num / 10;
        }return false;

        }
}
