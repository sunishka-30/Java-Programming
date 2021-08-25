package com.company;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result = palindromeString(s);
        if (!result) {

            System.out.println("Not palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }
    static boolean palindromeString(String s) {
        boolean result = false;
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            result = s.charAt(i) == s.charAt(j);
            i++;
            j--;
        }
        return result;
    }
}
