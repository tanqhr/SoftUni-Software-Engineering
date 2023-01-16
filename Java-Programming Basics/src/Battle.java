import java.util.Scanner;

public class Battle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggs1=Integer.parseInt(scanner.nextLine());
        int eggs2=Integer.parseInt(scanner.nextLine());
        String command= scanner.nextLine();
        while(!command.equals("End")){
            String winner=command;
            if (winner.equals("one")){
                eggs2-=1;
            }else if (winner.equals("two")){
                eggs1-=1;
            }if (eggs1<=0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggs2);
                return;

            }else if(eggs2<=0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggs1);
                return;
            }



            command= scanner.nextLine();;
        }
        System.out.printf("Player one has %d eggs left.%n", eggs1);
        System.out.printf("Player two has %d eggs left.", eggs2);

    }
}
