package com.krykunenko.Homework1;

import java.util.Scanner;

public class task12 {
    public static void main ( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите расстояние до места назначения (N)");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите время до места назначения (N)");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Скорость равна:" + number + "/" + number1 + "=" + String.valueOf(number/ number1));
    }
}
