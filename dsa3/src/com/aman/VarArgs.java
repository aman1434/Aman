package com.aman;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,65,75,34,56,78);
        multiple(2,3,"kunal","aman");
    }
    static void multiple(int a,int b,String ...v){

    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
