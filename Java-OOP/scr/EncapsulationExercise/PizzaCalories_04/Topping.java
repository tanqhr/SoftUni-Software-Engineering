package PizzaCalories_04;

public class Topping {


    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);

    }


    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }
    private void setWeight(double weight){
        if(weight>=1 && weight<=50){
            this.weight=weight;
        }else{
            throw new IllegalArgumentException(this.toppingType+ " weight should be in the range [1..50].");

        }

    }
    public double calculateCalories (){
        double toppingModifier=0;

        switch (this.toppingType){
            case "Meat":
                toppingModifier=1.2;
                break;
            case "Veggies":
                toppingModifier=0.8;
                break;
            case "Cheese":
                toppingModifier=1.1;
                break;
            case "Sauce":
                toppingModifier=0.9;
                break;
        }
        return 2 * this.weight * toppingModifier;

    }
}
