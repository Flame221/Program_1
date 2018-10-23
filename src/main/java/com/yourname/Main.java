package com.yourname;

import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введи день недели");
        String day = s.nextLine();
        switch(day){
            case "Понедельник" :
                System.out.println("Сегодня должны быть курсы. Который час?");
                break;
            case "Пятница" :
                System.out.println("Сегодня должны быть курсы. Который час?");
                break;
                default:
                    System.out.println("Сегодня курсов нет");}
                    Scanner scanner = new Scanner(System.in);
                    int time = scanner.nextInt();
                     switch(time){
                         case 18 :
                             System.out.println("Сейчас начало курсов");
                             break;
                         case 19 :
                             System.out.println("Сейчас идут курсы");
                             break;
                         case 20 :
                             System.out.println("Сейчас конец курсов");
                             break;
                             default:
                                 System.out.println("Сейчас курсы не идут");
                     }



    }

}