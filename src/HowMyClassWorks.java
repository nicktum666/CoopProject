public class HowMyClassWorks {

    public static void main(String[] args) {

        Person tolya = new Person("Толя", 25, 125, 0);
        Person olya = new Person("Оля", 22, 50, 0);
        Person zhora = new Person("Жора", 45, 85, 0);
        tolya.changeIdByActivity(tolya);
        olya.changeIdByActivity(olya);
        zhora.changeIdByActivity(zhora);
        System.out.println(tolya.getName() + " " + tolya.getAge() + " " + tolya.getWeight() + " " + tolya.getId());
        System.out.println(olya.getName() + " " + olya.getAge() + " " + olya.getWeight() + " " + olya.getId());
        System.out.println(zhora.getName() + " " + zhora.getAge() + " " + zhora.getWeight() + " " + zhora.getId());
    }
}
