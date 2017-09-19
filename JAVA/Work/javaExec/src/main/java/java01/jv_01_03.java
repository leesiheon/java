package java01;

import java.util.Scanner;

public class jv_01_03 {
    public static void main (String []args ){
        
        //메인 메서드 만들기
        
        
        //salary 정수 변수 선언
        int salary = 0;
        
        //deposit 정수 변수 선언
        int deposit = 1;
        
        
        //scanner를 이용해서 월급을 입력받고 salary에 저장하시오
        Scanner keyboard = new Scanner(System.in); //키보드와 프로그램 연결
        System.out.println("월급을 입력하시오:");        
        salary = keyboard.nextInt(); //값을 입력 받아 salary 공간에 저장
        
        //10년치 월급의 총합을 구하고 그 값을 deposit에 저장하시오
        deposit = 10*12*salary;
        
        
        //10년 동안의 저축액" ????원형태로 출력하시오
        System.out.println("10년동안의저축액:" + deposit);
        
        
        //반드시 10년 동안의 저축액" 이라는 텍스트가 출력되게 하시오
        
    }
    
}
