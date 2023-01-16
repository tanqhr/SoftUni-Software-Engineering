package ListsExcersises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[]data=scanner.nextLine().split(" ");
        int bomb=Integer.parseInt(data[0]);
        int power=Integer.parseInt(data[1]);
        while(list.contains(bomb)) {
            int bombIndex= list.indexOf(bomb);
            int start = bombIndex - power;
            int end = bombIndex + power;
            if (start < 0) {
                start = 0;
        }if(end>=list.size()){
                end= list.size()-1;
            }
            for (int i = start; i <=end ; i++) {
                list.remove(start);
                
            }

        }
        int sum=0;
        for (int num:list) {
            sum+=num;

        }
        System.out.println(sum);

    }
}


