import java.util.Scanner;

public class DishWashes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preparation=Integer.parseInt(scanner.nextLine());
        int countPreparation=preparation*750;
        int count=0;
        int allDishes=0;
        int allPot=0;
        String command= scanner.nextLine();
        while(!command.equals("End")){
            int dishes=Integer.parseInt(command);
count++;
if (count%3!=0){
    countPreparation-=(dishes*5);
    allDishes+=dishes;
}else if (count%3==0){
    countPreparation-=(dishes*15);
    allPot+=dishes;
}if (countPreparation<0) {

                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(countPreparation));
                return;
            }
            command= scanner.nextLine();
        }int dish=allDishes-allPot;
        System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n",allDishes, allPot);
            System.out.printf( "Leftover detergent %d ml.", countPreparation);
    }
}
