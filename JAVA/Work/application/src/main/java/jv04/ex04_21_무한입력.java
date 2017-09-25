package jv04;

import java.util.Scanner;

public class ex04_21_무한입력 {
    public static void main(String[] args) {
        
        int x =0;
        Scanner keyboard = new Scanner(System.in);

        
        for (int i = 0; true; i = i + 1) {

            
            if (x >= 0) {
                System.out.print("정수를입력하세요:");
                x = keyboard.nextInt();
                System.out.println("입력한값은"+x+"입니다");
                
               
            } else {
                System.out.println("정상 종료합니다");
                
                break;
            }
            
        }
    }
}