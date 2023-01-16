import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month= scanner.nextLine();
        int hours=Integer.parseInt(scanner.nextLine());
        int people=Integer.parseInt(scanner.nextLine());
        String timeOfDay= scanner.nextLine();;
        double price=0;
        switch (month){
            case"march":
                if (timeOfDay.equals("day")){
price=10.5;
                }else if (timeOfDay.equals("night")){
price=8.4;
                }

                break;

            case"april":
                if (timeOfDay.equals("day")){
                    price=10.5;
                }else if (timeOfDay.equals("night")){
                    price=8.4;
                }
                break;

            case "may":
                if (timeOfDay.equals("day")){
                    price=10.5;
                }else if (timeOfDay.equals("night")){
                    price=8.4;
                }
                break;
            case "june":
                if (timeOfDay.equals("day")){
price=12.6;
                }else if (timeOfDay.equals("night")){
price=10.2;
                }
                break;

            case "july":
                if (timeOfDay.equals("day")){
                    price=12.6;
                }else if (timeOfDay.equals("night")){
                    price=10.2;
                }
                break;

            case "august":
                if (timeOfDay.equals("day")){
                    price=12.6;
                }else if (timeOfDay.equals("night")){
                    price=10.2;
                }
                break;

        }if (people>=4){
            price=price*0.90;
        }if (hours>=5){
            price=price*0.50;
        }double totalPrice=people*hours*price;
        System.out.printf("Price per person for one hour: %.2f%n", price);
        System.out.printf("Total cost of the visit: %.2f", totalPrice);

    }
}
