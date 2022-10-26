package ru.mirea.task13;

import java.util.Scanner;

public class iLike {
    public static void method(String str)
    {
        String example=str;
        char result1 = str.charAt(str.length()-1);
        boolean result2 = str.endsWith("!!!");
        boolean result3 = str.startsWith("I like");
        boolean result4 = str.contains("Java");
        int index1=str.indexOf("Java");
        int index2=index1+3;
        System.out.println("1 task: "+result1);
        System.out.println("2 task: "+result2);
        System.out.println("3 task: "+result3);
        System.out.println("4 task: "+result4);
        System.out.println("5 task: "+index1+" "+index2 );
        System.out.println("6 task: "+example.replace('o', 'a'));
        System.out.println("7 task: "+str.toUpperCase());
        System.out.println("8 task: "+str.toLowerCase());
        System.out.println("9 task: "+example.substring(0,7)+example.substring(11));
    }
    public static void main(String[] args)
    {
        String str;
        Scanner in = new Scanner(System.in);
        str="I like Java!!!";
        method(str);
    }
}
