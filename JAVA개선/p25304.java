import java.util.Scanner;

public class p25304 {
    // 총 금액 X
    // 물건의 종류 수 N
    // 물건의 가격 a 와 개수 b
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        // 총 금액 입력
        Long X = s.nextLong();
        // 물건의 종류 수 입력
        int N = s.nextInt();
        
        // 총금액에서 물건의 가격 * 개수 만큼 계속하여 뺀다
        for(int i = 0;i<N;i++){
            int a = s.nextInt();
            int b = s.nextInt();
            X -= ( a * b );
        }

        // 0 이면 Yes
        if (X == 0){
            System.out.print("Yes");
        }
        // 아니면 No
        else{
            System.out.print("No");
        } 


        s.close();
    }
}
