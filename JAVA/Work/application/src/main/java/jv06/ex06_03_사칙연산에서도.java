package jv06;

import java.util.Scanner;

public class ex06_03_사칙연산에서도 {
    public static void main(String [] args ){

        int firstNum  = 0;
        int secondNum = 0;
        int    result = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("첫번째숫자를 입력하세요 : ");
        firstNum = keyboard.nextInt(); // 정수 입력

        System.out.print("두번째숫자를 입력하세요 : ");
        secondNum = keyboard.nextInt(); // 정수 입력

        // 더하기 연산 후 출력
        result = Add(firstNum, secondNum);
        System.out.println( result );

        // 빼기 연산 후 출력
        result = Minus(firstNum, secondNum);
        System.out.println( result );

        // 곱하기 연산 후 출력
        result = Mul(firstNum, secondNum);
        System.out.println( result );

        // 나머지 연산 후 출력
        double result1 = Div(firstNum, secondNum);
        System.out.println( result );
    }

    public static double Div(int firstNum, int secondNum) {
        double result = (double)firstNum / secondNum;
        return result;
    }

    public static int Mul(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static int Minus(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static int Add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}