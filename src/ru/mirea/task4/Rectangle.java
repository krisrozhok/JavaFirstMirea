package ru.mirea.task4;

public class Rectangle extends Shape{
    protected double width;
    protected double lenght;

    public Rectangle() {}

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public double getArea(){
        return 0;
    };

    public double getPerimeter(){
        return 0;
    };

    @Override
    public String toString() {
        return "Rectangle: " + "color = " + color + ", filled = " + filled + ", Area = " + getArea() + ", Perimeter = "
                + getPerimeter();
    }
}
