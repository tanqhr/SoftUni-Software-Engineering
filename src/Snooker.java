import java.util.Scanner;

public class Snooker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stage = scanner.nextLine();
        String typeTicket = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
        String picture = scanner.nextLine();

        double price = 0;
        double totalPrice = 0;
        double totalDiscount = 0;

        if (stage.equals("Quarter final") && typeTicket.equals("Standard")) {
            price = 55.5;


        } else if (stage.equals("Quarter final") && typeTicket.equals("Premium")) {
            price = 105.2;

        } else if (stage.equals("Quarter final") && typeTicket.equals("VIP")) {
            price = 118.9;
        }
        if (stage.equals("Semi final") && typeTicket.equals("Standard")) {
            price = 75.88;

        } else if (stage.equals("Semi final") && typeTicket.equals("Premium")) {
            price = 125.22;

        } else if (stage.equals("Semi final") && typeTicket.equals("VIP")) {
            price = 300.40;
        }
        if (stage.equals("Final") && typeTicket.equals("Standard")) {
            price = 110.10;

        } else if (stage.equals("Final") && typeTicket.equals("Premium")) {
            price = 160.66;
        } else if (stage.equals("Final") && typeTicket.equals("VIP")) {
            price = 400;
        }

        totalPrice = countTickets * price;


        if (totalPrice > 4000) {

            totalDiscount = totalPrice * 0.75;


        } else if (totalPrice <= 4000 && totalPrice > 2500) {

            totalDiscount = totalPrice * 0.9;
        } else {
            totalDiscount = totalPrice;
        }
        if ((totalPrice <= 4000) && (picture.equals("Y"))) {
            totalDiscount = totalDiscount + (countTickets * 40);
        }

            System.out.printf("%.2f", totalDiscount);
        }
    }


