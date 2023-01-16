import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season= scanner.nextLine();
        double km=Double.parseDouble(scanner.nextLine());
        double price=0;
        double totalPrice=0;
        switch (season){
            case"Spring":
            case "Autumn":
                if(km<=5000){
price=4*(km*0.75);
                }else if (km>5000&&km<=10000){
price=4*(km*0.95);
                }else if (km>10000&&km<=20000){
price=4*(km*1.45);
                }


                break;

            case "Summer":
                if(km<=5000){
price=4*(km*0.90);
                }else if (km>5000&&km<=10000){
price=4*(km*1.1);
                }else if (km>10000&&km<=20000){
price=4*(km*1.45);
                }

                break;



            case "Winter":
                if(km<=5000){
price=4*(km*1.05);
                }else if (km>5000&&km<=10000){
price=4*(km*1.25);
                }else if (km>10000&&km<=20000){
price=4*(km*1.45);
                }

                break;


        }totalPrice=price*0.90;
        System.out.printf("%.2f", totalPrice);
    }
}
