import java.awt.geom.IllegalPathStateException;
import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPaper=Integer.parseInt(scanner.nextLine());
        int countFabric=Integer.parseInt(scanner.nextLine());
        double ltGlue=Double.parseDouble(scanner.nextLine());
        double discount=Double.parseDouble(scanner.nextLine());

        double pricePaper=5.8;
        double priceFabric=7.2;
        double priceGlue=1.2;

        double totalPricePaper=countPaper*pricePaper;
        double totalPriceFabric=countFabric*priceFabric;
        double totalPriceGlue=ltGlue*priceGlue;
        double allSum=totalPricePaper+totalPriceFabric+totalPriceGlue;
        double totalSum=allSum-(allSum*discount/100);

        System.out.printf("%.3f", totalSum);

    }
}
