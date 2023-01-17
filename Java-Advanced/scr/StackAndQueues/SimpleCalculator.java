package StackAndQueues;



import java.util.ArrayDeque;
import java.util.Scanner;


import java.util.*;
import java.util.stream.Collectors;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]numbers=scanner.nextLine().split("\\s+");
        ArrayDeque<String>tokens=new ArrayDeque<>();
        ArrayList<String>input=new ArrayList<>();
        Collections.addAll(input,numbers);

        for (int i = 0; i < input.size(); i++) {
            while (input.size() > 2) {
                int num1 = Integer.parseInt(input.get(i));
                String n = input.get(i + 1);
                int num2 = Integer.parseInt(input.get(i + 2));
                input.remove(0);
                input.remove(0);
                input.remove(0);
                int sum = 0;
                if (n.equals("+")) {
                    sum = num1 + num2;
                    input.add(0, String.valueOf(sum));
                } else if (n.equals("-")) {

                    sum = num1 - num2;
                    input.add(0, String.valueOf(sum));
                }

            }
        }

        for (String num:input) {
            System.out.println(num);

        }
    }
}

