package ru.mirea.task3;

public class Circle {
    public int radius;
    public String colour;

    public Circle(int r, String c){
        radius = r;
        colour = c;
    }

    public int getRadius(){
        return radius;
    }

    public String getColour(){
        return colour;
    }

    public void setRadius(int r){
        radius = r;
    }

    public void setColour(String c){
        colour = c;
    }
}

class TestCircle{
    public static void main(String[] args){
        Circle c1 = new Circle(20, "red");
        System.out.println("Old radius: " + c1.getRadius());
        System.out.println("Old colour: " + c1.getColour());
        c1.setRadius(15);
        c1.setColour("green");
        System.out.println("New radius: " + c1.getRadius());
        System.out.println("New colour: " + c1.getColour());
    }
}