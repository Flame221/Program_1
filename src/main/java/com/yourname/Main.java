package com.yourname;

public class Main {public static void main(String [] args) {
    byte b = 2;
    int i = 2048;
    long l = 204825690;
    float f = 232.54f;
    double d = 1321.23145;
    char ch = 'C';
    int d1 = (int) d;
    byte v = (byte) l;
     String str = "Your number is ";
    System.out.print(str + (b + d1)+ " and "+ (l - i/200) + v + "." );
    System.out.print(" Your variant is " + ch);
}
}
