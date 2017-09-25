package java03;

import java.util.Scanner;

public class jv03_maxnumber3 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("x:");
        x = keyboard.nextInt();
        
        System.out.print("y:");
        y = keyboard.nextInt();
        
        
        if(x>y) {
            System.out.println("x!");
        }else {
            System.out.println("y!");
        }
         
        
    }
    
}
