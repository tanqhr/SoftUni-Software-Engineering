package ProgrammingFundamentalsMidExamRetake_06;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int days=Integer.parseInt(scanner.nextLine());
            int perDay=Integer.parseInt(scanner.nextLine());
            double total=Double.parseDouble(scanner.nextLine());
            double totalSum=0;
            for (int i = 1; i <=days ; i++) {
                totalSum+=perDay;
                if(i%3==0){
                    totalSum+=(perDay*0.5);
                }if (i%5==0){
                    totalSum-=totalSum*0.3;

                }


            }if(totalSum>=total){
                System.out.printf("Ahoy! %.2f plunder gained.", totalSum);
            }else{
                double percent=totalSum/total*100;
                System.out.printf("Collected only %.2f%% of the plunder.",percent);
            }
        }
    }

