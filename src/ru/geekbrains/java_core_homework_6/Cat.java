package ru.geekbrains.java_core_homework_6;

public class Cat extends Animal {
    String name;

    public static int cCount = 0;

    public Cat(String name) {
        super(name);
        this.name = name;
        cCount++;
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.printf("%s пробежал %s метров%n", name, length);
        } else {
            System.out.printf("%s не сможет пробежать %s метров%n", name, length);
        }
    }

    @Override
    public void swim(int length) {
        System.out.printf("%s не умеет плавать%n", name);
    }

    public static void count() {
        System.out.printf("Количество котов: %s%n", cCount);
    }
}
