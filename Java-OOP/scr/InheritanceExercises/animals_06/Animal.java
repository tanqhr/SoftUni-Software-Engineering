package animals;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    protected abstract String produceSound();

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.trim().length()>0){
        this.name = name;
    }else {
            throw new IllegalArgumentException("Invalid input!");
        }
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("Female") || gender.equals("Male")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }


    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName()+"%n"+ this.getName()+" "+ this.getAge()+" "+ this.getGender()+"%n"+ produceSound());
    }
}
