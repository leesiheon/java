package java02;


public class jv02_16_비교논리결합2 {
    public static void main (String[] args){
        // 정수 변수 선언 & 초기화
        int x = 1;
        int y = 1;
        int a = ++x*2; //a의 값은
        int b = y++*2; //b의 값은
        
        System.out.println( (x == y ) && (x != y)             ); //
        
        System.out.println( (x >  y ) || (x <  y)             ); //
        
        System.out.println( (x >= y ) || (x <= y)             ); //
        
        System.out.println( (x == y ) && (x != y) || (x < y)  ); //
      
            
    }
    
}