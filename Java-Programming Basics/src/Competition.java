import java.util.Scanner;

public class Competition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team= scanner.nextLine();
        int points=0;
        int wins=0;
        int d =0;
        int lose=0;
        double winRate=0;
        int game=Integer.parseInt(scanner.nextLine());
        if (game==0){
            System.out.printf("%s hasn't played any games during this season.",team);
return;
        }
        for (int i = 0; i <game ; i++) {
            String result= scanner.nextLine();
            if(result.equals("W")){
                points+=3;
                wins++;
            }else if (result.equals("D")){
                points+=1;
                d++;
            }else if (result.equals("L")){
                lose++;
            }


        }
        winRate=(wins*1.0/game)*100;
        System.out.printf("%s has won %d points during this season.%n", team, points);
        System.out.println("Total stats:");
        System.out.printf("## W: %d%n", wins);
        System.out.printf("## D: %d%n", d);
        System.out.printf("## L: %d%n", lose);
        System.out.printf("Win rate: %.2f%%", winRate);
    }
}
