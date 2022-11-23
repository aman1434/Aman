package com.aman;

public class swap {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        swap1(a,b);


        //int temp=a;
       // a=b;
      //  b=temp;
       System.out.println("a="+a+"b ="+b);
    }
    static void swap1(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
}
