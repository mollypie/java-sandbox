package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int way = 0;
        int day = 0;

        if (b > a || (a == b && b < h)) {
            System.out.println("Никогда");
            return;
        }

        while (way < h) {

            day++;
            way = way + a;

            if (way >= h) break;

            way -= b;
        };

        System.out.println(day);
    }
}