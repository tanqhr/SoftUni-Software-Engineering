package SortByNameAndAge_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
            List<Person> people = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] input = scanner.nextLine().split(" ");
                String firstName=input[0];
                String lastName=input[1];
                int age=Integer.parseInt(input[2]);
                people.add(new Person(firstName, lastName, age));
            }

            Collections.sort(people, (firstPerson, secondPerson) -> {
                int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

                if (sComp != 0) {
                    return sComp;
                } else {
                    return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
                }
            });


        for (Person person : people) {
                System.out.println(person.toString());
            }
        }


    }
