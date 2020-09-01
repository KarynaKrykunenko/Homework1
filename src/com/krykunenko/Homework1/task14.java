package com.krykunenko.Homework1;

import java.util.Scanner;

public class task14 {
    public static void main( String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс гривны");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите количество гривен");
        double b = new Scanner(System.in).nextDouble();
        System.out.println( " Вы можете купить:" + convert(a,b));
    }
    private static String convert(double a, double b) {
        return null;
    }
}
