import java.util.Random;

public class Person {

    Random random = new Random();

    private String name;
    private int age;
    private double weight;
    private int id;

    Person(String name, int age, double weight, int id) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.id = id;
    }

    public void changeIdByActivity(Person x) {
        x.id = random.nextInt(3) + 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }
}
