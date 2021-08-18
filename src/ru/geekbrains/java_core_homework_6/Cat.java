package ru.geekbrains.java_core_homework_6;

public class Cat extends Animal { // Создание класса котов и наследование классу животных
    String name; // Переменная с именем

    public static int cCount = 0; // Статичная переменная для подсчёта количества котов

    public Cat(String name) { // При создании объекта класса кот задаётся имя
        super(name); // Обращение к члену суперкласса
        this.name = name; // Указание на соответствие полученного значения переменной класса
        cCount++; // Увеличение счётчика при вызове класса
    }

    @Override
    public void run(int length) { // Метод бега с расстоянием в качестве аргумента
        if (length <= 200) { // Заданы ограничения по расстоянию бега для котов
            System.out.printf("%s пробежал %s метров%n", name, length);
        } else {
            System.out.printf("%s не сможет пробежать %s метров%n", name, length);
        }
    }

    @Override
    public void swim(int length) { // Метод плаванья с расстоянием в качестве аргумента
        System.out.printf("%s не умеет плавать%n", name);
    }

    public static void count() { // Статичный метод, выводящий количество котов
        System.out.printf("Количество котов: %s%n", cCount);
    }
}
