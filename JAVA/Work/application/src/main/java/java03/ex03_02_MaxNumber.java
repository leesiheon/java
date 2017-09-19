package java03;

import java.util.Scanner;

public class ex03_02_MaxNumber {
    public static void main (String[] args){
        // 정수변수 2개
        int x = 1;
        int y = 0;
        
        //키보드와 프로그램 연결
        Scanner keyboard = new Scanner(System.in);
        
        
        //첫번째 키보드에서 입력 받은 값을 x에 넣는다.
        System.out.println("x의 값을 입력:");
        x = keyboard.nextInt();
        //두번째 키보드에서 입력 받은 값을 y에 넣는다.
        System.out.println("y의 값을 입력:");
        y = keyboard.nextInt();
        
        
        // 연속 if 를사용
        
        //x가 y보다 크다면 x: 7 이라고 출력
        //y가 x보다 작다면 y: 7 이라고 출력
        //x와 y가 같으면 x=y : 7 이라고 출력
        if (x > y){
            System.out.println("x:7");
        } else {
            System.out.println("y:7");
            if (x == y){
                System.out.println("x == y:7");
                }
        }
    }
}