package com.rashed.chapter2;

public class Functions
{
    public static double avg(int a, int b, int c)
    {
        return (a + b + c) / 3.0;
    }
    public static void main(String[] args)
    {
        int i, i1, i2;
        i = 65;
        i1 = 5;
        i2 = 78;
        System.out.println(avg(1, 3, 4));

        ClassEx classEx = new ClassEx();
        classEx.method1();
        classEx.settter(5, 12);
        System.out.println(classEx.getter());

        ClassEx2 classEx2 = new ClassEx2();
        classEx2.method1();
        classEx2.method2();
        classEx2.settter(7, 12);
        System.out.println(classEx2.getter());
    }
}
