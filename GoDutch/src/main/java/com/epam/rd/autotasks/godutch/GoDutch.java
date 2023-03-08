package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bill = scanner.nextInt();
        int people = scanner.nextInt();

        if (bill >= 0) {
            if (people > 0) {
                System.out.println((bill + bill*10/100)/people);
            } else {
                System.out.println("Number of friends cannot be negative or zero");
            }
        } else {
            System.out.println("Bill total amount cannot be negative");
        }
    }
}
