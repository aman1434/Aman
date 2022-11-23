package com.aman;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
       sum();
       sum();
    }
   static void sum(){
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println(+sum);
    }
}
