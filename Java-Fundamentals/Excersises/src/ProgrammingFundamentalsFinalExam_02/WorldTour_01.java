package ProgrammingFundamentalsFinalExam_02;

import java.util.Scanner;

public class WorldTour_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StringBuilder inputs= new StringBuilder(scanner.nextLine());
            String commands= scanner.nextLine();
            while(!commands.equals("Travel")){
                String []tokens=commands.split(":");
                String command=tokens[0];
                switch (command) {

                    case "Add Stop":

                        int indexAddStop = Integer.parseInt(tokens[1]);

                        String nameAddStop = tokens[2];
                        if (indexAddStop >= 0 && indexAddStop <= inputs.length() - 1) {
                            inputs.insert(indexAddStop, nameAddStop);


                        }
                        System.out.println(inputs);
                        break;

                    case "Remove Stop":
                        int startIndex = Integer.parseInt(tokens[1]);
                        int endIndex = Integer.parseInt(tokens[2]);
                        if (startIndex >= 0 && startIndex <= inputs.length() - 1 && endIndex >= 0 && endIndex <= inputs.length() - 1) {
                            inputs.delete(startIndex, endIndex + 1);


                        }
                        System.out.println(inputs);
                        break;


                    case "Switch":
                        String substring = tokens[1];
                        String substring2 = tokens[2];
                        String input=inputs.toString();
                        if (input.contains(substring)) {
                            input = input.replaceAll(substring, substring2);
                            inputs = new StringBuilder(input);



                        }
                        System.out.println(inputs);
                        break;
                }
                commands=scanner.nextLine();
            }
            System.out.printf("Ready for world tour! Planned stops: %s%n",inputs);
        }
    }

