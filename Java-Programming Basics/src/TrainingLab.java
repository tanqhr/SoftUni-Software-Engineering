import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h=Double.parseDouble(scanner.nextLine());
        double w=Double.parseDouble(scanner.nextLine());

        double hCm=h*100;
        double wCm=w*100;

        double weight=wCm-100;

        double desks=Math.floor(weight/70);
        double seets=Math.floor(hCm/120);

        double total=(desks*seets)-3;
        System.out.printf("%.0f", total);




    }
}
