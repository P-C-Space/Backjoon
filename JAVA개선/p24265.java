import java.io.BufferedReader;
import java.io.IOException;

public class p24265 {

    // MenOfPassion(A[], n) {
    //     sum <- 0;
    //     for i <- 1 to n - 1
    //         for j <- i + 1 to n
    //             sum <- sum + A[i] × A[j]; # 코드1
    //     return sum;
    //}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        
        int count = 0;
        for(int i =0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                count++;
            }
        }
        System.out.println(count);
    }
}
