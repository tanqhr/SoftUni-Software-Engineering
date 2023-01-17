package StackAndQueuesExercises;




import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenheses {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String numbers = scanner.nextLine();
            boolean isTrue = true;
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for (int i = 0; i < numbers.length(); i++) {
                char symbol = numbers.charAt(i);
                if (symbol == '{' || symbol == '(' || symbol == '[') {
                    stack.push(symbol);
                } else {
                    if (stack.isEmpty()) {
                        isTrue = false;
                        break;
                    }

                    char lastStack = stack.pop();
                    if (symbol == '}' && lastStack != '{') {
                        isTrue = false;
                    } else if (symbol == ']' && lastStack != '[') {
                        isTrue = false;
                    } else if (symbol == ')' && lastStack != '(') {
                        isTrue = false;
                    }
                }

            }if(isTrue &&stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }

