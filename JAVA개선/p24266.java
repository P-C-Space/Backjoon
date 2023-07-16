import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p24266 {
    // MenOfPassion(A[], n) {
    //     sum <- 0;
    //     for i <- 1 to n
    //         for j <- 1 to n
    //             for k <- 1 to n
    //                 sum <- sum + A[i] × A[j] × A[k]; # 코드1
    //     return sum;
    // }
    // n^3 => 차수 3
    // 500,000 세제곱 => 1.25e+17 125,000,000,000,000,000
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append(String.valueOf(n*n*n)).append("\n");
        sb.append("3").append("\n");
        System.out.println(sb);
    }
}
