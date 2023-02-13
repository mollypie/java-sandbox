package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner timeToSecond = new Scanner(System.in);
        int value = timeToSecond.nextInt();
        int allSec = (value % 86400 == 0) ? 0 : value;
        int newSec = (value > 86400) ? (value - (86400 * (value / 86400))) : allSec;
        int receivedSeconds = (newSec >= 60) ? newSec % 60 : newSec;
        String finalSek = (receivedSeconds < 10) ? "0" + receivedSeconds : Integer.toString(receivedSeconds);
        int min = (newSec % 86400 == 0) ? 0 : newSec;
        int receivedMinutes = (min - receivedSeconds) / 60;
        int minutes = (receivedMinutes >= 60) ? receivedMinutes % 60 : receivedMinutes;
        String finalMin = (minutes < 10) ? "0" + minutes : Integer.toString(minutes);
        int finalHour = (value % 86400 == 0) ? 0 : (receivedMinutes - minutes) / 60;
        System.out.println(finalHour + ":" + finalMin + ":" + finalSek);
    }

}