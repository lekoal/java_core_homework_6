package ru.geekbrains.java_core_homework_6;

public class Main {

    public static void main(String[] args) {
        Animal bobik = new Dog("Бобик");
        bobik.run(400);
        bobik.swim(20);

        Animal sharik = new Dog("Шарик");
        sharik.run(600);
        sharik.swim(5);

        Animal reks = new Dog("Рекс");
        reks.run(150);
        reks.swim(5);

        Animal pushok = new Cat("Пушок");
        pushok.run(100);
        pushok.swim(5);

        Animal belyash = new Cat("Беляш");
        belyash.run(300);
        belyash.swim(20);

        Animal chernysh = new Animal("Черныш");
        chernysh.run(100);

        Animal.count();
        Dog.count();
        Cat.count();
    }
}
