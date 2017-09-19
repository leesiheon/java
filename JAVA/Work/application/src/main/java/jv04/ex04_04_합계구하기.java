package jv04;

import java.util.Scanner;

public class ex04_04_합계구하기 {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("시작값을 입력하세요");
        int 시작값 = keyboard.nextInt();
        
        System.out.println("종료값을 입력하세요");
        int 종료값 = keyboard.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= 4; i = i + 1) {
            sum = sum + i;
            System.out.println("합은" + sum);
        }
    }
}
