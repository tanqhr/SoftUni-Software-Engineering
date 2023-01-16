import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg=Double.parseDouble(scanner.nextLine());
        String type= scanner.nextLine();
        int km=Integer.parseInt(scanner.nextLine());
        double price=0;
        double extra=0;
        double extraPrice=0;
        double totalExtra=0;
        double extrae=0;
        //За пратки по - леки от 1 кг – 3 стотинки на километър.
        //От 1 кг до 10 кг – 5 стотинки на километър.
        //От 10 кг вкл. до 40 кг – 10 стотинки на километър.
        //От 40 кг вкл. до 90  кг – 15 стотинки на километър.
        //От 90 кг вкл. до 150 кг – 20 стотинки на километър.
        //За услуга тип "express", фирмата извършва услугата в рамките на 24 часа, като начислява надценка за всеки километър както следва:
        //За пратки по - леки от 1 кг – на килограм по 80 % от съответната цена на километър
        //От 1 кг до 10  кг – на килограм по 40 % от съответната цена на километър
        //От 10 кг вкл. до 40 кг – на килограм по 5 % от съответната цена на километър
        //От 40 кг вкл. до 90  кг – на килограм по 2 % от съответната цена на километър
        //От 90 кг вкл. до 150 кг – на килограм по 1 % от съответната цена на километър
        switch (type){

            case "standard":
                if (kg<1){
                    price=3;

                }else if (kg>=1&&kg<10){
                    price=5;
                }else if (kg>=10&&kg<40){
                    price=10;
                }else if (kg>=40&&kg<90){
                    price=15;
                }else if (kg>=90&&kg<150){
                    price=20;
                }


                break;


            case "express":
                if (kg<1){
                    price=3;
                    extra=3*0.8;
                    extraPrice=kg*extra;
                    totalExtra=km*extraPrice;
                    extrae=(km*extraPrice)/100;
                }else if (kg>=1&&kg<10){
                    price=5;
                    extra=5*0.4;
                    extraPrice=kg*extra;
                    totalExtra=km*extraPrice;
                    extrae=(km*extraPrice)/100;
                }else if (kg>=10&&kg<40){
                    price=10;
                    extra=10*0.05;
                    extraPrice=kg*extra;
                    totalExtra=km*extraPrice;
                    extrae=(km*extraPrice)/100;
                }else if (kg>=40&&kg<90){
                    price=15;
                    extra=15*0.02;
                    extraPrice=kg*extra;
                    extrae=(km*extraPrice)/100;
                }else if (kg>=90&&kg<150){
                    price=20;
                    extra=20*0.01;
                    extraPrice=kg*extra;
                    totalExtra=km*extraPrice;
                    extrae=(km*extraPrice)/100;
                }


                break;

        }double sum=((km*price)/100)+extrae;
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", kg, sum);

    }
}
