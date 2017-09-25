package test;


public class ex04_13_for실습예제 {
public static void main(String[] args) {
        
        for (int i = 1; i <= 9; i = i + 1) {
            
            int x = 2 * i;
            
            System.out.print( 2 +  "*"  +  i  +  "="  + x  );
          
            System.out.print( " " );
            
            if(i == 9) {
                System.out.print( " . " );
            }
            else { 
                System.out.print( " , " );
            }
            
            
        
            
        }
        
    }
}