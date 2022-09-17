package ru.mirea.task1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int result = 1;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        System.out.print("Factorial: " + result);
    }
}
