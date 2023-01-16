package ArraysExcersise;

import java.util.Scanner;

public class CommonElements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine= scanner.nextLine();
        String secondLine= scanner.nextLine();
        String []array1=firstLine.split(" ");
        String[]array2=secondLine.split(" ");
        for(String elementsInSecondArray:array2){
            for (String elementsInFirstArray:array1){
                if (elementsInSecondArray.equals(elementsInFirstArray)){
                    System.out.print(elementsInSecondArray+" ");
                }
            }
        }
    }
}
