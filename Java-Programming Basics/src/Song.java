import java.util.Scanner;

public class Song {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isValid=false;
        int first=0;
        int second=0;
        int third=0;
        int four=0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {


                        if (a < b && c > d) {
                            if (controlNumber == (a * b) + (c * d)) {

                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                count++;

                                if(count==4){
                                    isValid=true;
                                    first=a;
                                    second=b;
                                    third=c;
                                    four=d;
                                }


                            }

                        }
                    }

                }
            }


        }System.out.println("");
        if (isValid){

            System.out.printf("Password: %d%d%d%d", first, second, third, four);
        }
        if (count<4) {
            System.out.print("No!");
        }
    }
}