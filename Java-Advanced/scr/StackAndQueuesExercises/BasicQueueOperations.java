package StackAndQueuesExercises;




import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String []input=scanner.nextLine().split(" ");
            int count=Integer.parseInt(input[0]);
            int countToPop=Integer.parseInt(input[1]);
            int numberToCheck=Integer.parseInt(input[2]);
            String []numbers=scanner.nextLine().split(" ");
            ArrayDeque<Integer>queue=new ArrayDeque<>();
            for (int i = 0; i < count; i++) {
                queue.offer(Integer.parseInt(numbers[i]));
            }
            for (int i = 0; i <countToPop ; i++) {
                queue.poll();

            }if(queue.contains(numberToCheck)){
                System.out.println("true");
            }else if(queue.isEmpty()){
                System.out.println("0");
            }
            else{
                System.out.println(queue.stream().mapToInt(e->e).min().getAsInt());

            }
        }
    }


