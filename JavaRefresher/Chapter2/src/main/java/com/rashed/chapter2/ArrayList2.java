package com.rashed.chapter2;
import java.util.ArrayList;
public class ArrayList2
{
    public static void main(String[] args)
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add(4);
        arrayList.add("array list");
        arrayList.add(12);

        for (Object o: arrayList)
        {
            System.out.println("Object o: " + o);
        }
    }
}
