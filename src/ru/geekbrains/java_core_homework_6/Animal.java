package ru.geekbrains.java_core_homework_6;

public class Animal {
    int length;

    public Animal() {

    }

    public void run(int length) {
        System.out.printf("Животное пробежало %s метров%n", length);
    }

    public void swim(int length) {
        System.out.printf("Животное проплыло %s метров%n", length);
    }

}
