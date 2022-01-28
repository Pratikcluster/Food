package com.jubilient;

public class Jubilientfood {
    int a = 10;
    int b = 20;
    int c = 300;

    void add() {
        int A = a+b;
        System.out.println(A);
    }
    void minus() {
        int B = c-a;
        System.out.println(B);
    }
    void Multiply() {
        int C = a*b;
        System.out.println(C);
    }

    public static void main(String[] args) {
        Jubilientfood F = new Jubilientfood();
        F.a = 110;
        F.b = 220;
        F.c = 330;
        System.out.println(F.a);
        System.out.println(F.b);
        System.out.println(F.c);
        F.add();
        F.minus();
        F.Multiply();
    }
}