package ru.mirea.task4;

import java.util.Scanner;

public class Phone {
    public String number;
    public String model;
    public int weight;

    Phone(String num, int w, String name){
        number = num;
        weight = w;
        model = name;
    }

    Phone(String num, String mod){
        number = num;
        model = mod;
    }

    Phone(){}

    public void to_String(){
        System.out.println("Model: " + this.model);
        System.out.println("Number: " + this.number);
        System.out.println("Weight: " + this.weight);
    }

    public void receiveCall(String name){
        System.out.println("Calling on " + this.model + " " + name);
    }

    public void getNumber(){
        System.out.println("Number: " + this.number);
    }

    public void receiveCall(String name, String num){
        System.out.println("Calling " + name + " (" + num + ")");
    }

    /*public void sendMessage(String massive){
        for (int i = 0; i < massive.length(); i++){
            System.out.println("Message send to " + massive[i]);
        }
    }*/

    public static void main(String[] args){
        Phone iphone = new Phone("+79104708644", 156, "iPhone 11");
        Phone samsung = new Phone("+79038647482", 178, "Samsung Galaxy A50");
        Phone xiaomi = new Phone("+79167239229", 164, "Xiaomi Pro 11");

        iphone.to_String();
        samsung.to_String();
        xiaomi.to_String();

        iphone.receiveCall("Rozok");
        samsung.receiveCall("Maria");
        xiaomi.receiveCall("Kuwu");

        iphone.getNumber();
        samsung.getNumber();
        xiaomi.getNumber();

        iphone.receiveCall("Pearl", "+79166171919");

        /*System.out.print("Enter count of numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] mas = new String[n];
        for (int i = 0; i < mas.length; i++){
            System.out.print("Enter number: ");
            mas[i] = sc.next();
        }

        iphone.sendMessage(mas);*/
    }
}
