package test;

import java.util.Scanner;

public class jv합격불합격 {
    public static void main(String[] args) {
        
        int grade = 61;
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("점수를 입력하시오:");
        grade = keyboard.nextInt();
        
        
        if (grade >= 60) {
            System.out.println("합격");
            
        } 
        else {
            System.out.println("불");
        }
        
    }
    
}
