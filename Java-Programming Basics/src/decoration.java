import java.util.Scanner;

public class decoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int budget=Integer.parseInt(scanner.nextLine());
        String command= scanner.nextLine();
        while(!command.equals("Stop")){

            int sumChar=0;
            for (int i = 0; i <command.length() ; i++) {
                sumChar=sumChar+command.charAt(i);



            }if (budget>=sumChar){
                System.out.println("Item successfully purchased!");
                budget=budget-sumChar;
            }else {
                System.out.println("Not enough money!");
                return;


            }

            command= scanner.nextLine();

        }
        System.out.printf("Money left: %d",budget);
    }
}
