package StackAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long n= Integer.parseInt(scanner.nextLine());

            ArrayDeque<Long>stack=new ArrayDeque<>();

            stack.push(0l);
            stack.push(1l);

            if(n<2){
                System.out.println(1);
                return;
            }
            for (int i = 0; i < n; i++) {
                long number1=stack.pop();
                long number2=stack.pop();
                stack.push(number1);
                stack.push(number1+number2);

            }
            System.out.println(stack.pop());
        }
    }


