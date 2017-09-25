package jv06;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class jv06_01_왜매서드를쓰는가3 {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 20; i <= 40; i = i + 1) {
            sum = sum + i;
        }
        System.out.println("합계는:" + sum);
    }
}
