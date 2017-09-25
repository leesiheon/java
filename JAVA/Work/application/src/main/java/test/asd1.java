package test;

public class asd1 {
    public static void main(String[] args) {
        
        int r = 0;
        
        
        for (int i = 2; i <= 19; i = i + 1) {
            System.out.println();
            
            
            for (int j = 1; j <= 9; j = j + 1) {
                
                r = i * j;
                
                System.out.print(i + "*" + j + "=" + r);
                if(j == 9) {
                    System.out.print( " . " );
                }
                else { 
                    System.out.print( " , " );
                }
                // System.out.format("%2d * %d = %3d ", i , j , r );
            }
            
            // System.out.format("%d * %d = %d \n", i , j , r );
            // System.out.format("%2d * %3d = %5d \n", i , j , r );
            // System.out.println();
        }
    }
}
