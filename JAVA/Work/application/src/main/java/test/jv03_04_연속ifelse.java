package test;

import java.util.Scanner;

public class jv03_04_연속ifelse {
    public static void main(String[] args) {
        int x = 80;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("점수를 입력하시오:");
        x = keyboard.nextInt();
        
        if (x >= 90) {
            System.out.println("A");
        } else if (x >= 80) {
            System.out.println("B");
        } else if (x >= 70) {
            System.out.println("C");
        } else if (x >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
    }
}
