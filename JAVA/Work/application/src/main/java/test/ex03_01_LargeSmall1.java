package test;

import java.util.Scanner;

public class ex03_01_LargeSmall1 {
    public static void main (String[] args){
        int n = 101;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("점수를 입력하시오:");
        n = keyboard.nextInt();
        
        
        if(n >=100) {
            System.out.println("Large");
        }
        else {
            System.out.println("small");
        }
        
    }
    
}
