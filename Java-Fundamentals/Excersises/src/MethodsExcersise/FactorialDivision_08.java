package MethodsExcersise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());
        long firstNumberFactorial=calculateFactorial(number1);
        long secondNumberFactorial=calculateFactorial(number2);
        double result=firstNumberFactorial*1.0/secondNumberFactorial;
        System.out.printf("%.2f",result);

    }
    public static long calculateFactorial(int number){
long fact=1;
        for (int i = 1; i <=number ; i++) {
            fact=fact*i;

        }
        return fact;
    }
}
