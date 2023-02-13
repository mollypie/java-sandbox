package org.example;

import java.util.Scanner;

public class Main {
    final static int PASSWORD = 133976;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass = input.nextInt();
        if (pass == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }

}