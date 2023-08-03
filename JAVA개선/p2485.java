import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> tree = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            tree.add(Integer.parseInt(br.readLine()));
        }

        int gcd = 0;

        for (int j = 0; j < N - 1; j++) {
            int dc = tree.get(j + 1) - tree.get(j);
            gcd = GCD(dc,gcd);
        }

        System.out.println(( tree.get(N-1)-tree.get(0) ) / gcd + 1 - N );

    }

    static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
