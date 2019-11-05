package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sex(man,woman)");
        String s = scanner.next();
        while (s.matches("man")==false&&s.matches("woman")==false){
            System.out.println("enter sex(man,woman)");
            s = scanner.next();
        }
        if(s.matches("man")){
            System.out.println("enter the age");
            int age = scanner.nextInt();
            if(age<18){
                System.out.println("you can't marry");
            }
            else {
                System.out.println("you can marry");
            }
        }
        if(s.matches("woman")){
            System.out.println("enter the age");
            int age = scanner.nextInt();
            if(age<16){
                System.out.println("you can't marry");
            }
            else {
                System.out.println("you can marry");
            }
        }
    }
}