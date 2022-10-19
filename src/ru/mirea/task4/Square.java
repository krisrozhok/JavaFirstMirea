package ru.mirea.task4;

public class Square extends Rectangle{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        this.side = side;
        super.color = color;
        super.filled = filled;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea(){
        return 0;
    };

    public double getPerimeter(){
        return 0;
    };
    @Override
    public String toString() {
        return "Square: color = " + color + ", filled = " + filled + ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
