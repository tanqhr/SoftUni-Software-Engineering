package ListsExcersises;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxPassenger=Integer.parseInt(scanner.nextLine());
        String command= scanner.nextLine();
        while(!command.equals("end")){

            if(command.split(" ")[0].equals("Add")){
                int newWagon=Integer.parseInt(command.split(" ")[1]);
                wagons.add(newWagon);

            }else{
                int people=Integer.parseInt(command.split(" ")[0]);
                for (int i = 0; i < wagons.size() ; i++) {
                    int peopleInWagon= wagons.get(i);
                    if (peopleInWagon+people<=maxPassenger){
                        wagons.set(i, peopleInWagon+people);
                        break;
                    }

                }
            }




            command= scanner.nextLine();
        }
        for (int num: wagons) {
            System.out.print(num+" ");

        }
    }
}
