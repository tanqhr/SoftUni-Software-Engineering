package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {

            return this.firstName;
        }

        public String getLastName() {

            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }


        public void setAge(String age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
boolean isTrue=false;
        while (!input.equals("end")) {
            String[] inputStudentArr = input.split(" ");
            String firstName = inputStudentArr[0];
            String lastName = inputStudentArr[1];
            String age = inputStudentArr[2];
            String town = inputStudentArr[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            if (studentList.isEmpty()) {
                studentList.add(currentStudent);
            } else {
                for (Student student : studentList) {

                    if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {

                        student.setAge(age);
                        student.setTown(town);
                        isTrue = true;
                    }
                }
            if(!isTrue){
                        studentList.add(currentStudent);
                    }
                }isTrue=false;
                    input = scanner.nextLine();
                }
                String searchTown = scanner.nextLine();
                for (Student item : studentList) {
                    if (item.getTown().equals(searchTown)) {
                        System.out.printf("%s %s is %s years old%n", item.getFirstName(), item.getLastName(), item.getAge());
                    }
                }
            }

        }
