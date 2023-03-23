import java.util.Scanner;

public class p3003 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);

        // 체스판 기준
        int chess[] = {1,1,2,2,2,8};

        for(int i =0;i<chess.length;i++){
            chess[i] -= s.nextInt();
            System.out.print(chess[i]+" ");
        }

        s.close();
    }
}
