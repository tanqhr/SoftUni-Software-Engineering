package MethodsExcersise;

import java.util.Scanner;
import java.util.Arrays;
public class SmallestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());
        int thirdNumber=Integer.parseInt(scanner.nextLine());

                smallestNumber(firstNumber, secondNumber, thirdNumber);
            }

            public static void smallestNumber(int firstNum, int secondNum, int thirdNum){
                if(firstNum<=secondNum&&firstNum<=thirdNum){
                    System.out.println(firstNum);
                }else if(secondNum<=firstNum&&secondNum<=thirdNum){
                    System.out.println(secondNum);
                }else{
                    System.out.println(thirdNum);
                }
            }
        }
