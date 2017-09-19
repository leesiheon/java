package java03;

import java.util.Scanner;

public class jv03_04_연속ifelse {
    public static void main (String[] args){
        
        
        //키보드 입력 받기
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int x = keyboard.nextInt();
        
        //키보드 입력값 출력하기
        System.out.println(x);
        
        if( x >= 90) {
            System.out.println("A");
            
        }
        
        else if( x >= 80 ){
            System.out.println("B"); 
        }
        else if (x >= 70 ){
            System.out.println("C");
        }
        else if (x>=60){
                System.out.println("D");
            }
            else {
                System.out.println("F");
                    }
    }
}