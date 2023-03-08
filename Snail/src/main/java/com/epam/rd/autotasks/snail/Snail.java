package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int total = 0;
        int day = 0;

        if (a - b > 0 || a >= h) {
            while (total + a < h) {
                day++;
                total += a - b;
            }
            day++;
            System.out.println(day);
        } else {
            System.out.println("Impossible");
        }
    }
}
