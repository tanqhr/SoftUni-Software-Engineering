package StackAndQueuesExercises;


import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int countCommands=Integer.parseInt(scanner.nextLine());
            StringBuilder currentText=new StringBuilder();
            ArrayDeque<String>textStack=new ArrayDeque<>();
            for (int i = 1; i <=countCommands; i++) {
                String command= scanner.nextLine();

                int commandNumber=Integer.parseInt(command.split("\\s+")[0]);
                switch (commandNumber){
                    case 1:
                        textStack.push(currentText.toString());

                        String stringToAppend=command.split("\\s+")[1];
                        currentText.append(stringToAppend);
                        break;

                    case 2:
                        textStack.push(currentText.toString());

                        int countElementsForDelete=Integer.parseInt(command.split("\\s+")[1]);
                        int startIndex =currentText.length()-countElementsForDelete;
                        currentText.delete(startIndex, startIndex+countElementsForDelete);
                        break;

                    case 3:
                        int index=Integer.parseInt(command.split("\\s+")[1]);

                        System.out.println(currentText.charAt(index-1));
                        break;

                    case 4:
                        if(!textStack.isEmpty()) {
                            currentText = new StringBuilder(textStack.pop());
                        }
                        break;
                }

            }


        }
    }


