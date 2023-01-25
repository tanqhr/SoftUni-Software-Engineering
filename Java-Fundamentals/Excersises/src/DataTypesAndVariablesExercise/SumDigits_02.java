package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int num = Integer.parseInt(scanner.nextLine());
            int sum=0;
            while (num>0){
                int digit=num%10;
                num=num/10;
                sum+=digit;
            }
            System.out.println(sum);

        }
    }

