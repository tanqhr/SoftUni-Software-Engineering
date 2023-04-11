package zoo.entities.areas;

public class LandArea extends BaseArea{

    private static final int CAPACITY_LAND_AREA=25;

    public LandArea(String name) {
        super(name, CAPACITY_LAND_AREA);
    }
}
