package jv04;

public class jv04_21_무한루프 {
    public static void main(String[] args) {
        for (int i = 0; true; i = i + 1) {
            System.out.println("무한루프:::" + i);
            
            // i>100리면 루프탈출
            if (i > 100) {
                break;
            }
        }
    }
}
