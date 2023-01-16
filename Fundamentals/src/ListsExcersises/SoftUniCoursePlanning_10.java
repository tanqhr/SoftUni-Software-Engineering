package ListsExcersises;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("\\,\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] input = command.split("\\:");
            String commands = input[0];

            //    Swap:{lessonTitle}:{lessonTitle} -change the place of the two lessons, if they exist

            switch (commands) {
                case "Add":
                    String lesson = input[1];
                    if (!list.contains(lesson)) {
                        list.add(lesson);
                    }


                    break;
                case "Insert":

                    String lessonTitle = input[1];
                    int index = Integer.parseInt(input[2]);
                    if (!list.contains(lessonTitle)) {
                        list.add(index, lessonTitle);
                    }


                    break;

                case "Remove":
                    String lessons = input[1];
                    if (list.contains(lessons)) {
                        list.remove(lessons);
                    }
                    int indexLessons = list.indexOf(lessons);
                    if (list.get(indexLessons + 1).equals(lessons + "-Exercise")) {
                        list.remove(indexLessons + 1);
                    }

                    break;


                case "Swap":
                    String lesson1 = input[1];
                    String lesson2 = input[2];
                    String exercise1 = lesson1 + "-Exercise";
                    String exercise2 = lesson2 + "-Exercise";
                    if (list.contains(lesson1) && list.contains(lesson2)) {
                        int index1 = list.indexOf(lesson1);
                        int index2 = list.indexOf(lesson2);

                        list.set(index1,lesson2);

                        list.set(index2,lesson1);

                    if (index1!= list.size()-1&& list.get(index1 + 1).equals(exercise1)) {
                        list.remove(index1 + 1);
                        list.add(index2 + 1, exercise1);
                    }
                    if (index2 != list.size() - 1 && list.get(index2 + 1).equals(exercise2)) {
                        list.remove(index2 + 1);
                        list.add(index1 + 1, exercise2);
                    }
                    }
                    break;

                case "Exercise":
                    String lessonExcercise = input[1];
                    String nameLessonExcersise = lessonExcercise + "-Exercise";
                    int indexLesson = list.indexOf(lessonExcercise);
                    if (list.contains(lessonExcercise)) {
                        if(indexLesson== list.size()-1){
                            list.add(indexLesson+1, nameLessonExcersise);
                        }
                       else if (!list.get(indexLesson + 1).equals(nameLessonExcersise)) {
                            list.add(indexLesson + 1, nameLessonExcersise);
                        }
                    } else {
                        list.add(lessonExcercise);
                        list.add(nameLessonExcersise);
                        break;
                    }
            }
            command = scanner.nextLine();

        }

        for (int i = 0; i < list.size() ; i++) {
            String nam=list.get(i);
            System.out.printf("%d.%s%n",i+1, nam);

        }
    }
}