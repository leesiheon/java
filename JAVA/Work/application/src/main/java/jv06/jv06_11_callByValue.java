package jv06;

public class jv06_11_callByValue {
    public static void main(String[] args) {
        
        // 변수의 선언의 초기화
        int a = 5;
        int b = 3;
        
        System.out.println("swap전: a=" + a + ", b=" + b);
        swap(a, b);
        System.out.println("swap후: a=" + a + ", b=" + b);
    }
    
    private static void swap(int a, int b) {
        
        // a-->b, b-->a
        int temp = 0;
        temp = b;
        b = a;
        a = temp;
        System.out.println("swap 안: a=" + a + ", b=" + b);
    }
}
