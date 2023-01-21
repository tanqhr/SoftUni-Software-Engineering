package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String text = scanner.nextLine();

            double totalPrice=0;
            while (!text.equals("end of shift")) {
                String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+.?[0-9]*)\\$";

                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(text);
                double price=0;
                while (matcher.find()) {
                    int count=Integer.parseInt(matcher.group("count"));
                    double productPrice=Double.parseDouble(matcher.group("price"));
                    price=count*productPrice;
                    totalPrice+=price;
                    System.out.printf("%s: %s - %.2f%n",matcher.group("name"), matcher.group("product"), price);
                }
                text = scanner.nextLine();
            }
            System.out.printf("Total income: %.2f",totalPrice);
        }
    }


