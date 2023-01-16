import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        String mostWord = "";
        double totalSum = 0;
        while (!command.equals("End of words")) {
            String word = command;
            int sum = 0;
            double totalSumWord = 0;
            for (int i = 0; i < word.length(); i++) {
                sum++;
                int number = word.charAt(i);
                totalSumWord += number;
            }
            if (word.charAt(0) == 97 || word.charAt(0) == 101 || word.charAt(0) == 105 || word.charAt(0) == 111 || word.charAt(0) == 117 || word.charAt(0) == 121 || word.charAt(0) == 65 ||
                    word.charAt(0) == 69 || word.charAt(0) == 73 || word.charAt(0) == 79 || word.charAt(0) == 85 || word.charAt(0) == 89) {
                totalSumWord = totalSumWord * sum;
            } else {
                totalSumWord = Math.floor(totalSumWord / sum);
            }
            if (totalSumWord > totalSum) {
                totalSum = totalSumWord;
                mostWord = word;
            }

            command = scanner.nextLine();
        }
            System.out.printf("The most powerful word is %s - %.0f", mostWord, totalSum);
        }
    }
