package java01;

import java.util.Scanner;

public class tw01_02 {
    public static void main (String[] args){
        
        //키보드와 프로그램 연결
        Scanner keyboard = new Scanner(System.in);
       
        //Scanner정수입력 출력
        System.out.println("정수를 입력하세요");
        int x = keyboard.nextInt();
        System.out.println(x);
        
        //Scanner를 문자열
        System.out.println("문자열을 입력받고 출력");
        String y = keyboard.next();
        System.out.println(y);
    }
    
}