package com.krykunenko.Homework1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in);
        System.out.println( "Введите целое число");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println("а");
        } else {
            System.out.println("b");

        }
    }
}
