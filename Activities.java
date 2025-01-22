

class Activities {

    //3 статических класса - Йога, Бокс и Бассейн
    //Кадждый статический класс имеет 4 метода - вход в секцию, начало занятий, конец занятий
    //и уменьшение веса
    //Классы одинаковые, структуру обьяснил только на основе йоги (Чтоб не повторятсья)
    static class YogaSection {
        public void enter(Person person) {
            //Получаем имя через геттер у персона
            System.out.println(person.getName() + " вошел в секцию йоги.");
        }

        public void startSession() {
            System.out.println("Сессия йоги началась.");
        }

        public void endSession(Person person) {
            //Получаем имя через геттер у персона
            System.out.println("Сессия йоги закончилась для " + person.getName() + ".");
        }

        public void reduceWeight(Person person) {
            //используем метод у персона и олучаем имя через геттер у персона
            person.reduceWeight(0.5);
            System.out.println(person.getName() + " потерял 0.5 кг после йоги.");
        }
    }

    static class BoxSection {
        public void enter(Person person) {
            System.out.println(person.getName() + " вошел в секцию бокса.");
        }

        public void startSession() {
            System.out.println("Сессия бокса началась.");
        }

        public void endSession(Person person) {
            System.out.println("Сессия бокса закончилась для " + person.getName() + ".");
        }

        public void reduceWeight(Person person) {
            person.reduceWeight(1.0);
            System.out.println(person.getName() + " потерял 1.0 кг после бокса.");
        }
    }

    static class PoolSection {
        public void enter(Person person) {
            System.out.println(person.getName() + " вошел в секцию плавания.");
        }

        public void startSession() {
            System.out.println("Сессия плавания началась.");
        }

        public void endSession(Person person) {
            System.out.println("Сессия плавания закончилась для " + person.getName() + ".");
        }

        public void reduceWeight(Person person) {
            person.reduceWeight(1.8);
            System.out.println(person.getName() + " потерял 1.8 кг после плавания.");
        }
    }
}
