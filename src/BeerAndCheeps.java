import java.util.Scanner;

public class BeerAndCheeps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
double budjet=Double.parseDouble(scanner.nextLine());
int beers=Integer.parseInt(scanner.nextLine());
int cheeps=Integer.parseInt(scanner.nextLine());

        double priceBeer=beers*1.2;
        double priceCheeps=Math.ceil((cheeps*(priceBeer*0.45)));
        double totalSum=priceBeer+priceCheeps;
        double diff=Math.abs(budjet-totalSum);
        if(budjet>=totalSum){

            System.out.printf("%s bought a snack and has %.2f leva left.", name, diff);

        }else if(budjet<totalSum){
            System.out.printf("%s needs %.2f more leva!", name, diff);
        }


    }
}
