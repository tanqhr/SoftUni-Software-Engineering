import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int location=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=location ; i++) {
            double gold=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            double goldForDays=0;
            double avarageGold=0;
            for (int j = 1; j <=days ; j++) {
                double dayGold=Integer.parseInt(scanner.nextLine());
                goldForDays+=dayGold;

            }avarageGold=goldForDays/days;
            double diff=Math.abs(gold-avarageGold);
            if (avarageGold>=gold){
                System.out.printf("Good job! Average gold per day: %.2f.%n",avarageGold);
            }else if (avarageGold<gold){
                System.out.printf("You need %.2f gold.%n", diff);
            }

        }
    }
}
