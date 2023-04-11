package zoo.entities.foods;

public class Meat extends BaseFood{
    private static final int CALORIES_PER_MEAT = 70;
    private static final int PRICE_PER_MEAT = 10;
    public Meat() {
        super(CALORIES_PER_MEAT, PRICE_PER_MEAT);
    }
}
