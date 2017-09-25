package jv04;

import java.util.Scanner;

public class ex04_22_무한구구단 {

        public static void main(String[] args) {

            int temp;
            Scanner input = new Scanner(System.in);
            
            for( ; true; ){
                System.out.print("시작 단수입력:");
                int 시작 = input.nextInt();
                System.out.print("끝 단수입력:");
                int 끝 = input.nextInt();
                
                if(시작 == 0 || 끝 ==0) {
                    break;
                }
                
                if(시작 > 끝){
                    temp = 끝;
                    끝 = 시작;
                    시작 = temp;
                }
                
                // step2. 구구단 출력
                for(int i=시작; i<=끝; i++){
                    for(int j=1; j<10; j++){
                        System.out.format("%dX%d=%d", i, j, i*j);

                        if( j==9 ) {
                            System.out.print(".\n"); //System.out.println(".");
                        }
                        else {
                            System.out.print(", ");
                        }
                    }
                }
            }

            System.out.print("프로그램 종료\n");
        }    
    }