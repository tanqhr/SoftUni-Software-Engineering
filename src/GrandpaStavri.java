import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        double totalCount=0;
        double totalDegrees=0;
        double sumDegrees=0;
        for (int i = 1; i <=days ; i++) {
            double count=Double.parseDouble(scanner.nextLine());
            double degrees=Double.parseDouble(scanner.nextLine());
            totalCount+=count;
            sumDegrees=count*degrees;
            totalDegrees+=sumDegrees;



        } double middleDegrees=totalDegrees/totalCount;
        System.out.printf("Liter: %.2f%n",totalCount);
        System.out.printf("Degrees: %.2f%n", middleDegrees);

        if (middleDegrees<38){
            System.out.println("Not good, you should baking!");
        }else if (middleDegrees>=38&&middleDegrees<42){
            System.out.println("Super!");
        }else if (middleDegrees>=42){
            System.out.println("Dilution with distilled water!");
        }
    }
}
