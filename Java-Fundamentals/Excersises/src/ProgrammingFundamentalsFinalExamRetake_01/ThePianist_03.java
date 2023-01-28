package ProgrammingFundamentalsFinalExamRetake_01;

import java.util.*;

public class ThePianist_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int count=Integer.parseInt(scanner.nextLine());
            Map<String, List<String>> map=new LinkedHashMap<>();
            for (int i = 0; i < count; i++) {
                String []input=scanner.nextLine().split("\\|");
                String piece=input[0];
                String composer=input[1];
                String key=input[2];
                map.put(piece,new ArrayList<>());
                map.get(piece).add(composer);
                map.get(piece).add(key);


            }String commands= scanner.nextLine();
            while(!commands.equals("Stop")){

                String command=commands.split("\\|")[0];
                String piece=commands.split("\\|")[1];
                switch (command){
                    case "Add":

                        String composer=commands.split("\\|")[2];
                        String key=commands.split("\\|")[3];
                        if(!map.containsKey(piece)){
                            map.put(piece,new ArrayList<>());
                            map.get(piece).add(composer);
                            map.get(piece).add(key);
                            System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                        }else{
                            System.out.printf("%s is already in the collection!%n",piece);
                        }

                        break;


                    case "Remove":
                        if(map.containsKey(piece)){
                            map.remove(piece);
                            System.out.printf("Successfully removed %s!%n",piece);
                        }else{
                            System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                        }

                        break;


                    case "ChangeKey":
                        String newkey=commands.split("\\|")[2];
                        if(map.containsKey(piece)){
                            map.get(piece).set(1,newkey);
                            System.out.printf("Changed the key of %s to %s!%n",piece,newkey);
                        }else{
                            System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                        }

                        break;
                }



                commands= scanner.nextLine();
            }
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.printf( "%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));

            }

        }
    }

