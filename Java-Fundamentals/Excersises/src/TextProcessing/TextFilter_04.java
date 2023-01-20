package TextProcessing;



import java.util.Scanner;

public class TextFilter_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[]wordArray=scanner.nextLine().split(", ");
            String text= scanner.nextLine();

            for (String word:wordArray) {
                if (text.contains(word)) {
                    String repeatWord=repeatString("*", word.length());
                    text=text.replaceAll(word, repeatWord);

                }
            }


            System.out.println(text);
        }
        public static String repeatString(String word,int count){
            String[]repeatArray=new String[count];
            for (int i = 0; i < count; i++) {
                repeatArray[i] = word;


            }return String.join("",repeatArray);
        }

    }


