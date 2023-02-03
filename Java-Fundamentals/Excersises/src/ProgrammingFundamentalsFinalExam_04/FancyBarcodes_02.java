package ProgrammingFundamentalsFinalExam_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < count; i++) {
                String input = scanner.nextLine();
                String regex = "@#+[A-Z][A-Za-z0-9]{4}[A-Za-z0-9]*[A-Z]@#+";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(input);
                if (matcher.find()) {
                    StringBuilder builder = new StringBuilder();
                    char[] digits = input.toCharArray();
                    int sum=0;
                    for (int j = 0; j < digits.length; j++) {
                        char symbols=digits[j];
                        if (symbols >= 48&& symbols<= 57) {
                            builder.append(digits[j]);
                            sum++;
                        }
                    }if(sum==0){
                        builder.append("00");
                        System.out.printf("Product group: %s%n",builder);
                    }else{
                        System.out.printf("Product group: %s%n",builder);
                    }



                }else{
                    System.out.println("Invalid barcode");
                }
            }
        }
    }


