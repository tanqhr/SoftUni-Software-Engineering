package foggy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();

        List<Integer> numbersList= Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Lake lake=new Lake(numbersList);
List<String>result=new ArrayList<>();

        for (Integer integer:lake) {
            result.add(String.valueOf(integer));


        }
        List<String> input1 =result.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(String.join(", ", input1));

    }
}
