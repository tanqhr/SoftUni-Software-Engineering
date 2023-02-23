package BirthdayCelebrations_03;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       List<Birthable> thingsWithBirthdate=new ArrayList<>();
       while(!"End".equals(input)){

           String [] tokens=input.split(" ");
           String objectType=tokens[0];

           switch (objectType){

               case "Citizen":
                   String personName=tokens[1];
                   int personAge=Integer.parseInt(tokens[2]);
                   String personId=tokens[3];
                   String personBirthDate=tokens[4];
                   Citizen citizen=new Citizen(personName,personAge,personId,personBirthDate);
                   thingsWithBirthdate.add(citizen);
                   break;


               case "Pet":
                   String name=tokens[1];
                   String birthDate=tokens[2];
                   Pet pet =new Pet(name,birthDate);
                   thingsWithBirthdate.add(pet);


                   break;

               case "Robot":

                   break;
           }

           input= scanner.nextLine();
       }

       String year= scanner.nextLine();
        for (Birthable birthable:thingsWithBirthdate) {
            if(birthable.getBirthDate().endsWith(year)){
                System.out.println(birthable.getBirthDate());
            }

        }
    }
    }
