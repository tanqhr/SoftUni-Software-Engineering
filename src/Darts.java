import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String command = scanner.nextLine();
        int startPoints = 301;
        int shots = 0;
        int unShots = 0;
        while (!command.equals("Retire")) {
            String type = command;
            int point = Integer.parseInt(scanner.nextLine());
            if (type.equals("Single")) {
                point = point;
                if (point > startPoints) {
                    unShots++;
                } else {
                    startPoints -= point;
                    shots++;

                }
            } else if (type.equals("Double")) {
                point = point * 2;
                if (point > startPoints) {
                    unShots++;
                } else {
                    startPoints -= point;
                    shots++;
                }
            } else if (type.equals("Triple")) {
                point = point * 3;
                if (point > startPoints) {
                    unShots++;

                } else {
                    startPoints -= point;
                    shots++;
                }
            }
                if (startPoints == 0) {
                    System.out.printf("%s won the leg with %d shots.", name, shots);
                    return;

                }
                command = scanner.nextLine();



        }System.out.printf("%s retired after %d unsuccessful shots.", name, unShots);
    }
}


