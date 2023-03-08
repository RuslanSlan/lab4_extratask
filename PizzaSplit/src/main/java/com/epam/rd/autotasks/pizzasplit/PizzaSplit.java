package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = scanner.nextInt();
        int splits = scanner.nextInt();
        int i = 0;

        while (true) {
            i++;
            if ((splits*i) % people == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
