import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x =Double.parseDouble(scanner.nextLine());

        double y = Double.parseDouble(scanner.nextLine());

        double h=Double.parseDouble(scanner.nextLine());

        double i=x*y;
        double window=1.5*1.5;
        double two=2*i-2*window;
        double back=x*x;
        double e=1.2*2;
        double all=(2*back)-e;
        double total=two+all;
        double green=total/3.4;

        double j = 2*(x*y);
        double k=2*(x*h/2);
        double allTwo=j+k;

        double red=allTwo/4.3;
        System.out.printf("%.2f%n", green);
        System.out.printf("%.2f", red);

    }
}
