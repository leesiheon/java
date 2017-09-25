package test;

import java.util.Scanner;

public class jv_test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("점수입력:");
        int x = keyboard.nextInt();
        
        System.out.println();
        
        if (x > 90) {
            System.out.println("A");
        } else if (x > 80) {
            System.out.println("B");
        } else if (x > 70) {
            System.out.println("C");
        } else if (x > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }   
    }
}
