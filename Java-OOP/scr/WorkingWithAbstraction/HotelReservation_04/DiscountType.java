package HotelReservation_04;

public enum DiscountType {
    NONE("None",0),
    SECONDVISIT("SecondVisit",10),
    VIP("VIP",20);

    private String name;
    private double persent;

    DiscountType(String name, double persent) {
        this.name = name;
        this.persent = persent;
    }

    public String getName() {
        return name;
    }

    public double getPersent() {
        return persent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersent(double persent) {
        this.persent = persent;
    }
}
