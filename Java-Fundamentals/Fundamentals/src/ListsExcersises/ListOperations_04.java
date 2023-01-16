package ListsExcersises;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command= scanner.nextLine();
        while(!command.equals("End")){
            String input=command.split(" ")[0];

            switch (input){
                case "Add":
                    int element=Integer.parseInt(command.split(" ")[1]);
                    list.add(element);

                    break;
                case "Insert":
                    int element1=Integer.parseInt(command.split(" ")[1]);
                    int position= Integer.parseInt(command.split(" ")[2]);
                    if (position<0||position> list.size()-1){
                        System.out.println("Invalid index");
                    }else {
                        list.add(position, element1);
                    }
                    break;

                case "Remove":
                    int element2=Integer.parseInt(command.split(" ")[1]);
                    if (element2<0||element2>list.size()-1) {
                        System.out.println("Invalid index");
                    }else {
                        list.remove(element2);
                    }
                    break;

                case "Shift" :
                    String command2=command.split(" ")[1];
                    int position1= Integer.parseInt(command.split(" ")[2]);
                    if (command2.equals("left")){

                        for (int i = 0; i < position1; i++) {
                            int index = list.get(0);
                            list.remove(0);
                            list.add(index);
                        }
                    }else if(command2.equals("right")){
                        for (int i = 0; i < position1; i++) {
                            int lastNum= list.size()-1;
                            int num= list.get(lastNum);
                            list.remove(list.size()-1);
                            list.add(0, num);

                        }
                    }


            }



            command= scanner.nextLine();

        }
        for (int num:list) {
            System.out.print(num + " ");


        }
    }
}
