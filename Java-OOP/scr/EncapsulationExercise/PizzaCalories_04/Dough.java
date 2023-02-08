package PizzaCalories_04;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }


    private void setWeight(double weight){
        if(weight>=1 && weight<=200){
            this.weight=weight;
        }else{
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");

        }
    }

    private void setFlourType(String flourType){
        if(flourType.equals("White")||flourType.equals("Wholegrain")){
            this.flourType=flourType;
        }else{
            throw new IllegalArgumentException("Invalid type of dough.");

        }


    }
    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique){
            case "Crispy":
            case "Chewy":
            case "Homemade":
            this.bakingTechnique = bakingTechnique;
            break;

            default :
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }
    public double calculateCalories(){
        double doughModifier=0;
        switch (this.flourType){
            case "White":
                doughModifier=1.5;
                break;
            case "Wholegrain":
                doughModifier=1.0;
                break;
        }
        double bakingTechniqueModifier=0;
        switch (this.bakingTechnique){
            case "Crispy":
                bakingTechniqueModifier=0.9;
                break;
            case "Chewy":
                bakingTechniqueModifier=1.1;
                break;
            case "Homemade":
                bakingTechniqueModifier=1.0;
                break;

        }

return (2 * this.weight) * doughModifier * bakingTechniqueModifier;
    }
}
