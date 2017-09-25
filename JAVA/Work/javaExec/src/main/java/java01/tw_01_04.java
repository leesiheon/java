package java01;

import java.util.Scanner;

public class tw_01_04 {
    public static void main (String [] args){
        int w = 0;
        int h = 0;
        
        int area = 0;
        int perimeter = 0;
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("사각형의 가로길이");
        w=keyboard.nextInt();
        System.out.println("사각형의 세로길이");
        h=keyboard.nextInt();
        
        
        area = w*h;
        perimeter = 2*(w+h);
        
        System.out.println("사각형의 넓이:" + area);
        System.out.println("사각형의 둘레:" + perimeter);
             
    }
    
}
