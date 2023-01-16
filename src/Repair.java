import java.util.Scanner;

public class Repair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height=Integer.parseInt(scanner.nextLine());
        int weight=Integer.parseInt(scanner.nextLine());
        int percentNotPaint=Integer.parseInt(scanner.nextLine());
        double allForPaint=height*weight*4;
        double totalForPaint=allForPaint-(allForPaint*percentNotPaint/100);
        double total=0;
        String command= scanner.nextLine();
        while(!command.equals("Tired!")) {
            int lt = Integer.parseInt(command);
            totalForPaint -= lt;
            total = totalForPaint;
         if(total<0){
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(total));
                return;
            }if (total==0) {
                System.out.print("All walls are painted! Great job, Pesho!");
                return;
            }


            command=scanner.nextLine();
        }
        System.out.printf("%.0f quadratic m left.", total);
    }
}
