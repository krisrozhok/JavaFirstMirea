package ru.mirea.task13;

import java.util.Scanner;

public class Person {
    public String Surname;
    public String Name;
    public String Patronymic;
    public String getSurname() {
        return Surname;
    }
    public void setSurname(String surname) {
        Surname = surname;
    }
    public String getName() {
        if(Name!=null)return Name;
        else return "";
    }
    public void setName(String name) {
        Name = name;
    }
    public String getPatronymic() {
        if(Patronymic!=null)return Patronymic;
        else return "";
    }
    public void setPatronymic(String otchestvo) {
        Patronymic = otchestvo;
    }
    public static void main(String[] args)
    {
        Person ms1=new Person();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name:");
        ms1.Name=in.nextLine();
        System.out.println("Enter surname:");
        ms1.Surname=in.nextLine();
        System.out.println("Enter patronymic:");
        ms1.Patronymic=in.nextLine();
        System.out.println(ms1.getName());
        System.out.println(ms1.getSurname());
        System.out.println(ms1.getPatronymic());
    }
}
