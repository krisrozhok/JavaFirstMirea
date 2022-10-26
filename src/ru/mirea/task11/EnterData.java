package ru.mirea.task11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class EnterData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH); // 0 to 11
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        SimpleDateFormat sdf = new SimpleDateFormat("E,yyyy MMMM dd 'at' HH-mm a z");
        System.out.println("Formate 1:"+ sdf.format(cal.getTime()));
        SimpleDateFormat sdf1 = new SimpleDateFormat("E,yyyy MMMM dd 'at' HH.mm a z");
        System.out.println("Formate 2:"+ sdf1.format(cal.getTime()));
        SimpleDateFormat sdf2 = new SimpleDateFormat("E,MMMM dd, HH");
        System.out.println("Formate 3:"+ sdf2.format(cal.getTime()));
    }
}
