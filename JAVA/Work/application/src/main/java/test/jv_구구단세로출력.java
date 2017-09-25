package test;

public class jv_구구단세로출력 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 2; i <= 19; i = i + 1) {
            
            for (int j = 1; j <= 9; j = j + 1) {
                x = i * j;
                System.out.println(i + "*" + j + "=" + x);
            }
        }
    }
}