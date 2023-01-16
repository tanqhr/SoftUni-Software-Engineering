import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coins1=Integer.parseInt(scanner.nextLine());
        int coins2=Integer.parseInt(scanner.nextLine());
        int banknotеs5=Integer.parseInt(scanner.nextLine());
        int sum=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <=coins1 ; i++) {
            for (int j = 0; j <=coins2 ; j++) {
                for (int k = 0; k <=banknotеs5 ; k++) {
                    if(i*1+j*2+k*5==sum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k,sum);
                    }

                }

            }

        }

    }
}
