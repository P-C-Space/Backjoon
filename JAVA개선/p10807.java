import java.util.Scanner;

public class p10807 {
    //총 N개의 정수가 주어졌을 때, 정수 v가 몇 개?
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // N개
        int N = s.nextInt();
        // 배열 생성
        int a[] = new int[N];

        // N개의 수 입력
        for(int i = 0;i<N;i++){
            a[i] = s.nextInt();
        }

        // 찾을 숫자 v
        int find = s.nextInt();
        
        // 개수 카운트
        int count = 0;
        for(int i = 0;i<N;i++){
            if(a[i] == find){
                count++;
            }
        }
        System.out.println(count);

        s.close();
    }
}
