package ru.geekbrains.java_core_homework_6;

public class Animal {
    String name;

    public static int aCount = 0;

    public Animal(String name) {
        this.name = name;
        aCount++;
    }

    public void run(int length) {
        System.out.printf("Животное %s пробежало %s метров%n", name, length);
    }

    public void swim(int length) {
        System.out.printf("Животное %s проплыло %s метров%n", name, length);
    }

    public static void count() {
        System.out.printf("Количество животных: %s%n", aCount);
    }

}
