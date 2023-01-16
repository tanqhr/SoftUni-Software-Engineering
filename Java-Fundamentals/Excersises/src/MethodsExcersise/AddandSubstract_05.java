package MethodsExcersise;

import java.util.Scanner;

public class AddandSubstract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        int thirdNum=Integer.parseInt(scanner.nextLine());

       int sumOneAndTwo=calculateSumOfFirstAndSecont(firstNum, secondNum);
       int substactSumandThirdNumber=calculateSubstact(sumOneAndTwo, thirdNum);
        System.out.println(substactSumandThirdNumber);
        
    }
    public static int calculateSumOfFirstAndSecont(int number1, int number2){
        int sum=number1+number2;
        return sum;


    }public static int calculateSubstact(int sum, int number3){
        int substract=sum-number3;
        return substract;

    }
}
