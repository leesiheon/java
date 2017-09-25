package java01;

import java.util.Scanner;

public class tw_01_03 {
    public static void main (String[] args){
        //salary 정수 변수 선언
        int salary = 0; 
        
        //deposit 정수 변수 선언
        int deposit = 1;
        
        //키보드와 프로그램 연결 :Scanner 사용
        Scanner keyboard = new Scanner(System.in);
        
        //scanner를 이용해서 정수 입력받고 salary 변수에 저장
        System.out.println("정수를 입력하세요:");
        salary = keyboard.nextInt();
        
        //10년치 월급의 총합 
        deposit = 12*10*salary;
        
        //10년동안의 저축액 ???원형태로 출력
        System.out.println("10년동안의 저축액 +  deposit");
        
        
        
    }
    
}
