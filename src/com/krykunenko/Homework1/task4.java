package com.krykunenko.Homework1;

import java.util.Scanner;

public class task4 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Введите ваш вес") ;
        // P = m * g
        // g = 17% / 100 = 0.17
        System.out.println( "Ваш вес равен" + sc.nextDouble() * 0.17);
    }

    }

