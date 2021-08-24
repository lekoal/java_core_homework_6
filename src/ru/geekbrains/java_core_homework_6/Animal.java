package ru.geekbrains.java_core_homework_6;

public class Animal { // Создание суперкласса животных
    String name; // Переменная с именем

    public static int aCount = 0; // Статичная переменная для подсчёта количества животных

    public Animal(String name) { // При создании объекта класса животное задаётся имя
        this.name = name; // Указание на соответствие полученного значения переменной класса
        aCount++; // Увеличение счётчика при вызове класса
    }

    public void run(int length) { // Метод бега с расстоянием в качестве аргумента
        System.out.printf("Животное %s пробежало %s метров%n", name, length); // Сообщение с именем и расстоянием
    }

    public void swim(int length) { // Метод плаванья с расстоянием в качестве аргумента
        System.out.printf("Животное %s проплыло %s метров%n", name, length); // Сообщение с именем и расстоянием
    }

    public static void count() { // Статичный метод, выводящий количество животных
        System.out.printf("Количество животных: %s%n", aCount);
    }

}
