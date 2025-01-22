import java.util.Random;

public class HowMyClassWorks {

    static Random random = new Random();

    public static void main(String[] args) {

        Activities.YogaSection yogaSection = new Activities.YogaSection();
        Activities.BoxSection boxSection = new Activities.BoxSection();
        Activities.PoolSection poolSection = new Activities.PoolSection();

        Person tolya = new Person("Толя", 25, 125);
        Person olya = new Person("Оля", 22, 50);
        Person zhora = new Person("Жора", 45, 85);

        yogaSection.enter(tolya);
        yogaSection.startSession();
        yogaSection.endSession(tolya);
        yogaSection.reduceWeight(tolya);
    }


}
