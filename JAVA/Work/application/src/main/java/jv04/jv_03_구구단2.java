package jv04;

public class jv_03_구구단2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i = i + 1) {
            int x = 2 * 1;
            System.out.print(2 + "*" + i + "=" + x);
            
            if (i == 9) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }
            
        }
    }
    
}
