package ru.geekbrains.java_core_homework_6;

public class Main {

    public static void main(String[] args) {
        Animal bobik = new Dog("Бобик"); // Создание объекта классов Dog с присвоением имени
        bobik.run(400); // Вызов метода run класса Dog с передачей расстояния
        bobik.swim(20); // Вызов метода swim класса Dog с передачей расстояния

        Animal sharik = new Dog("Шарик");
        sharik.run(600);
        sharik.swim(5);

        Animal reks = new Dog("Рекс");
        reks.run(150);
        reks.swim(5);

        Animal pushok = new Cat("Пушок"); // Создание объекта класса Cat с присвоением имени
        pushok.run(100); // Вызов метода run класса Cat с передачей расстояния
        pushok.swim(5); // Вызов метода swim класса Cat с передачей расстояния

        Animal belyash = new Cat("Беляш");
        belyash.run(300);
        belyash.swim(20);

        Animal chernysh = new Animal("Черныш"); // Создание объекта класса Animal с присвоением имени
        chernysh.run(100); // Вызов метода run класса Animal с передачей расстояния

        Animal.count(); // Вызов метода, подсчитывающего количество животных
        Dog.count(); // Вызов метода, подсчитывающего количество собак
        Cat.count(); // Вызов метода, подсчитывающего количество кошек
    }
}
