import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //long beforeTime = System.currentTimeMillis();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            else if (n == 1) {
                sb.append(1).append("\n");
            }

            else {
                int count = 0;
                boolean is_prime;
                for (int i = n + 1; i <= 2 * n; i++) {
                    is_prime = true;
                    for(int j = 2;j < i;j++){
                        if(i % j == 0){
                            is_prime = false;
                            break;
                        }
                    }

                    if(is_prime){
                        count++;
                    }
                }
                sb.append(count).append("\n");
            }
        }
        System.out.println(sb);
        // long afterTime = System.currentTimeMillis(); 
        // long secDiffTime = (afterTime - beforeTime)/1000;
        // System.out.println("Time : " + secDiffTime + "ms");
    }
}
