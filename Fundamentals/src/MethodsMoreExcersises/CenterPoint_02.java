package MethodsMoreExcersises;

import java.util.Scanner;

public class CenterPoint_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1=Integer.parseInt(scanner.nextLine());
        int y1=Integer.parseInt(scanner.nextLine());
      int result1=isPairClosed(x1,y1);
        int x2=Integer.parseInt(scanner.nextLine());
        int y2=Integer.parseInt(scanner.nextLine());
int result2=isPairClosed(x2,y2);
if(result1<=result2){
    System.out.println("("+x1+", "+y1+")");
}else{
    System.out.println("("+x2+", "+y2+")");
}
    }
    public static int isPairClosed(int first, int second){
        int sum=Math.abs(first+second);
        return sum;

        }
    }
    
