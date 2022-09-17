package ru.mirea.task3;

public class Book {
    public int year;
    public String author;
    public String name;
    public String publisher;

    public Book(int y, String a, String n, String p){
        year = y;
        author = a;
        name = n;
        publisher = p;
    }

    public int getYear(){
        return year;
    }

    public String getAuthor(){
        return author;
    }

    public String getName(){
        return name;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setYear(int y){
        year = y;
    }

    public void setName(String n){
        name = n;
    }

    public void setAuthor(String a){
        author = a;
    }

    public void setPublisher(String p){
        publisher = p;
    }
}

class TestBook{
    public static void main(String[] args) {
        Book b1 = new Book(2017, "Scott Cawthon", "FNAF: Silver Eyes", "Popcorn Books");
        System.out.println("Name: " + b1.getName());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Year: " + b1.getYear());
        System.out.println("Publisher: " + b1.getPublisher());
        b1.setPublisher("Exmo");
        System.out.println("New publisher: " + b1.getPublisher());
    }
}
