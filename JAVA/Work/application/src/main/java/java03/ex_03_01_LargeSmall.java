package java03;

import java.util.Scanner;

public class ex_03_01_LargeSmall {
    public static void main (String[] args){
        int n = 101;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("점수입력:");
        n = keyboard.nextInt();
                
                
        if (n >=100){
            System.out.println("large");
        } else  {
            System.out.println("samll");
        }
    }
}
