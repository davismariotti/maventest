package com.davismariotti.maventest;

public class Main {
    public int addExceptEquals16(int a, int b) {
        int sum = a + b;
        if (sum == 16) throw new RuntimeException();
        else return sum;
    }
}
