package TextProcessingExercise;


import java.util.Scanner;

public class ExtractFile_03 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String fullPathFile = scanner.nextLine();
            int startIndex = fullPathFile.lastIndexOf("\\") + 1;
            String fileName = fullPathFile.substring(startIndex);
            String[] arr = fileName.split("\\.");
            System.out.printf("File name: %s%n", arr[0]);
            System.out.printf("File extension: %s%n", arr[1]);
        }
}
