package ru.geekbrains.java_core_homework_6;

public class Dog extends Animal { // Создание класса собак и наследование классу животных
    String name; // Переменная с именем

    public static int dCount = 0; // Статичная переменная для подсчёта количества собак

    public Dog(String name) { // При создании объекта класса собака задаётся имя
        super(name); // Обращение к члену суперкласса
        this.name = name; // Указание на соответствие полученного значения переменной класса
        dCount++; // Увеличение счётчика при вызове класса
    }

    @Override
    public void run(int length) { // Метод бега с расстоянием в качестве аргумента
        if (length <= 500) { // Заданы ограничения по расстоянию бега для собак
            System.out.printf("%s пробежал %s метров%n", name, length);
        } else {
            System.out.printf("%s не сможет пробежать %s метров%n", name, length);
        }

    }

    @Override
    public void swim(int length) { // Метод плаванья с расстоянием в качестве аргумента
        if (length <= 10) { // Заданы ограничения по расстоянию плаванья для собак
            System.out.printf("%s проплыл %s метров%n", name, length);
        } else {
            System.out.printf("%s не сможет проплыть %s метров%n", name, length);
        }

    }

    public static void count() { // Статичный метод, выводящий количество собак
        System.out.printf("Количество собак: %s%n", dCount);
    }
}
