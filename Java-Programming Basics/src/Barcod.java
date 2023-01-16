import java.util.Scanner;

public class Barcod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int startUnits = startNumber % 10;
        int startTens = (startNumber / 10) % 10;
        int startHundreds = (startNumber / 100) % 10;
        int startTousand = startNumber / 1000;
        int endNumber = Integer.parseInt(scanner.nextLine());
        int endUnits = endNumber % 10;
        int endTens = (endNumber / 10) % 10;
        int endHundreds = (endNumber / 100) % 10;
        int endTousand = endNumber / 1000;
        for (int i = startNumber; i <= endNumber; i++) {
            int units = i % 10;
            int tens = (i / 10) % 10;
            int hundreds = (i / 100) % 10;
            int tousand = i / 1000;


            if ((units>=startUnits&&units<=endUnits&&units%2!=0)&&
                    (tens>=startTens&&tens<=endTens&&tens%2!=0)&&(hundreds>=startHundreds&&hundreds<=endHundreds&&hundreds%2!=0)&&
                    (tousand>=startTousand&&tousand<=endTousand&&tousand%2!=0)){
                System.out.print(i+" ");
            }

        }
    }
}

