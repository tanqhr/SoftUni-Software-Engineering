package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TheatrePromotion_07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String day= scanner.nextLine();
            int age=Integer.parseInt(scanner.nextLine());
            double price=0;
            switch (day){
                case"Weekday":
                    if (age>=0&&age<=18){
                        price=12;
                    }else if (age>18&&age<=64){

                        price=18;
                    }else if (age>64&&age<=122){
                        price=12;
                    }else {
                        System.out.println("Error!");
                        return;
                    }

                    break;

                case "Weekend":
                    if (age>=0&&age<=18){
                        price=15;
                    }else if (age>18&&age<=64){
                        price=20;

                    }else if (age>64&&age<=122){
                        price=15;

                    }else {
                        System.out.println("Error!");
                        return;
                    }

                    break;


                case "Holiday":
                    if (age>=0&&age<=18){
                        price=5;
                    }else if (age>18&&age<=64){

                        price=12;
                    }else if (age>64&&age<=122){
                        price=10;
                    }else {
                        System.out.println("Error!");
                        return;
                    }

                    break;
            }
            System.out.printf("%.0f$",price );
        }
    }


