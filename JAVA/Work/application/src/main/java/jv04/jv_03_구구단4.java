package jv04;


public class jv_03_구구단4 {
    public static void main (String[] args){
        int x =0;
        for (int i=1; i<=9; i=i+1){
            x= 2*i;
            System.out.print(2+"*"+i+"="+x);
            
            if(i==9){
                System.out.print(".");
            }else {
                System.out.print(",");
            }
        }
    }
    
}
