package zoo.entities.areas;

import zoo.common.ExceptionMessages;
import zoo.entities.animals.Animal;
import zoo.entities.foods.Food;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseArea implements Area{
    private String name;
    private int capacity;
    private Collection<Food>foods;
 private  Collection<Animal> animals;
    int sum=0;

    public BaseArea(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.foods = new ArrayList<>();
        this.animals = new ArrayList<>();
    }

    public BaseArea(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Collection<Animal> getAnimals() {
        return animals;
    }

    @Override
    public Collection<Food> getFoods() {
        return foods;
    }

    @Override
    public int sumCalories(){
       // for (Food food : foods) {
       //     sum+=food.getCalories();
     //   }
      //  return sum;
       return foods.stream().mapToInt(Food::getCalories).sum();
    }

    @Override
    public void addAnimal(Animal animal) {
        if(capacity> animals.size()){
            animals.add(animal);
        }else{
            throw new IllegalArgumentException(ExceptionMessages.NOT_ENOUGH_CAPACITY);
        }

    }

    @Override
    public void removeAnimal(Animal animal) {
        animals.remove(animal);

    }

    @Override
    public void addFood(Food food) {
        foods.add(food);

    }

    @Override
    public void feed() {
        animals.forEach(Animal::eat);

    }

    @Override
    public  String getInfo(){
        String animalOutput = animals.isEmpty()
                ?"none"
                :animals.stream().map(Animal::getName).collect(Collectors.joining(" "));
      return  String.format("%s (%s):%n" + "Animals: %s%n"+"Foods: %d%n"+"Calories: %d",name, getClass().getSimpleName(),animalOutput, foods.size(),sumCalories());


    }

    public void setName(String name) {
        if(name==null||name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.AREA_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
}
