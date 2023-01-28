package ProgrammingFundamentalsFinalExamRetake_01;


import java.util.Scanner;

public class TheImitationGame_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            String input= scanner.nextLine();
            StringBuilder inputs=new StringBuilder(input);

            String commands= scanner.nextLine();
            while(!commands.equals("Decode")){

                String[]tokens=commands.split("\\|");
                String command=tokens[0];
                switch (command){

                    case "Move":
                        int countToMove=Integer.parseInt(tokens[1]);
                        String letters=inputs.substring(0,countToMove);
                        inputs.delete(0,countToMove);
                        inputs.append(letters);
                        input= String.valueOf(inputs);

                        break;


                    case "Insert":
                        int index=Integer.parseInt(tokens[1]);
                        String letter=tokens[2];
                        inputs.insert(index, letter);
                        input= String.valueOf(inputs);

                        break;


                    case "ChangeAll":
                        String substring=tokens[1];
                        String replacement=tokens[2];
                        if(input.contains(substring)) {
                            input= input.replace(substring, replacement);
                            inputs= new StringBuilder(input);

                        }     break;


                }

                commands= scanner.nextLine();
            }
            System.out.printf("The decrypted message is: %s",input);
        }
    }


