package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Jackie";
        names[1] = "Kianu";
        names[2] = "Statham";

        switch (names[0]) {
            case "Jackie":
                System.out.println("Доброе утро! " + names[0]);
                break;
            case "Kianu":
                System.out.println("Доброе утро! " + names[1]);
                break;
            case "Statham":
                System.out.println("Доброе утро! " + names[2]);
                break;
        }
        switch (names[1]) {
            case "Jackie":
                System.out.println("Добрый день ! " + names[0]);
                break;
            case "Kianu":
                System.out.println("Добрый день! " + names[1]);
                break;
            case "Statham":
                System.out.println("Добрый день! " + names[2]);
                break;
        }
        switch (names[2]) {
            case "Jackie":
                System.out.println("Добрый вечер ! " + names[0]);
                break;
            case "Kianu":
                System.out.println("Добрый вечер! " + names[1]);
                break;
            case "Statham":
                System.out.println("Добрый вечер! " + names[2]);
                break;
        }
    }


}

