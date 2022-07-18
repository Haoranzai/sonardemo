package com.example.sonardemo.control;

import java.sql.SQLOutput;

public class testController {
public void LoopNumber()
{
int[] array = new int[10];
for(int i=0;i<10;i++)
{
System.out.println(i);
array[i+2]=i;
}
    for(int i=0;i<10;i++)
    {
        System.out.println(array[i]);
    }
    }
}


