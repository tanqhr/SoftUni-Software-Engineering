package RegularExpressionsExercises;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<String> names = Arrays.stream(scanner.nextLine().split("\\s*,\\s*")).collect(Collectors.toList());

            Pattern pattern1 = Pattern.compile("[^0-9+\\-*\\/.]");
            Pattern pattern2 = Pattern.compile("\\-?\\+?[0-9]+[\\.]?[0-9]*");

            for (String symbol : names) {
                Matcher matcher = pattern1.matcher(symbol);
                int sum = 0;
                while (matcher.find()) {
                    char symbols = matcher.group().charAt(0);
                    sum += symbols;
                }
                Matcher matcher1 = pattern2.matcher(symbol);
                double sum2 = 0.0;
                while (matcher1.find()) {
                    sum2 += Double.parseDouble(matcher1.group());
                }
                for (char symbolss : symbol.toCharArray()) {
                    if (symbolss == '/') {
                        sum2 /= 2;
                    } else if (symbolss == '*') {
                        sum2 *= 2;
                    }

                }

                System.out.printf("%s - %d health, %.2f damage%n", symbol, sum, sum2);

            }
        }
    }



