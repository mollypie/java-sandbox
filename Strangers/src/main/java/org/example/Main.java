package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        if (count == 0) {
            System.out.println("Оу... Похоже здесь никого...");
        } else if (count < 0) {
            System.out.println("Серьезно? А что так негативно?");
        } else {
            for (int i = 0; i < count; i++) {
                String guest = scanner.next();
                System.out.println("Привет, " + guest);
            }
        }
    }
}