package ru.geekbrains.java_core_homework_6;

public class Dog extends Animal {
    String name;

    public static int dCount = 0;

    public Dog(String name) {
        super(name);
        this.name = name;
        dCount++;
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.printf("%s пробежал %s метров%n", name, length);
        } else {
            System.out.printf("%s не сможет пробежать %s метров%n", name, length);
        }

    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.printf("%s проплыл %s метров%n", name, length);
        } else {
            System.out.printf("%s не сможет проплыть %s метров%n", name, length);
        }

    }

    public static void count() {
        System.out.printf("Количество собак: %s%n", dCount);
    }
}
