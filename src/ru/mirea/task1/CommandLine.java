package ru.mirea.task1;

public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg: " + args[i]);
        }
    }
}