import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int singer = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;
        int allPeople = 0;
        while (!command.equals("The restaurant is full")) {
            int people = Integer.parseInt(command);
            if (people >= 5) {
                price = 70;
                totalPrice += people * 70;
                allPeople += people;

            } else if (people < 5) {
                price = 100;
                totalPrice += people * 100;
                allPeople += people;
            }

            command = scanner.nextLine();
        } if (totalPrice > singer) {
            double diff = totalPrice - singer;
            System.out.printf("You have %d guests and %.0f leva left.", allPeople, diff);
        } else {
            System.out.printf("You have %d guests and %.0f leva income, but no singer.", allPeople, totalPrice);
        }

    }
}