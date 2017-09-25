package test;

import java.util.Scanner;

public class ex_04_04_합계구하기2 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int sum = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("시작값:");
        x = keyboard.nextInt();
        
        System.out.println("종료값:");
        y = keyboard.nextInt();
        
        
        for (int i = 1; i <= 4; i = i + 1) {
            sum = sum + i;
            
            if (i == 5){
                System.out.print("");
            }
            else {
                System.out.print("+");
            }
         
        }
        
    }
    
}
