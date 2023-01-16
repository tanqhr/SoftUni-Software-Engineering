package MethodsMoreExcersises;

import java.util.Scanner;

public class DatatYpes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type= scanner.nextLine();
        String input=scanner.nextLine();
          isTypeInteger(type, input );
    }
    public static void isTypeInteger(String types, String inputs){
        if(types.equals("int")){
            int data=Integer.parseInt(inputs);
            int num=data*2;
            System.out.println(num);
        }else if(types.equals("real")){
            double data=Double.parseDouble(inputs);
            double num=data*1.5;
            System.out.printf("%.2f", num);
        }else if (types.equals("string")){
            System.out.printf("$%s$",inputs);
        }
    }
}
