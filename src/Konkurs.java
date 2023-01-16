import java.util.Scanner;

public class Konkurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        double maxPoints = 0;
        String winner = "";

        for (int i = 1; i <= count; i++) {
            String name = scanner.nextLine();
            String command = scanner.nextLine();
           double allPoints=0;
            while (!command.equals("Stop")) {
                int points = Integer.parseInt(command);
                allPoints += points;
                command = scanner.nextLine();

            }
            System.out.printf("%s has %.0f points.%n", name, allPoints);
            if (allPoints > maxPoints) {
                 maxPoints=allPoints;
                winner = name;
                System.out.printf("%s is the new number 1!%n", winner);

            }

        }
            System.out.printf("%s won competition with %.0f points!%n", winner, maxPoints);

        }
    }
