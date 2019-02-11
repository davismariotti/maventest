package com.davismariotti.maventest;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is a test.");
    }

    public int addExceptEquals16(int a, int b) {
        int sum = a + b;
        if (sum == 16) throw new RuntimeException();
        else return sum;
    }
}
