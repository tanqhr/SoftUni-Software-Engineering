package ProgrammingFundamentalsFinalExam_05;

import java.util.Scanner;

public class ActivationKeys_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input= scanner.nextLine();
            String commands= scanner.nextLine();
            while(!commands.equals("Generate")){
                String[]tokens=commands.split(">>>");
                String command=tokens[0];
                switch (command){

                    case "Contains":
                        String substring=tokens[1];
                        if (input.contains(substring)){
                            System.out.printf("%s contains %s%n",input,substring);
                        }else{
                            System.out.println("Substring not found!");
                        }
                        break;



                    case "Flip":
                        String letterType=tokens[1];
                        int startIndex=Integer.parseInt(tokens[2]);
                        int endIndex=Integer.parseInt(tokens[3]);
                        if(letterType.equals("Upper")){
                            String substringFlip=input.substring(startIndex,endIndex);
                            String newSubstring= input.substring(startIndex,endIndex).toUpperCase();
                            input=input.replace(substringFlip,newSubstring);
                        }else if(letterType.equals("Lower")){
                            String substringFlip=input.substring(startIndex,endIndex);
                            String newSubstring= input.substring(startIndex,endIndex).toLowerCase();
                            input=input.replace(substringFlip,newSubstring);
                        }
                        System.out.println(input);



                        break;


                    case "Slice":
                        int startIndexSlice=Integer.parseInt(tokens[1]);
                        int endIndexSlice=Integer.parseInt(tokens[2]);
                        String substringSlice=input.substring(startIndexSlice,endIndexSlice);
                        input=input.replace(substringSlice,"");
                        System.out.println(input);
                        break;
                }



                commands= scanner.nextLine();
            }
            System.out.printf("Your activation key is: %s",input);



        }
    }

