package ListsExcersises;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ChangeList_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command= scanner.nextLine();
        while(!command.equals("end")){
            String input=command.split(" ")[0];
            int element=Integer.parseInt(command.split(" ")[1]);
         switch (input){
             case "Delete":
numList.removeAll(Arrays.asList(element));
                 break;


             case "Insert":
             int position= Integer.parseInt(command.split(" ")[2]);
numList.add(position, element);
                 break;
         }



            command= scanner.nextLine();

        }
        for (int num:numList) {
            System.out.print(num+ " ");

        }
    }
}
