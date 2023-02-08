package PizzaCalories_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pizzaData= scanner.nextLine();
        String pizzaName=pizzaData.split(" ")[1];
        int numberOfToppings=Integer.parseInt(pizzaData.split(" ")[2]);
        Pizza pizza=new Pizza(pizzaName,numberOfToppings);

        String doughData= scanner.nextLine();
        String flourType=doughData.split(" ")[1];
                String bakingTechnique=doughData.split( " ")[2];
                double doughWeigh=Double.parseDouble(doughData.split(" ")[3]);
                Dough dough =new Dough(flourType,bakingTechnique,doughWeigh);
                pizza.setDough(dough);

        String toppingData= scanner.nextLine();
        while(!toppingData.equals("END")){
            String toppingType=toppingData.split(" ")[1];
            double toppingWeigh=Double.parseDouble(toppingData.split(" ")[2]);
            Topping topping=new Topping(toppingType,toppingWeigh);
            pizza.addTopping(topping);




            toppingData= scanner.nextLine();
        }
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
