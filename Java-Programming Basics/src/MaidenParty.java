import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price=Double.parseDouble(scanner.nextLine());
        int countLoveLetters=Integer.parseInt(scanner.nextLine());
        int countRoses=Integer.parseInt(scanner.nextLine());
        int countKeyrings=Integer.parseInt(scanner.nextLine());
        int countCartoon=Integer.parseInt(scanner.nextLine());
        int countLuckySurprices=Integer.parseInt(scanner.nextLine());
        int allCount=countLoveLetters+countRoses+countKeyrings+countCartoon+countLuckySurprices;

        double priceLoveLetter=0.6;
        double priceRoses=7.2;
        double priceKeyring=3.6;
        double priceCartoon=18.2;
        double priceLuckySurprices=22;

        double totalPriceLoveLetters=countLoveLetters*priceLoveLetter;
        double totalPriceRoses=countRoses*priceRoses;
        double totalPriceKeyrings=countKeyrings*priceKeyring;
        double totalPriceCartoons=countCartoon*priceCartoon;
        double totalPriceLuckySurprices=countLuckySurprices*priceLuckySurprices;
double totalPriceAll=totalPriceLoveLetters+totalPriceRoses+totalPriceKeyrings+totalPriceCartoons+totalPriceLuckySurprices;

        if(allCount>=25){
            totalPriceAll=totalPriceAll*0.65;
        }double sum=totalPriceAll*0.9;
        double diff=Math.abs(sum-price);
            if (sum>=price){
                System.out.printf("Yes! %.2f lv left.", diff);

            }else if (sum<price){
                System.out.printf("Not enough money! %.2f lv needed.", diff);
            }
    }
}
