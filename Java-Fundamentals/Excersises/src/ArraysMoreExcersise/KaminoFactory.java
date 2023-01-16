package ArraysMoreExcersise;

import java.util.Scanner;
import java.util.Arrays;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfSequences = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int bestPosition=0;
        int maxLength = 0;
        int maxSumElements = 0;
        String best = "";
        int count=0;
        int bestCount=0;
        String[]result=new String[lengthOfSequences];
        while (!command.equals("Clone them!")) {
            count++;
            String data = command.replaceAll("!", "");
            String[] array = data.split("0");
            int currentLength = 0;
            int currentSumElements = 0;
            int currentPossition = 0;
            for (int i = 0; i < array.length; i++) {
                currentSumElements += array[i].length();
                if (array[i].length() > currentLength) {
                    currentLength = array[i].length();
                    best = array[i];
                }

            }
            currentPossition = data.indexOf(best);

            if(currentLength>maxLength){
                maxLength=currentLength;
                maxSumElements=currentSumElements;
                bestPosition=currentPossition;
                bestCount=count;
                result= data.split("");

            }else if(currentLength==maxLength&&(bestPosition>currentPossition||currentSumElements>maxSumElements)){
                maxLength=currentLength;
                maxSumElements=currentSumElements;
                bestPosition=currentPossition;
                bestCount=count;
                result= data.split("");

            }else if(count==1){
                maxLength=currentLength;
                maxSumElements=currentSumElements;
                bestPosition=currentPossition;
                bestCount=count;
                result= data.split("");
            }

            command = scanner.nextLine();

        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestCount, maxSumElements);
        System.out.println(String.join(" ", result));

    }


}