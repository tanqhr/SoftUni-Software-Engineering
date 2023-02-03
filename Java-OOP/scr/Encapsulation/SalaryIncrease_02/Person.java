package ValidationData_03;

public class Person {
    private String firstName;
    private String lastName;
    private int age;



    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
     public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        if(this.age>30){
            this.salary=salary+salary*percentage/100;
        }else{
            this.salary=salary+salary*percentage/200;
        }

    }


    @Override
    public String toString() {
        return String.format("%s %s gets %f", this.getFirstName(), this.getLastName(), this.salary);
    }
}


