package MethodsExcersise;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []numbers=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command= scanner.nextLine();
        while(!command.equals("end")){
        String [] tokens=command.split(" ");
        String types=tokens[0];

        switch (types){

            case "exchange":
                int index=Integer.parseInt(tokens[1]);
               if(validateIndex(index, numbers.length)) {
                   int[] toIndex = new int[index + 1];
                   int[] afterIndex = new int[numbers.length - 1 - index];
                   if (validateIndex(index, numbers.length)) {
                       int[] exchangeArray = new int[numbers.length];
                       for (int i = 0; i < exchangeArray.length; i++) {
                           for (int indexTo = 0;  indexTo<=index ; indexTo++) {
                               int number=numbers[indexTo];
                               exchangeArray[indexTo]=number;
                           }
                           for (int indexAfter = index+1; indexAfter <= numbers.length-1; indexAfter++) {
                           int number=numbers[indexAfter];
                           exchangeArray[indexAfter]=number;
                           }
                           
                       }

                   } else {
                       System.out.println("Invalid index!");
                   }
               }

                break;

            case "max":
                if(tokens[1].equals("even")){

                }else if(tokens[1].equals("odd")){

                }

                break;

            case "min":

                break;

            case "last":

                break;

            case "first":

                break;
        }

        command= scanner.nextLine();
}

    }
    public static void printMaxEvenElementIndex(int[]numbers){
        int maxEven=Integer.MIN_VALUE;
        int maxEvenNumberIndex=-1;
        for (int index = 0; index <= numbers.length-1 ; index++) {
            int number=numbers[index];
            if (number%2==0&&number>=maxEven){
                maxEven=number;
                maxEvenNumberIndex=index;
            }
            
        }
        System.out.println(maxEvenNumberIndex);
    }
    public static void printMaxOddElementIndex(int[]numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int maxOddNumberIndex = -1;
        for (int index = 0; index <= numbers.length - 1; index++) {
            int number = numbers[index];
            if (number % 2 == 0 && number >= maxOdd) {
                maxOdd = number;
                maxOddNumberIndex = index;
            }
        }System.out.println(maxOddNumberIndex);
    }
    public static void printMinEvenElementIndex(int[]numbers){
        int minEven=Integer.MAX_VALUE;
        int minEvenNumberIndex=-1;
        for (int index = 0; index <= numbers.length-1 ; index++) {
            int number=numbers[index];
            if (number%2==0&&number>=minEven){
                minEven=number;
                minEvenNumberIndex=index;
            }

        }
        System.out.println(minEvenNumberIndex);
    }
    public static void printMinOddElementIndex(int[]numbers){
        int minOdd=Integer.MAX_VALUE;
        int minOddNumberIndex=-1;
        for (int index = 0; index <= numbers.length-1 ; index++) {
            int number=numbers[index];
            if (number%2==0&&number>=minOdd){
                minOdd=number;
                minOddNumberIndex=index;
            }

        }
        System.out.println(minOddNumberIndex);
    }
    public static boolean validateIndex(int index, int length) {
        if(index>=0 && index <=length-1){
            return true;
        }else{
            return false;
        }
    }
}
