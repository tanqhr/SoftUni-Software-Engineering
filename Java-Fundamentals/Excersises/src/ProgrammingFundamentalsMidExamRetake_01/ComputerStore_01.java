package ProgrammingFundamentalsMidExamRetake_01;

import java.util.Scanner;

public class ComputerStore_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            double count = 0;
            double totalPrice=0;
            double taxes=0;
            while (!command.equals("special") && !command.equals("regular")) {
                double price = Double.parseDouble(command);
                if (price <= 0) {
                    System.out.println("Invalid price!");
                } else {
                    count += price;
                }


                command = scanner.nextLine();
            }
            if (count == 0) {
                System.out.println("Invalid order!");
                return;
            }else{
                totalPrice=count*1.2;
                taxes=count*0.2;

            }if (command.equals("special")){
                totalPrice=totalPrice*0.9;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",count);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalPrice);



        }
    }

