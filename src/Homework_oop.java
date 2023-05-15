import animals.Cat;
import animals.Crocodile;

public class Homework_oop {
    public static void main(String[] args) {
        /** Сергей, здравствуйте!
        * Прошу прощения, немного не успел доделать домашку (геттеры/сеттеры)
        * Пока высылаю как есть, обязуюсь в самое ближайшее время доделать
        *  */
        // домашняя работа по проектированию классов
        // Cat tom = new Cat("кот", "Том");
        // tom.display();
        // Crocodile dandy = new Crocodile("крокодил", "Дэнди");
        // dandy.display();
        Cat myCat = new Cat("кот", "Том");
        System.out.println(myCat);
        Crocodile myCrocodile = new Crocodile("крокодил", "Дэнди");
        System.out.println(myCrocodile);
    }

}
