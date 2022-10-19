package ru.mirea.task4;

import java.util.Scanner;

public class Matrix {

    public float[][] mat1 = {
            {1,2,3},
            {3,4,5},
            {5,6,7}
    };

    public float[][] mat2 = {
            {1,2,3},
            {3,4,5},
            {5,6,7}
    };

    public void output(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void add(){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                mat1[i][j] += mat2[i][j];
            }
        }
    }

    public void multi(float x){
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                mat1[i][j] *= x;
            }
        }
    }

    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        Matrix matrix = new Matrix();
        matrix.output();
        System.out.println();
        matrix.add();
        matrix.output();
        System.out.print("Enter number: ");
        float x = sc.nextFloat();
        matrix.multi(x);
        matrix.output();
    }
}
