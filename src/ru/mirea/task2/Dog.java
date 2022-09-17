package ru.mirea.task2;

public class Dog {
    public String name;
    public int age;

    public Dog(String n, int a){
        name = n;
        age = a;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public int realAge(){
       return (age*7);
    }
    public String toString(){
        return ("Name: " + name + ", age: " + age);
    }
}
