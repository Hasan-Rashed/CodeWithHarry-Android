package com.rashed.chapter2;

public class MyClass
{
    public static void main(String[] args)
    {
        String name = "Hasan Rashed";
        System.out.println(name);
        System.out.println("Hello World");

        int a = 75;
        int b = 4;
        System.out.println(a + b);

//        this is a single line comment;

        /*this is a multiline
            comment;*/

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(2));
        System.out.println(name.substring(5, 9));

        boolean b1 = 7 > 3;
        System.out.println(b1);
    }
}