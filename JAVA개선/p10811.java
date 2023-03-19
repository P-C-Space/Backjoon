import java.util.Arrays;
import java.util.Scanner;

public class p10811 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();

        String bowl[] = new String[N];
        
        for(int i =0;i<N;i++){
            bowl[i] = Integer.toString(i+1);
        }
        for(int i =0;i<M;i++)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            String temp[] = new String[b-a+1];
            int count = 0;
            for (int j = b-1;j>=a-1;j--){
                temp[count++] = bowl[j];
            }
            count = 0;
            for (int k = a-1;k<b;k++){
                bowl[k] = temp[count++];
            }
            
        }

        for(int i =0;i<bowl.length;i++){
            System.out.print(bowl[i]+" ");
        }

        s.close();
    }
}
