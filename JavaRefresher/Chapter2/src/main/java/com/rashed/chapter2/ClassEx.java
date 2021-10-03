package com.rashed.chapter2;

public class ClassEx
{
    private int a, b;
    public void method1()
    {
        System.out.println("I am method 1");
    }

    public void settter(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int getter()
    {
        return a * b;
    }
}
