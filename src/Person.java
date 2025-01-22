import java.util.Random;

public class Person {

    static Random random = new Random();

    private String name;
    private int age;
    private double weight;
    private int id;


    Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.id = changeIdByActivity();
    }


    public static int changeIdByActivity() {
        return random.nextInt(3) + 1;
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

    public void reduceWeight(double amount) {
        this.weight -= amount;
    }
}
