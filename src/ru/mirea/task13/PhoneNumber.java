package ru.mirea.task13;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args)
    {
        String str;
        char c0;
        Scanner in = new Scanner(System.in);
        str=in.nextLine();
        c0=str.charAt(0);
        if(c0=='+')
        {
            System.out.println("Country code: "+str.substring(0,str.length()-10));
            System.out.println("Three numbers: "+str.substring(str.length()-10,str.length()-7));
            System.out.println("First four numbers: "+str.substring(str.length()-7,str.length()-4));
            System.out.println("Second four numbers: "+str.substring(str.length()-4,str.length()));
            System.out.println(str.substring(0,str.length()-10)+str.substring(str.length()-10,str.length()-7)+"-"+str.substring(str.length()-7,str.length()-4)+"-"+str.substring(str.length()-4,str.length()));
        }
        else
        {
            System.out.println("Country code: "+str.substring(0,str.length()-10));
            System.out.println("Three number: "+str.substring(str.length()-10,str.length()-7));
            System.out.println("First four numbers: "+str.substring(str.length()-7,str.length()-4));
            System.out.println("Second four numbers: "+str.substring(str.length()-4,str.length()));
            System.out.println(str.substring(0,str.length()-10)+str.substring(str.length()-10,str.length()-7)+"-"+str.substring(str.length()-7,str.length()-4)+"-"+str.substring(str.length()-4,str.length()));
        }
    }
}
