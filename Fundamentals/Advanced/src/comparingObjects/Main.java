package comparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people=new ArrayList<>();

        String input= scanner.nextLine();

        while(!input.equals("END")){
            String[]data=input.split("\\s+");
            Person person=new Person(data[0],Integer.parseInt(data[1]),data[2]);
            people.add(person);



            input= scanner.nextLine();
        }
        int n=Integer.parseInt(scanner.nextLine());

        Person person=people.get(n-1);


        int count=0;
        for (Person e:people) {
            if (e.compareTo(person) == 0) {
                count++;

            }
        }if(count==1){
                System.out.println("No matches");
            }else{
                System.out.println(count+" "+ (people.size()-count)+" "+ people.size());
            }


    }
}
