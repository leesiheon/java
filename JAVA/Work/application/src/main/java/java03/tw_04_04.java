package java03;

import java.util.Scanner;

public class tw_04_04 {
    public static void main(String[] args) {
        // 키보드 프로그램 연결
        Scanner keyboard = new Scanner(System.in);
        
        // scanner 를 이용해서 정수를 입력받고 "시작값" 변수에 저장
        System.out.println("시작값:");
        int 시작 = keyboard.nextInt();
        
        // scanner 를 이용해서 정수를 입력받고 "종료값" 변수에 저장
        System.out.println("종료값:");
        int 종료 = keyboard.nextInt();
        int sum = 0;
        
        
        if (시작 > 종료) {
            for (int i = 1; i <= 1; i = i + 1) {
                sum = sum + i;
            }
            System.out.println();
        } else {
            for (int i = 1; i <= 1; i = i + 1) {
                sum = sum + i;
                System.out.println();
            }
        }
    }
}
