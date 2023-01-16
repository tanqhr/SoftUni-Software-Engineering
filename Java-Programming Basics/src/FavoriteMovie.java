import java.util.Scanner;



public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);


        int maxPoints = 0;
        String bestFilm = "";
        int count = 0;
        int sum = 0;
        while (!name.equals("STOP")) {

            int points = 0;
            int lengthFilm = (name.length());

                    for (int i = 0; i < name.length(); i++) {

                        int number = name.charAt(i);



                        if (number >= 97 && number <= 122) {

                            points += number - (lengthFilm * 2);

                        } else if (number >= 65 && number <= 90) {

                            points += number - lengthFilm;
                        } else {
                            points = points+number;
                        }
                    }
                    count++;
                    sum = points;

                    if (sum > maxPoints) {
                        maxPoints = points;
                        bestFilm = name;

                    }
                    if (count == 7) {
                        System.out.println("The limit is reached.");
                        break;
                    }


                    name = scanner.nextLine();
                }


                System.out.printf("The best movie for you is %s with %d ASCII sum.", bestFilm, maxPoints);


            }
        }
