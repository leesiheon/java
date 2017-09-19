package java01;

import java.util.Scanner;

public class jv01_02_scanner {
    public static void main (String[] args){
        
        Scanner keyboard = new Scanner(System.in); //키보드와 프로그램을 연결
        System.out.println("정수를 입력하세요:");  //메시지 출력(행동지시)
        int x = keyboard.nextInt();                //10을 넣는다 x에
        
        System.out.println("문자를 입력하세요:");
        String y = keyboard.next();                //문자열 입력
        
        
        

    
}
}