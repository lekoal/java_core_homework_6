package ru.geekbrains.java_core_homework_6;

public class Cat extends Animal {
   public Cat(String name, int length) {
       this.length = length;
   }
    @Override
    public void run(int length) {
        System.out.printf("Кот пробежал %s метров", length);
    }
}
