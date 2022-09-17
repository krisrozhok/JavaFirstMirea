package ru.mirea.task2;

public class Ball {
    public String color;
    public Ball(String s){
        color = s;
    }

    public String toString(){
        return ("Ball color = " + color);
    }
}

class TestBall{
    public static void main(String[] args){
        Ball ball1 = new Ball("red");
        System.out.print(ball1.toString());
    }
}