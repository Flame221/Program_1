package com.yourname;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи день недели");
        String day = s.nextLine();
        switch (day) {
            case "Понедельник":
            case "Пятница":
                System.out.println("Сегодня должны быть курсы. Который час?");
                break;
            default:
                System.out.println("Сегодня курсов нет");
        }
        int time = s.nextInt();

        if (time == 18 || time == 19 || time == 20) {
            System.out.println("Сейчас идут курсы");
        } else {
            System.out.println("Сейчас курсы не идут");
        }


    }

}
