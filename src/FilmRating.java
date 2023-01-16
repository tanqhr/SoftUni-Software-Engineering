import java.util.Scanner;

public class FilmRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFilms = Integer.parseInt(scanner.nextLine());
        double maxRate = 0;
        double minRate = 0;
        String hightRateFilm="";
        String lowRateFilm="";
        double allRatings=0;
        for (int i = 1; i <= countFilms; i++) {
            String film = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            if (rating > maxRate) {
                maxRate = rating;
                hightRateFilm = film;

            }
            if (rating < maxRate) {
                minRate = rating;
                lowRateFilm = film;

            }allRatings+=rating;

        }
        double middleRating=allRatings/countFilms;
            System.out.printf("%s is with highest rating: %.1f%n", hightRateFilm, maxRate);
        System.out.printf("%s is with lowest rating: %.1f%n", lowRateFilm, minRate);
        System.out.printf("Average rating: %.1f", middleRating);

        }
    }
