package TextProcessingExercise;




import java.util.Scanner;

public class CharacterMultiplier_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[]words=scanner.nextLine().split(" ");
            int sum=multipliedWord(words[0],(words[1]));
            System.out.println(sum);
        }

        private static int multipliedWord(String word, String word1) {

            int sum=0;
            if(word1.length()-1>word.length()-1){
                for (int i = 0; i <word.length() ; i+=1) {
                    char sumLetters = (char) (word.charAt(i) * word1.charAt(i));
                    sum += sumLetters;

                }

                for (int j= word.length(); j <word1.length() ; j++) {
                    sum += word1.charAt(j);
                }

            }else if(word.length()-1>word1.length()-1){
                for (int i = 0; i <word1.length() ; i+=1) {
                    char sumLetters = (char) (word.charAt(i) * word1.charAt(i));
                    sum += sumLetters;
                }
                for (int i = word1.length(); i < word.length(); i++) {
                    sum += word.charAt(i);
                }

            }else if(word.length()-1==word1.length()-1){
                for (int i = 0; i <word1.length() ; i+=1) {
                    char sumLetters = (char) (word.charAt(i) * word1.charAt(i));
                    sum += sumLetters;
                }

            }
            return sum;

        }

    }


