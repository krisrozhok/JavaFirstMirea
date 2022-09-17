package ru.mirea.task2;
import java.lang.*;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Kuki", 3);
        Dog dog2 = new Dog("Lulu", 13);
        Dog dog3 = new Dog("Shindo", 9);

        System.out.println("Name: " + dog1.getName() + ", age: " + dog1.getAge() + ", human age: " + dog1.realAge());
        System.out.println("Name: " + dog2.getName() + ", age: " + dog2.getAge() + ", human age: " + dog2.realAge());
        System.out.println("Name: " + dog3.getName() + ", age: " + dog3.getAge() + ", human age: " + dog3.realAge());
    }
}