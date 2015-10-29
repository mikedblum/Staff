package com.alterkacker.Staff;

/**
 * Created by mblum on 10/28/15.
 */
public class OverLine {
    public static void main(String argv[])throws  Exception{
        System.out.print("hello");
        Thread.sleep(2000);
//        System.out.print(String.format("\033[%dA",1)); // Move up
//        System.out.p2int("\033[2K"); // Erase line content
        System.out.print("\b\b\b\b\b      world");
        Thread.sleep(2000);
        System.out.print("\r                   again");
        System.out.flush();
    }
}
