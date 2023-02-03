package ProgrammingFundamentalsFinalExam_04;

import java.util.Scanner;

public class PasswordReset_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            String command = scanner.nextLine();
            StringBuilder builder = new StringBuilder();
            while (!command.equals("Done")) {
                String commands = command.split("\\s+")[0];
                switch (commands) {
                    case "TakeOdd":
                        char[] indexxx=input.toCharArray();
                        for (int i = 0; i <indexxx.length; i++) {
                            if (i % 2 != 0) {
                                builder.append(indexxx[i]);


                            }
                        }input=builder.toString();
                        System.out.println(input);
                        break;

                    case "Cut":
                        int index = Integer.parseInt(command.split("\\s+")[1]);
                        int length = Integer.parseInt(command.split("\\s+")[2]);
                        String subString= input.substring(index,index+length);
                        if(input.contains(subString)){
                            input= input.replaceFirst(subString,"");

                        }
                        System.out.println(input);

                        break;


                    case "Substitute":
                        String symbol1 = command.split("\\s+")[1];
                        String symbol2 = command.split("\\s+")[2];


                        if(input.contains(symbol1)) {
                            input = input.replaceAll(symbol1, symbol2);
                            System.out.println(input);
                        }else{
                            System.out.println("Nothing to replace!");
                        }


                        break;

                }
                command = scanner.nextLine();
            }
            System.out.printf("Your password is: %s",input);
        }
    }


