package aman;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner sc=new Scanner(System.in);
        /*int ros[]= new int[5];
        //array of primitives
        //System.out.println(ros[1]);
//String arr[]=new String[4];
     //   System.out.println(arr[0]);
        ros[1]=23;
        ros[2]=67;
        ros[3]=45;
       // System.out.println(ros[3]);
        //input using loops
        for(int i=0;i<ros.length;i++)
        {
            ros[i]=sc.nextInt();
        }
        for(int i=0;i<ros.length;i++)
        {
            System.out.println(ros[i]);
        }
        System.out.println(Arrays.toString(ros));
        */
        String str[]= new String[4];
        for(int i=0;i<str.length;i++)
        {
            str[i]=sc.next();

        }
        System.out.println(Arrays.toString(str));
        //modify
        str [1]="Aa";
        System.out.println(Arrays.toString(str));

    }
}
