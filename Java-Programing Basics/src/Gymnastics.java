import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country= scanner.nextLine();
        String type= scanner.nextLine();
        double difficulty=0;
double implementdtion=0;

        switch (country){
            case "Russia":
                if (type.equals("ribbon")){
                    difficulty=9.100;
                    implementdtion=9.400;
                }else if (type.equals("hoop")){
                    difficulty=9.300;
                    implementdtion=9.800;
                }else if (type.equals("rope")) {
                    difficulty=9.600;
                    implementdtion=9.000;
                }
                break;

            case "Bulgaria":
                if (type.equals("ribbon")){
                    difficulty=9.600;
                    implementdtion=9.400;
                }else if (type.equals("hoop")){
                    difficulty=9.550;
                    implementdtion=9.750;
                }else if (type.equals("rope")) {
                    difficulty=9.500;
                    implementdtion=9.400;
                }
                break;

            case "Italy":
                if (type.equals("ribbon")){
                    difficulty=9.200;
                    implementdtion=9.500;
                }else if (type.equals("hoop")){
                    difficulty=9.450;
                    implementdtion=9.350;
                }else if (type.equals("rope")) {
                    difficulty=9.700;
                    implementdtion=9.150;
                }
                break;
        }double sum=difficulty+implementdtion;
        double diff=20-sum;
        double percent=(diff/20)*100;
        System.out.printf("The team of %s get %.3f on %s.%n", country, sum, type);
        System.out.printf("%.2f%%", percent);

    }
}
