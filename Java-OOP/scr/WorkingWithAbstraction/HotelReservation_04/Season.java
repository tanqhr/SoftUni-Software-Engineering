package HotelReservation_04;

public enum Season {
    SUMMER("Summer", 4),
    AUTUMN("Autumn",1),
    WINTER("Winter",3),
    SPRING("Spring",2);

    private String name;
    private int multiplyCoefficient;



    Season(String name, int multiplyCoefficient){
        this.name=name;
        this.multiplyCoefficient=multiplyCoefficient;
    }

    public String getName() {
        return name;
    }

    public int getMultiplyCoefficient() {
        return multiplyCoefficient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMultiplyCoefficient(int multiplyCoefficient) {
        this.multiplyCoefficient = multiplyCoefficient;
    }
}
