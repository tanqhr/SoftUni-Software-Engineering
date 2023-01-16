import java.util.*;

public class AdvertisementMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line=Integer.parseInt(scanner.nextLine());
        List<String> phrases=new ArrayList<>(Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."));
        List<String> events=new ArrayList<>(Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));
        List<String> authors=new ArrayList<>(Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));
        List<String> cities=new ArrayList<>(Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));
        for (int i = 0; i <line ; i++) {
            Random rnd=new Random();

            int randomPhrases= rnd.nextInt(phrases.size());
            int randomEvents=rnd.nextInt(events.size());
            int randomAuthor=rnd.nextInt(authors.size());
            int randomCities=rnd.nextInt(cities.size());

            String phrase= phrases.get(randomPhrases);
            String event= events.get(randomEvents);
            String author= authors.get(randomAuthor);
            String city= cities.get(randomCities);

            System.out.printf("%s %s %s - %s%n", phrase, event, author, city);


        }
    }
}
