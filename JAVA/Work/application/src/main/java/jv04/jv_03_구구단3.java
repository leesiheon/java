package jv04;

public class jv_03_구구단3 {
    public static void main(String[] args) {
        int z = 0;
        for (int i = 1; i <= 9; i = i + 1) {
            z = 2 * i;
            System.out.print(2 + "*" + i + "=" + z);
            
            if (i == 9) {
                System.out.println(".");
            } else {
                System.out.println(",");
            }
        }
    }
    
}
