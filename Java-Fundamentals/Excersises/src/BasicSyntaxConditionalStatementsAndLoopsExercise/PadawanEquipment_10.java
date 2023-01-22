package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double money=Double.parseDouble(scanner.nextLine());
            int students=Integer.parseInt(scanner.nextLine());
            double priceLightsabers=Double.parseDouble(scanner.nextLine());
            double priceRobes=Double.parseDouble(scanner.nextLine());
            double priceBelts=Double.parseDouble(scanner.nextLine());
            double countLightsabers=Math.ceil(students*1.1);
            double freeBelts=Math.abs(students/6);
            double countBelts=students-freeBelts;


            double neededMoney=(countBelts*priceBelts)+(countLightsabers)*(priceLightsabers)+(students*priceRobes);
            if (money >= neededMoney) {
                System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
            }else{
                double diff=neededMoney-money;
                System.out.printf ("George Lucas will need %.2flv more.",diff);
            }
        }
    }

