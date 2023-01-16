import java.util.Scanner;

public class rentACar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budjet=Double.parseDouble(scanner.nextLine());
        double price=0;
        String car="";
        String type= "";
        String season= scanner.nextLine();
        switch (season){
            case"Summer":
if (budjet<=100){
    type="Economy class";
car="Cabrio";
    price=budjet*0.35;


}else if (budjet>100&&budjet<=500) {
    type="Compact class";
car="Cabrio";
    price=budjet*0.45;
}else if (budjet>500) {
    type="Luxury class";
    car="Jeep";
price=budjet*0.90;
}
                break;


            case "Winter":
                if (budjet<=100){
                    type="Economy class";
car="Jeep";
                    price=budjet*0.65;
                }else if (budjet>100&&budjet<=500) {
                    type="Compact class";
car="Jeep";
                    price = budjet * 0.80;
                }else if (budjet>500) {
                    type="Luxury class";
                    car="Jeep";
            price=budjet*0.90;
        }
                break;
        }
        System.out.printf("%s%n", type);
        System.out.printf("%s - %.2f", car, price);
    }
}
//⦁	Първи ред – "{Вид на класа}"
//⦁	"Economy class", "Compact class" или "Luxury class"
//⦁	Втори ред – "{Вид на колата} - {цена на колата}"
//⦁	Видът на колата – "Cabrio" или "Jeep"
//⦁	Цената трябва да е форматирана до втория знак след запетаята
//Примерен вход и изход