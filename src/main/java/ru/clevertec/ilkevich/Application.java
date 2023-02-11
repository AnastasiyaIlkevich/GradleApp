package ru.clevertec.ilkevich;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;


public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter some number -> ");

        System.out.println(isPositiveNumber(sc.nextLine()));

    }

    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str) && Integer.parseInt(str) >= 0;
    }


}
