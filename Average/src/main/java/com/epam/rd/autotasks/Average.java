package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int total = 0, count = 0;
        while (n != 0) {
            total += n;
            count++;
            n = scanner.nextInt();
        }
        System.out.println(total/count);
    }

}