import java.util.Scanner;

public class SquareRoot_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
try{
        double squareRoot = sqrt(input);
        System.out.printf("%.2f%n", squareRoot);

    }catch (IllegalArgumentException ignored){
    System.out.println("Invalid");
    }finally {
    System.out.println("Goodbye");
    }
    }


    private static double sqrt(String input) {
        int number=Integer.parseInt(input);
              if(number<0){
                  throw new IllegalArgumentException("Invalid number");

        }return Math.sqrt(number);

        }

    }




