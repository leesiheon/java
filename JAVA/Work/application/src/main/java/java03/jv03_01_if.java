package java03;

import java.util.Scanner;

public class jv03_01_if {
    public static void main (String[] args){
        
        int grade = 100;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        
        
        grade = keyboard.nextInt(); //정수입력
        
        if ( grade >= 60)
        
        {
            System.out.println("합격입니다.");
            System.out.println("장학금도 받을 수 있습니다.");
            
        }
    }
    
}
