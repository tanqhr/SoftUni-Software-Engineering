package ArraysMoreExcersise;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class LongestIncreasingSubsequence_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] sequence = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int[] len = new int[sequence.length];
            int[] prev = new int[sequence.length];
            int maxLength = 0;
            int lastIndex = -1;

            for (int i = 0; i < sequence.length; i++) {
                len[i] = 1;
                prev[i] = -1;

                for (int j = 0; j < i; j++){

                    if (sequence[j] < sequence[i] && len[j] >= len[i]) {
                        len[i] = 1 + len[j];
                        prev[i] = j;
                    }
                }

                if (len[i] > maxLength)
                {
                    maxLength = len[i];
                    lastIndex = i;
                }
            }
            int[]lis = new int[maxLength];
            for (int i = 0; i < maxLength; i++)
            {
                lis[i] = sequence[lastIndex];
                lastIndex = prev[lastIndex];
            }
            for (int i = lis.length-1; i >=0 ; i--) {
                int num=lis[i];
                System.out.print(num+" ");

            }
        }
    }



