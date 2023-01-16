import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGames = Integer.parseInt(scanner.nextLine());

        double allWin=0;
        double allLose=0;
        double totalPoints=0;
        for (int i = 1; i <= countGames; i++) {
            double points = 0;
            double counterWin = 0;
            double counterLose = 0;
            String command = scanner.nextLine();
            while (!command.equals("Finish")) {
                String sport = command;
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    points += 20;
                    counterWin++;
                } else if (result.equals("lose")) {
                    counterLose++;
                }


                command = scanner.nextLine();
            }
            if (counterWin > counterLose) {
                points = points * 1.1;
                allWin++;
                totalPoints+=points;

            } else if (counterLose > counterWin) {
                points=points;
                allLose++;
                totalPoints+=points;

            }
        }if (allWin>allLose){
            totalPoints=totalPoints*1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalPoints);

        }else if (allLose>allWin){
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalPoints);
        }
    }
}
