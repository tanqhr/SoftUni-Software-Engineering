import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Bouquets {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

String firstFlower= scanner.nextLine();
String secondFlower= scanner.nextLine();

        ArrayDeque<Integer>tulips=new ArrayDeque<>();
        ArrayDeque<Integer>daffodils=new ArrayDeque<>();

Arrays.stream(firstFlower.split(",\\s+"))
                .mapToInt(Integer::parseInt)
                        .forEach(tulips::push);

        Arrays.stream(secondFlower.split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(daffodils::offer);




        int bouquets=0;
        int leftFlower=0;

        while(!tulips.isEmpty()&& !daffodils.isEmpty()){
            int tulip=tulips.peek();
            int daffodil= daffodils.peek();
            int sum=tulip+daffodil;

            if(sum==15){
                bouquets++;
                tulips.pop();
                daffodils.poll();
            }else if (sum>15){
                tulips.pop();
               tulips.push(tulip-2);
            }else if(sum<15){
                leftFlower+=sum;
                tulips.pop();
                daffodils.poll();
            }
        }
        int bouquetsLeftFlower=leftFlower/15;
        bouquets+=bouquetsLeftFlower;

        if(bouquets>=5){
            System.out.printf("You made it! You go to the competition with %d bouquets!",bouquets);
        }else{
            System.out.printf("You failed... You need more %d bouquets.",5-bouquets);
        }



    }

}
