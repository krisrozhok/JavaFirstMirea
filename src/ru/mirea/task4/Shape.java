package ru.mirea.task4;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public double getArea(){
        return 0;
    };

    public double getPerimetr(){
        return 0;
    };

    @Override
    public String toString() {
        return "Shape: " + "color = " + color + ", filled = " + filled;
    }
}
