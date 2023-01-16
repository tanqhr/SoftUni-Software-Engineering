package ListMoreExcersise;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbers=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String>letters=Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
String word="";
        for (int i = 0; i < numbers.size(); i++) {
            String nums= String.valueOf(numbers.get(i));
           String []tokens=nums.split("");
           int sum=0;
            for (int j = 0; j < tokens.length; j++) {
                int num= Integer.parseInt(tokens[j]);
                sum+=num;
            }


            while(sum> letters.size()){
                sum-= letters.size();

                }word+=letters.get(sum);
            letters.remove(sum);




            }




        System.out.println(word);


        }
    }

