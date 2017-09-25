package java03;

import java.util.Scanner;

public class es03_04_연속ifelse {
    public static void main(String[] args) {
        int x = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("점수:");
        x = keyboard.nextInt();
        
        System.out.println(x);
        
        if (x >= 90) {
            System.out.println("A");
        } else if (x >= 80) {
            System.out.println("B");
        } else if (x >= 70) {
            System.out.println("C");
        } else if (x >= 60) {
            System.out.println("D");
        } else {
        }
    }
}
