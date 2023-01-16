package ArraysExcersise;

import java.util.Scanner;
import java.util.Arrays;
public class EqualSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []array=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound=false;
        for (int i = 0; i < array.length; i++) {
            int currentNumber=array[i];
            int leftSum=0;
            int rightSum=0;
            for (int j = 0; j <i ; j++) {
                leftSum+=array[j];

            }
            for (int k = i+1; k <=array.length-1 ; k++) {
                rightSum+=array[k];

            }if(leftSum==rightSum){
                System.out.println(i);
                isFound=true;
                break;
            }

        }if(!isFound){
            System.out.println("no");
        }
    }
}
