import java.util.Scanner;

public class p10813 {
    // basket = N
    // change = M
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();

        String basket[] = new String[N];

        for (int i = 1;i<=N;i++){
            basket[i-1] = String.valueOf(i);
        }
        for(int i = 0;i<M;i++){
            int a = s.nextInt(); // 바꿀위치 1
            int b = s.nextInt(); // 바꿀위치 2
            String temp;
            temp = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = temp;
        }
        for (int i =0;i<N;i++){
            System.out.print(basket[i]+" ");
        }

        s.close();
    }
}
