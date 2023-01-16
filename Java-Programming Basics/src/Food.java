import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        double allFood=Double.parseDouble(scanner.nextLine());
        double bisquit=0;
        double foodPerDay=0;
        double allFood1=0;
        double allFood2=0;
        double totalF=0;
        double allPercent=0;
        double percent1=0;
        double percent2=0;
        for (int i = 1; i <=days ; i++) {

            int food1=Integer.parseInt(scanner.nextLine());
            int food2=Integer.parseInt(scanner.nextLine());
            allFood1+=food1;
            allFood2+=food2;
            foodPerDay=food1+food2;
            totalF+=foodPerDay;
            if(i%3==0){
                bisquit+=foodPerDay*0.1;

            }

        } allPercent=(totalF/allFood)*100;
        percent1=(allFood1/totalF)*100;
        percent2=(allFood2/totalF)*100;
        System.out.printf("Total eaten biscuits: %.0fgr.%n", bisquit);
System.out.printf("%.2f%% of the food has been eaten.%n", allPercent);
System.out.printf("%.2f%% eaten from the dog.%n", percent1);
System.out.printf("%.2f%% eaten from the cat.%n", percent2);

    }
}
