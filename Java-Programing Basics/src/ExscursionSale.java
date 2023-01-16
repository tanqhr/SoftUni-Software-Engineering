import java.util.Scanner;

public class ExscursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSea=Integer.parseInt(scanner.nextLine());
        int countMountain=Integer.parseInt(scanner.nextLine());
        int price=0;
        String command= scanner.nextLine();
        while(!command.equals("Stop")){
            String packet=command;
            if(packet.equals("sea")&&(countSea>0)){
                price+=680;
                countSea-=1;
            }else if (packet.equals("mountain")&&(countMountain>0)){
                price+=499;
                countMountain-=1;
            }else{
                price+=0;
            }if (countMountain==0&&countSea==0) {
                System.out.println(" Good job! Everything is sold.");
                break;
            }
            command= scanner.nextLine();

        }
        System.out.printf("Profit: %d leva.", price);

    }
}
