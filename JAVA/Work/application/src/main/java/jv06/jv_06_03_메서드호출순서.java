package jv06;

public class jv_06_03_메서드호출순서 {
    public static void main(String[] args) { // caller
        int a = 3, b = 4;
        int sum = Add(a, b);
        System.out.print(sum);
    }
    
    public static int Add(int i, int j) {// callee
        int result = i + j;
        return result; // return type은 int
    }
}
