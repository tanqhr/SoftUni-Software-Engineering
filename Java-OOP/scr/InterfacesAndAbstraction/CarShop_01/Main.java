package CarShopExtend_02;

public class Main {
    public static void main(String[] args) {

       Car seat = new Seat("Leon", "gray", 110, "Spain");

        System.out.printf("%s is %s color and have %d horse power %n", seat.getModel(), seat.getColor(), seat.getHorsePower());

        System.out.println(seat.toString());

    }
}
