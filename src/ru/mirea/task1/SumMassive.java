package ru.mirea.task1;

import java.util.Scanner;

public class SumMassive {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] mat = new int[5];
        int count = 0;
        System.out.print("Enter 5 numbers:\n");
        for(int i=0; i<mat.length; i++){
            mat[i] = sc.nextInt();
            count += mat[i];
        }
        System.out.println("Count: " + count);
    }
}
