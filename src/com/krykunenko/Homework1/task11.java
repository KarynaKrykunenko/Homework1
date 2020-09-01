package com.krykunenko.Homework1;

import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = new Scanner(System.in).nextInt();
        for (int a = 1; a <= 10; a++) {
            System.out.println(number + "*" + a + "=" + number * a);
        }
    }
}
