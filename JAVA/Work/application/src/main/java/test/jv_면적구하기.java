package test;

import java.util.Scanner;

public class jv_면적구하기 {
    public static void main (String[] args){
        int w =3;
        int h =10;
        int area =0;
        int perimeter =0;
        
        area = w*h;
        perimeter = 2*(w+h);
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("가로길이:");
        w = keyboard.nextInt();
        
        System.out.print("세로길이:");
        h = keyboard.nextInt();

        System.out.println("넓이:"+area);
        System.out.println("둘레:"+perimeter);
        
    }
    
}
