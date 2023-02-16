package animals;

public class Tomcat extends Cat {

    private static final String male = "Male";

    public Tomcat(String name, int age) {
        super(name, age, male);
    }

    public String produceSound() {
        return "MEOW";
    }
}
