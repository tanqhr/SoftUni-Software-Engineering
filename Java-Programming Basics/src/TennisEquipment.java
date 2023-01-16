import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price=Double.parseDouble(scanner.nextLine());
        int count=Integer.parseInt(scanner.nextLine());
        int countPairs=Integer.parseInt(scanner.nextLine());

        double pricePairs=price/6;
        double all=(price*count)+(countPairs*pricePairs);
        double other=all*0.2;
        double totalPrice=all+other;
        double priceI=Math.floor(totalPrice/8);
        double priceOthers=Math.ceil(totalPrice*7/8);

        System.out.printf("Price to be paid by Djokovic %.0f%n",priceI);
        System.out.printf("Price to be paid by sponsors %.0f", priceOthers);



    }
}
