//package com.company;
import java.util.Scanner;
public class DetectSpaces {
    public static void main(String args[])
    { Scanner sc = new Scanner(System.in);
       String s = sc. nextLine();
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("   "));
    }
}
