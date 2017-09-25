package test;

public class 구구단 {
    public static void main(String[] args) {
        
        int x = 0;
        for (int i = 1; i <= 9; i = i + 1) {
            x = 2 * i;
            
            System.out.print(2 + "*" + i + "=" + x);
            System.out.print(" ");
            
            if(i==9){
                System.out.print(".");
            }else{
                System.out.print(",");
            }
            
        }
        
    }
}
