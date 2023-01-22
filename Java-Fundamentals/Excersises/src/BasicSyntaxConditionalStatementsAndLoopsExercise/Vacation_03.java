package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count=Integer.parseInt(scanner.nextLine());
            String type= scanner.nextLine();
            String day= scanner.next();
            double price=0;
            double totalPrice=0;
            switch (type) {
                case "Students":
                    if (day.equals("Friday")) {
                        price = 8.45;
                    } else if (day.equals("Saturday")) {

                        price = 9.80;
                    } else if (day.equals("Sunday")) {
                        price = 10.46;
                    }
                    totalPrice = count * price;
                    if (count>=30){
                        totalPrice=totalPrice*0.85;

                    }
                    break;

                case "Business":
                    if (day.equals("Friday")) {
                        price = 10.90;
                    } else if (day.equals("Saturday")) {

                        price = 15.60;
                    } else if (day.equals("Sunday")) {
                        price = 16;
                    }
                    totalPrice = count * price;
                    if (count>=100){
                        totalPrice=(count-10)*price;
                    }
                    break;


                case "Regular":
                    if (day.equals("Friday")) {
                        price = 15;
                    } else if (day.equals("Saturday")) {

                        price = 20;
                    } else if (day.equals("Sunday")) {
                        price = 22.50;

                    }
                    totalPrice = count * price;
                    if (count>=10&&count<=20){
                        totalPrice=totalPrice*0.95;
                    }
                    break;
            }
            System.out.printf("Total price: %.2f", totalPrice);


        }
    }


