package com.krykunenko.Homework1;
import java.util.Scanner;
public class task15 {
    public static void main( String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите катет 1");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите катет 2");
        int b = new Scanner(System.in).nextInt();
        // S = ab/2
        System.out.println( " S = " + a + "*" + b + "/" + "2 ");
        // c={\sqrt {a^{2}+b^{2}}}
        System.out.println( "c = " + Math.sqrt(a*a + b*b));
        System.out.println("Введите катет 3");
        int c = new Scanner(System.in).nextInt();
        // P= a + b + c
        System.out.println( "P=" + a + b + c );

}
    }
