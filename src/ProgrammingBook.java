import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerOne=Double.parseDouble(scanner.nextLine());
        double priceCover=Double.parseDouble(scanner.nextLine());
        int discount=Integer.parseInt(scanner.nextLine());
        double design=Double.parseDouble(scanner.nextLine());

        int percent=Integer.parseInt(scanner.nextLine());
        double price=(pricePerOne*899)+(priceCover*2);
        double withDiscount=price-(price*discount/100);
        double withDesign=withDiscount+design;
        double totalPrice=withDesign-(withDesign*percent/100);


        System.out.printf("Avtonom should pay %.2f BGN.", totalPrice);

    }
}
