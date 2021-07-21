package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String l = "Dear <|name|> , Thanks a lot !";
        l=l.replace("<|name|>",name);
        System.out.println(l);

    }
}
