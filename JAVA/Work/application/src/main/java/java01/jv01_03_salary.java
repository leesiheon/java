package java01;

import java.util.Scanner;

public class jv01_03_salary {
    
    public static void main( String [] args) {
    int salary = 0; // 월급
    int deposit = 0; // 저축액
    
    Scanner Keyboard = new Scanner(System.in);
    System.out.println("월급을 입력하시오");
    salary = Keyboard.nextInt(); //값을 입력 받아 변수에 저장
    
    deposit = 10*12*salary;
   
    System.out.println("10년동안 저축액: " + deposit);
   

    }
    
}