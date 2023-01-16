package ArraysExcersise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[]arr=new int[n];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(scanner.nextLine());
            sum+=arr[i];
            System.out.print(arr[i]+" ");
            

        }
        System.out.println();
        System.out.println(sum);
    }
}
