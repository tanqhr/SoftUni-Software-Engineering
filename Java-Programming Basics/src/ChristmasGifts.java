import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command= scanner.nextLine();
        int kid=0;
        double sumToys=0;
        int adult=0;
        double sumSweater=0;
        while (!command.equals("Christmas")){
            int years=Integer.parseInt(command);
if (years<=16){
    kid++;
    sumToys+=5;
}else if (years>16){
    adult++;
    sumSweater+=15;
}






            command= scanner.nextLine();
        }   System.out.printf("Number of adults: %d%n", adult);
        System.out.printf("Number of kids: %d%n", kid);
        System.out.printf("Money for toys: %.0f%n", sumToys);
        System.out.printf("Money for sweaters: %.0f", sumSweater);
    }
}
