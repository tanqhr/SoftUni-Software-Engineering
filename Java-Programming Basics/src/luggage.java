import java.util.Scanner;

public class luggage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        double number = 0;
        double diff = 0;
        String command = scanner.nextLine();
        boolean isValid = false;
      while (!command.equals("End")) {

            double volume = Double.parseDouble(command);
number++;
            if (number % 3 == 0) {
                volume = volume * 1.1;
            }
          capacity =capacity- volume;
            if (capacity <= 0) {
                isValid = true;
                number--;
                System.out.println("No more space!");
                break;
            }

            command = scanner.nextLine();
        }
        if (!isValid) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %.0f suitcases loaded.", number);
    }
}
