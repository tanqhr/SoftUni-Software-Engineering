package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String text = scanner.nextLine();

            String regex = ">>(?<furniture>\\w+)\\<<(?<price>\\d+.?\\d*)!(?<quality>\\d+)";
            List<String> listFurniture = new ArrayList<>();
            double totalPrice = 0;

            while(!text.equals("Purchase")) {
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(text);
                while (matcher.find()) {

                    String furniture = matcher.group("furniture");
                    listFurniture.add(furniture);
                    double price = Double.parseDouble(matcher.group("price"));
                    int quality = Integer.parseInt(matcher.group("quality"));
                    totalPrice += price * quality;


                }
                text = scanner.nextLine();
            }
            System.out.println("Bought furniture:");
            for (String furniture:listFurniture) {
                System.out.println(furniture);
            }
            System.out.printf("Total money spend: %.2f",totalPrice);

        }

    }


