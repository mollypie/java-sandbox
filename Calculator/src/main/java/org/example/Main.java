package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sameText = new Scanner(System.in);

        float firstNum = 0;
        float secondNum = 0;
        String symbol = "";

        System.out.print("Введите первое число: ");
        firstNum = sameText.nextInt();

        do {
            System.out.print("Введите математический символ: ");
            symbol = sameText.next();
        }
        while (!symbol.equals("+") && !symbol.equals("-") && !symbol.equals("*") && !symbol.equals("/"));

        System.out.print("Введите второе число: ");
        secondNum = sameText.nextInt();

        if(symbol.equals("/") & secondNum == 0) {
            do {
                System.out.print("На ноль делить нельзя, введите другое число: ");
                secondNum = sameText.nextInt();
            }
            while (secondNum == 0);
        }
        float itog = Calculate(firstNum, secondNum, symbol);
        System.out.print("Ваш результат: " + itog);
    }

    public static float Calculate(float firstNum, float secondNum, String symbol){

        switch(symbol) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                return firstNum / secondNum;
            default:
                return 0;
        }
    }
}