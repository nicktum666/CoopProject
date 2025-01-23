

public class Activities2 {
    public void SectionDecider (Person person) {
        //Йога = 1, Бокс = 2, Бассейн = 3
        if (person.getId() == 1) {
            System.out.println(person.getName() + " вошел в секцию йоги.");
            System.out.println("Сессия йоги началась.");
            System.out.println("Сессия йоги закончилась для " + person.getName() + ".");
            person.reduceWeight(0.5);
            System.out.println(person.getName() + " потерял 0.5 кг после йоги.");
            System.out.println("\n");
        } else if (person.getId() == 2) {
            System.out.println(person.getName() + " вошел в секцию бокса.");
            System.out.println("Сессия бокса началась.");
            System.out.println("Сессия бокса закончилась для " + person.getName() + ".");
            person.reduceWeight(1.0);
            System.out.println(person.getName() + " потерял 1.0 кг после бокса.");
        } else if (person.getId() == 3) {
            System.out.println(person.getName() + " вошел в секцию плавания.");
            System.out.println("Сессия плавания началась.");
            System.out.println("Сессия плавания закончилась для " + person.getName() + ".");
            person.reduceWeight(1.8);
            System.out.println(person.getName() + " потерял 1.8 кг после плавания.");
        }
    }
}
