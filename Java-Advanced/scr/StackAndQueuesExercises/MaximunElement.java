package StackAndQueuesExercises;




import java.util.*;

public class MaximunElement {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number=Integer.parseInt(scanner.nextLine());
            Deque<Integer>stack=new ArrayDeque<>();
            for (int i = 0; i < number; i++) {
                String[]input=scanner.nextLine().split(" ");
                int command=Integer.parseInt(input[0]);

                switch(command){
                    case 1 :
                        int numberToPush=Integer.parseInt(input[1]);
                        stack.push(numberToPush);


                        break;


                    case 2:
                        stack.pop();

                        break;

                    case 3:

                        System.out.println(Collections.max(stack));

                        break;




                }

            }
        }
    }


