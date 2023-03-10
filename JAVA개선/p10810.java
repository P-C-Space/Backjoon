import java.util.Arrays;
import java.util.Scanner;

public class p10810 {
    // 1번부터 N개의 바구니
    // 처음 바구니 공이 없음
    // 바구니 하나당 공 한개
    // M번 반복하여 공을 넣음
    // 1 2 3 1번부터 2번바구니까지 3번공
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();

        int bowl[] = new int[N];
        
        // 0 Initialization
        Arrays.fill(bowl,0);

        for(int i =0;i<M;i++)
        {
            int start = s.nextInt();
            int end = s.nextInt();
            int n = s.nextInt();
            for(int j = start-1;j<end;j++){
                bowl[j] = n;
            }
        }

        for(int i =0;i<bowl.length;i++){
            System.out.print(Integer.toString(bowl[i])+" ");
        }

        s.close();
    }
}
