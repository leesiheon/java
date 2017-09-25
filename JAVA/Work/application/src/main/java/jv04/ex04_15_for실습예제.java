package jv04;

public class ex04_15_for실습예제 {
    public static void main(String[] args) {
        int x =0;
        for (int i = 9; i >= 1; i = i - 1) {
             x= 2*i;
            System.out.print(2+"*"+i+"="+x);
            if(i==1){
                System.out.print(".");
            }else 
            System.out.print(",");
            
        }
    }
    
}
