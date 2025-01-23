import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // Создаем объекты секций

        // Создаем ArrayList
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Анна", 25, 65.0));
        people.add(new Person("Борис", 30, 80.0));
        people.add(new Person("Вера", 28, 58.0));
        people.add(new Person("Григорий", 35, 90.0));
        people.add(new Person("Дарья", 22, 55.0));
        people.add(new Person("Евгений", 40, 85.0));
        people.add(new Person("Жанна", 27, 62.0));
        people.add(new Person("Захар", 33, 78.0));
        people.add(new Person("Ирина", 29, 60.0));

        // Создаем HashMap
        HashMap<String, ArrayList<Person>> sections = new HashMap<>();
        sections.put("Йога", new ArrayList<>());
        sections.put("Бокс", new ArrayList<>());
        sections.put("Бассейн", new ArrayList<>());

        // Распределяем людей по секциям и проводим тренировки
        Activities activities = new Activities();

        for (Person person : people) {
            // Распределяем человека в соответствующий список
            switch (person.getId()) {
                case 1 -> sections.get("Йога").add(person);
                case 2 -> sections.get("Бокс").add(person);
                case 3 -> sections.get("Бассейн").add(person);
            }
            // Проводим тренировку
            activities.SectionDecider(person);
        }

        // Вывод
        System.out.println("Итоговое распределение по секциям:");
                for (String section : sections.keySet()) {
                    System.out.println("\nВ секции " + section + ":");
                    for (Person person : sections.get(section)) {
                        System.out.println(person.getName());
                    }
                }
    }
}