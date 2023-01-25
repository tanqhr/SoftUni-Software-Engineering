package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon_10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int pokePower=Integer.parseInt(scanner.nextLine());
            int distanceBetweenPoke=Integer.parseInt(scanner.nextLine());
            int exhaustionFactor=Integer.parseInt(scanner.nextLine());
            int power=pokePower;

            int count=0;
            while(pokePower>=distanceBetweenPoke){
                pokePower-=distanceBetweenPoke;
                count++;


                if (pokePower==power*0.5 && exhaustionFactor!=0){

                    pokePower/=exhaustionFactor;

                }
            }
            System.out.println(pokePower);
            System.out.println(count);
        }
    }


