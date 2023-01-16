import java.util.Scanner;

public class NameOfGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int maxPoints = 0;
        int points = 0;
        String bestPlayer = "";
        while (!command.equals("Stop")) {
            String name = command;
            int count = (name.length());
            int point=0;
            for (int i = 0; i < count; i++) {
                int num= name.charAt(i);
                int number = Integer.parseInt(scanner.nextLine());
                if (number == num) {
                    point += 10;

                } else {
                    point += 2;
                }
            }

            if (point >= maxPoints) {
                maxPoints = point;
                bestPlayer = name;


            }
                command = scanner.nextLine();

        }
            System.out.printf("The winner is %s with %d points!", bestPlayer, maxPoints);

        }
    }
