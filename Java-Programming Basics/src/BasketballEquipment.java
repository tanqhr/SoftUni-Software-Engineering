import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax=Integer.parseInt(scanner.nextLine());
        double shouse=0.6*tax;
        double equipment=0.8*shouse;
        double ball=equipment/4;
        double accsesoaries=ball/5;
double totalSum=tax+shouse+equipment+ball+accsesoaries;
        System.out.printf("%.2f", totalSum);
    }
}
