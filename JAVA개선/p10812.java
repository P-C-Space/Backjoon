import java.util.Scanner;

public class p10812 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();
        s.nextLine();
        String bowl[] = new String[N];
        for(int i =0;i<N;i++){
            bowl[i] = Integer.toString(i+1);
        }
        for(int i =0;i<M;i++){ // 5번 반복
            int begin = s.nextInt()-1;
            int end = s.nextInt()-1;
            int mid = s.nextInt()-1;
            s.nextLine();
            String tmp[] = new String[end-begin+1];
            int count = 0;
            for(int j = mid;j<=end;j++){
                tmp[count++] = bowl[j];
            }
            for(int j = begin;j<mid;j++){
                tmp[count++] = bowl[j];
            }
            count = 0;
            for(int j = begin;j<=end;j++){
                bowl[j] = tmp[count++];
            }
        }
        for(int i =0;i<N;i++){
            System.out.print(bowl[i]+" ");
        }

        s.close();
    }
}
