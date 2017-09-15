package java01;

//표준 출력으로 "hello world"를 표시하는 간단한 자바 애플리케이션의 구현이다.


public class java_01_01_hello {
    public static void main(String args[]) { 
        System.out.println("hello world!"); //문자열 출력
    
        System.out.println("hello, World!!!");
        System.out.println("이름");

        System.out.print(" . it's me");
        System.out.print(" . i like \n you.");
    
        System.out.print("\n");
        System.out.println("");
        System.out.println(); // == System.out.println("");
        
        System.out.format("내 이름 %s 나이%d", "sejoong", 132);
        
        
    
    }
}