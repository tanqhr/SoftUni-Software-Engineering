package glacialExpedition.models.explorers;

import glacialExpedition.common.ConstantMessages;
import glacialExpedition.common.ExceptionMessages;
import glacialExpedition.models.suitcases.Carton;
import glacialExpedition.models.suitcases.Suitcase;

import java.util.Collection;

public abstract class BaseExplorer implements Explorer{
    private String name;
    private double energy;
    private Suitcase suitcase;

    public BaseExplorer(String name, double energy) {
        this.setName(name);
        this.setEnergy(energy);
        suitcase = new Carton();

    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getEnergy() {
        return this.energy;
    }

    @Override
    public boolean canSearch() {
        return this.energy > 0;
    }

    @Override
    public Suitcase getSuitcase() {
        return this.suitcase;
    }

    @Override
    public void search() {
        energy -= 15;
        if(energy < 0){
           energy = 0;
       //    energy=Math.max(0,energy-15);
        }

    }

    protected void setName(String name) {
        if (name == null || name.trim().equals("")) {
            throw new NullPointerException(ExceptionMessages.EXPLORER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    protected void setEnergy(double energy) {
        if(energy < 0){
            throw new IllegalArgumentException(ExceptionMessages.EXPLORER_ENERGY_LESS_THAN_ZERO);

        }
        this.energy = energy;
    }

    public void setSuitcase(Suitcase suitcase) {
        this.suitcase = suitcase;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format(ConstantMessages.FINAL_EXPLORER_NAME,name)).append(System.lineSeparator())
                .append(String.format(ConstantMessages.FINAL_EXPLORER_ENERGY,energy)).append(System.lineSeparator());
                if(getSuitcase().getExhibits().isEmpty()){
                    builder.append(String.format(ConstantMessages.FINAL_EXPLORER_SUITCASE_EXHIBITS,"None"));
                }else{
                    builder.append(String.format(ConstantMessages.FINAL_EXPLORER_SUITCASE_EXHIBITS,String.join(ConstantMessages.FINAL_EXPLORER_SUITCASE_EXHIBITS_DELIMITER,getSuitcase().getExhibits())));
                }
        return builder.toString();
    }
}
