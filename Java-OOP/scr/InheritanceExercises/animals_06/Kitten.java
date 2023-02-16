package animals;

public class Kitten extends Cat{

    private static final String male="Female";

    public Kitten(String name, int age) {
        super(name, age, male);
    }
    public String produceSound() {
        return "Meow";
    }

}
