package ru.mirea.task2;

public class Shape {
    public String type;
    public Shape(String s){
        type = s;
    }

    public String toString(){
        return ("Shape type = " + type);
    }
}

class TestShape{
    public static void main(String[] args){
        Shape circle = new Shape("circle");
        System.out.print(circle.toString());
    }
}