package java03;


public class ex04_14_for실습예제2 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 9; i = i + 1) {
            
            int x = 2 * i;
            
            System.out.print( 2 +  "*"  +  i  +  "="  + x  );
          
            System.out.print( " " );
            
            if(i == 9) {
                System.out.print( " . " );
            }
            else { 
                System.out.println( " , " );
            }
            
            
        
            
        }
        
    }
}
    