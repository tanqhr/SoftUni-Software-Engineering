package zoo.entities.foods;

public class Vegetable extends BaseFood{
    private static final int CALORIES_FOR_VEGETABLE = 50;
    private static final int PRICE_FOR_VEGETABLE = 5;

    public Vegetable() {
        super(CALORIES_FOR_VEGETABLE,PRICE_FOR_VEGETABLE);
    }

}
