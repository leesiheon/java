package jv04;

import java.util.Scanner;

public class ex04_12_구구단 {
    public static void main(String[] args) {
        
        int r = 0;
        Scanner keyboard = new Scanner(System.in);
        int 시작값 = keyboard.nextInt();
        
        
        
        for (int i = 2; i <= 19; i = i + 1) {
            System.out.println();
            
            
            for (int j = 1; j <= 9; j = j + 1) {
                
                r = i * j;
                
                System.out.print(i + "*" + j + "=" + r);
                if(j == 9) {
                    System.out.print( " . " );
                }
                else { 
                    System.out.print( " , " );
                }
            }
        }
    }
}
