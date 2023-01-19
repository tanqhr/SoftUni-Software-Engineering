package BasicAlgorithms;



import java.util.Arrays;
import java.util.Scanner;

public class RecursiveFactorial_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n=Integer.parseInt(scanner.nextLine());

            int sum = getSum(n);
            System.out.println(sum);


        }

        public static int getSum(int n) {
            if(n==1){
                return n;

            }
            return n*getSum(n-1);
        }
    }


