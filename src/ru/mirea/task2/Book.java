package ru.mirea.task2;

public class Book {
    public String name;
    public Book(String s){
        name = s;
    }

    public String toString(){
        return ("Book name = " + name);
    }
}

class TestBook{
    public static void main(String[] args){
        Book fnaf = new Book("FNAF: Silver eyes");
        System.out.print(fnaf.toString());
    }
}