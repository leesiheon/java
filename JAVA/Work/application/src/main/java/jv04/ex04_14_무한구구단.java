package jv04;

import java.util.Scanner;

public class ex04_14_무한구구단 {
    public static void main(String[] args) {
        //키보드연결:한번만
        
        Scanner keyboard = new Scanner(System.in);
        
        //무한루프만들기
            //키보드로부터 시작단 입력받기
                
        
                   //키보드로부터 종료단 입력받기
        int x = 0;
        System.out.print("정수를입력하세요:");
        x = keyboard.nextInt();
        
        for (int i = 0; true; i = i + 1) {
            
            if (x >= 0) {
                System.out.println("입력한값은" + x + "입니다");
                System.out.print("정수를입력하세요:");
                x = keyboard.nextInt();
                
            } else {
                System.out.println("정상 종료합니다");
                
                break;
            }
        }
    }
}
