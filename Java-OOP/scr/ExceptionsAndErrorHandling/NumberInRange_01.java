import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]numbers = scanner.nextLine().split(" ");

        int startOfRange=Integer.parseInt(numbers[0]);
        int endOfRange=Integer.parseInt(numbers[1]);
        System.out.printf("Range: [%d...%d]%n",startOfRange,endOfRange);

        int validNumber = readValidNumber(scanner,startOfRange,endOfRange);
        System.out.println("Valid number: "+ validNumber);

    }

    private static int readValidNumber(Scanner scanner, int startOfRange, int endOfRange) {
        while(true){
            String input= scanner.nextLine();
            try {
                int numberOfInput = Integer.parseInt(input);
                if (numberOfInput >= startOfRange && numberOfInput <= endOfRange) {
                    return numberOfInput;
                }
            }catch (NumberFormatException e){

            }
            System.out.println("Invalid number: "+input);
        }
    }


}
