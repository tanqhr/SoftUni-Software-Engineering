package StackAndQueuesExercises;




import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BasicStackOperations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] numbers=scanner.nextLine().split(" ");



            int number=Integer.parseInt(numbers[0]);
            int popNumbers=Integer.parseInt(numbers[1]);
            int numbersss=Integer.parseInt(numbers[2]);
            Deque<Integer>stack=new ArrayDeque<>();
            String [] numberStack=scanner.nextLine().split(" ");

            for (String numbersStack:numberStack) {
                stack.push(Integer.parseInt(numbersStack));

            }
            for (int i = 0; i <popNumbers ; i++) {
                stack.pop();

            }

            if(stack.contains(numbersss)){
                System.out.println("true");
            }else if(stack.isEmpty()){
                System.out.println("0");
            }else {
                int minElement = stack.stream().mapToInt(e -> e).min().getAsInt();
                System.out.println(minElement);
            }

        }

    }


