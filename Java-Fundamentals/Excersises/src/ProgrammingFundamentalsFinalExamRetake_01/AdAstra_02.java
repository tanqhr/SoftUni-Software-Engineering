package ProgrammingFundamentalsFinalExamRetake_01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            List<String>food=new ArrayList<>();
            String regex = "([|#])(?<product>[A-Za-z\\s]+)\\1(?<date>[\\d]{2}[\\/]{1}[\\d]{2}[\\/][\\d]{2})\\1(?<calories>[\\d]{1,5})\\1";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            int allCalories = 0;
            int days = 0;

            while (matcher.find()) {
                String calories = matcher.group("calories");
                allCalories += Integer.parseInt(calories);
                String product = matcher.group("product");
                String date = matcher.group("date");
                String foods=product+", "+date+", "+calories;
                food.add(foods);
            } days = allCalories / 2000;
            System.out.printf("You have food to last you for: %d days!%n", days);
            for (String name:food) {
                System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",name.split(", ")[0],name.split(", ")[1],name.split(", ")[2]);

            }
        }
    }


