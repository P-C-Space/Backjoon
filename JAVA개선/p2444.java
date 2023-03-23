import java.util.Scanner;

public class p2444 {
    public static void main(String[] args){
        
        // 별찍기
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        
        // 상단
        for(int i = 0;i<N*2-2;i+=2){
            for(int j =N*2-2;j>i;j-=2){
                System.out.print(" ");
            }

            for(int k = 0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 하단
        for(int i =N*2-2;i>0;i-=2){
            for(int j =N*2;j>i;j-=2){
                System.out.print("*");
            }
            for(int k = 0;k<i+2;k++){
                System.out.print(" ");
            }


         
            System.out.println();
        }


        s.close();
    }
}
