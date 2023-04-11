package zoo.entities.animals;

public class TerrestrialAnimal extends BaseAnimal {
    private static final double KG_PER_TERRESTRIAL = 5.5;

    public TerrestrialAnimal(String name, String kind, double price) {
        super(name, kind, KG_PER_TERRESTRIAL, price);
    }

    @Override
    public void eat() {
        setKg(getKg()+5.7);

    }
}
