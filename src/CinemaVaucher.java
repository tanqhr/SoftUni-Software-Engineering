import java.util.Scanner;

public class CinemaVaucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countVoucher = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int price = 0;

        int count = 0;
        int films = 0;

        while (!command.equals("End")) {
            String name = command;
            int lenght = name.length();
            if (lenght > 8) {
                price = name.charAt(0) + name.charAt(1);
                    films++;

            }
            else if (lenght <= 8) {
                price = name.charAt(0);
count++;
            }
            if (price <= countVoucher) {
                countVoucher -= price;


            } else if (price>countVoucher){
                if (lenght>8) {
                    films--;
                }else if (lenght<=8){
                    count--;
                }
                break;
            }
            command = scanner.nextLine();

        }
            System.out.printf("%d%n", films);
            System.out.printf("%d", count);

        }
    }


