package zoo.entities.animals;

public class AquaticAnimal extends BaseAnimal{
    private static final double KG_PER_AQUATIC = 2.5;
    public AquaticAnimal(String name, String kind, double price) {
        super(name, kind, KG_PER_AQUATIC, price);
    }

    @Override
    public void eat() {
      setKg(getKg()+7.5);
    }
}
