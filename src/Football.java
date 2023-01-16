import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        int countTeam1 = 0;
        int countTeam2 = 0;
        int countNobody = 0;

        if (first.charAt(0) > first.charAt(first.length() - 1)) {
            countTeam1++;
        } else if (first.charAt(0) < first.charAt(first.length() - 1)) {
            countTeam2++;
        } else if (first.charAt(0) == first.charAt(first.length() - 1)) {
            countNobody++;
        }

            if (second.charAt(0) > second.charAt(second.length() - 1)) {
                countTeam1++;
            } else if (second.charAt(0) < second.charAt(second.length() - 1)) {
                countTeam2++;
            } else if (second.charAt(0) == second.charAt(second.length() - 1)) {
                countNobody++;
            }
            if (third.charAt(0) > third.charAt(third.length() - 1)) {
                countTeam1++;
            } else if (third.charAt(0) < third.charAt(third.length() - 1)) {
                countTeam2++;
            } else if (third.charAt(0) == third.charAt(third.length() - 1)) {
                {
                    countNobody++;
                }
            }
            System.out.printf("Team won %d games.%n", countTeam1);
        System.out.printf("Team lost %d games.%n", countTeam2);
        System.out.printf(" Drawn games: %d", countNobody);
        }
}