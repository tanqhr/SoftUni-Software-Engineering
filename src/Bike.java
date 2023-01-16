import java.util.Scanner;

public class Bike {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int countJunior=Integer.parseInt(scanner.nextLine());
            int countSenior=Integer.parseInt(scanner.nextLine());
            String typeTrace= scanner.nextLine();
            double taxJuniors=0;
            double taxSeniors=0;
            switch(typeTrace){
                case "trail":
                    taxJuniors+=countJunior*5.5;
                    taxSeniors+=countSenior*7.0;
                    break;
                case "cross-country":
                    if(countJunior+countSenior>=50) {
                        taxJuniors+=countJunior*(8*0.75);
                        taxSeniors+=countSenior*(9.5*0.75);
                    }else {
                        taxJuniors += countJunior * 8.0;
                        taxSeniors += countSenior * 9.5;
                    }
                    break;

                case "downhill":
                    taxJuniors+=countJunior*12.25;
                    taxSeniors+=countSenior*13.75;
                    break;
                case "road":
                    taxJuniors+=countJunior*20.0;
                    taxSeniors+=countSenior*21.5;
                    break;
            }double allTax=taxJuniors+taxSeniors;
            double totalTax=allTax*0.95;
            System.out.printf("%.2f", totalTax);









        }
    }

