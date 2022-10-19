package ru.mirea.task4;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", true, 6);
        System.out.println(circle.toString());
        System.out.println();
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");
        rectangle.setWidth(4);
        rectangle.setLenght(5);
        System.out.println(rectangle.toString());
        System.out.println();
        Square square = new Square("Purple", true, 25);
        System.out.println(square.toString());
    }
}
