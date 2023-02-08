package ShoppingSpree_03;

public class Product {

    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);

    }
    private void setCost(double cost){
        if(cost>=0){
            this.cost=cost;
        }else{
            throw new IllegalArgumentException("Cost cannot be negative");
        }

    }
    private void setName(String name){
        if(name.trim().length()>0){
            this.name=name;
        }else{
            throw new IllegalArgumentException("Name cannot be empty");
        }

    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
